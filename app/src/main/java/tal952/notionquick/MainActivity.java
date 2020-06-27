package tal952.notionquick;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent sharingIntent = new Intent(Intent.ACTION_SEND);
        sharingIntent.setClassName("notion.id", "notion.local.id.externalsharing.ExternalSharingActivity");
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(Intent.EXTRA_TEXT, "https://tal952.github.io/NotionQuick/");

        startActivity(sharingIntent);
        finish();
    }
}