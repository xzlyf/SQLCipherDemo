package com.xz.sqlcipherdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.xz.sqlcipherdemo.sql.DBManager;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		//清空数据
		DBManager.getInstance(MainActivity.this).deleteDatas();
		//插入数据
		for (int i = 0; i < 10; i++) {
			DBManager.getInstance(MainActivity.this).insertData(String.valueOf(i));
		}
		//删除数据
		DBManager.getInstance(MainActivity.this).deleteData(String.valueOf(5));
		//更新数据
		DBManager.getInstance(MainActivity.this).updateData(String.valueOf(3));
		//查询数据
		DBManager.getInstance(MainActivity.this).queryDatas();
	}
}
