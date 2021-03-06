// Copyright (c) 2003-2014, Jodd Team (jodd.org). All Rights Reserved.

package jodd.db.oom.tst;

import jodd.db.type.SqlType;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class BooSqlType extends SqlType<Boo> {

	@Override
	public void set(PreparedStatement st, int index, Boo value, int dbSqlType) throws SQLException {
		st.setInt(index, value.value);
	}

	@Override
	public Boo get(ResultSet rs, int index, int dbSqlType) throws SQLException {
		Boo boo = new Boo();
		boo.value = rs.getInt(index);
		return boo;
	}
}
