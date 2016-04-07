package die.listviewtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static ListView lista;
    private static String [] Names = new String[] {"Tom", "Mark", "Jonh","Jack","Patrick","Peter"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView();
    }
    public void listView(){
        lista = (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.names_list,Names);
        lista.setAdapter(adapter);
        lista.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String value = (String) lista.getItemAtPosition(position);
                        Toast.makeText( MainActivity.this, "Position: "+position+ " value : " + value, Toast.LENGTH_LONG).show();
                    }
                }
        );
    }
}
