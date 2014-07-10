package com.thm.mylistview;

import java.util.ArrayList;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// 1. pass context and data to the custom adapter
        MyAdapter adapter = new MyAdapter(this, generateData());
 
        // 2. Get ListView from activity_main.xml
        ListView listView = (ListView) findViewById(R.id.listview);
 
        // 3. setListAdapter
        listView.setAdapter(adapter);

		
	}
	
	private ArrayList<Item> generateData() {
        ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(R.drawable.puzzle_duell, "Puzzle Duell", "Wer baut schneller das Puzzle?"));
        items.add(new Item(R.drawable.formen_kollision, "Form-Kollision","Wann treffen sich beide Figuren?"));
        items.add(new Item(R.drawable.farbnamen, "Farbnamen","Wer erkennt schneller die Farbe?"));
 
        return items;
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
