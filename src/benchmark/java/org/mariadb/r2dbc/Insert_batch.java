// SPDX-License-Identifier: Apache-2.0
// Copyright (c) 2020-2022 MariaDB Corporation Ab

package org.mariadb.r2dbc;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.infra.Blackhole;
import reactor.core.publisher.Flux;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Insert_batch extends Common {

  static final List<String> chars = new ArrayList<>();
  static {
    chars.addAll(Arrays.asList("123456789abcdefghijklmnop\\Z".split("")));
    chars.add("😎");
    chars.add("🌶");
    chars.add("🎤");
    chars.add("🥂");
  }

  static public String randomString(int length) {
    StringBuilder result = new StringBuilder();
    for (int i = length; i > 0; --i) result.append(chars.get(Math.round((int) Math.random() * (chars.size() - 1))));
    return result.toString();
  }

  @Benchmark
  public Integer testR2dbc(MyState state, Blackhole blackhole) throws Throwable {
    return consume(state.r2dbc, blackhole);
  }

  @Benchmark
  public Integer testR2dbcPrepare(MyState state, Blackhole blackhole) throws Throwable {
    return consume(state.r2dbcPrepare, blackhole);
  }

  private Integer consume(io.r2dbc.spi.Connection connection, Blackhole blackhole) {
    String s = randomString(100);

    io.r2dbc.spi.Statement statement = connection.createStatement("INSERT INTO perfTestTextBatch(t0) VALUES (?)");
    for (int i = 0; i < 100; i++) {
      if (i != 0) statement.add();
      statement.bind(0, s);
    }

    return
        Flux.from(statement.execute())
            .flatMap(it -> it.getRowsUpdated())
            .blockLast();
  }
}