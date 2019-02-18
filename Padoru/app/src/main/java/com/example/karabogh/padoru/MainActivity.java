package com.example.karabogh.padoru;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.io.IOException;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    private ArrayList<Son> tabSon = new ArrayList<>();
    private MediaPlayer lastSon;
    private int lastPos = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabSon = prepareSon();
        lastSon = tabSon.get(0).getSon();

        GridView gridview = (GridView) findViewById(R.id.gridView);
        SonAdapteur flowerAdapter = new SonAdapteur(this, tabSon);
        gridview.setAdapter(flowerAdapter);
        gridview.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        if(lastSon.isPlaying()) {
            lastSon.stop();
            try {
                lastSon.prepare();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        lastSon = tabSon.get(position).getSon();

        lastSon.start();
    }

    //Insertion des sons : mettre son dans dossier raw puis faire comme ci dessous
    public ArrayList<Son> prepareSon(){
        ArrayList<Son> dataSon = new ArrayList<>();
        Son son;

        son = new Son();
        son.setNomSon("Padoru");
        son.setSon(MediaPlayer.create(getApplicationContext(),R.raw.padoru));
        dataSon.add(son);

        son = new Son();
        son.setNomSon("Omae");
        son.setSon(MediaPlayer.create(getApplicationContext(),R.raw.omae));
        dataSon.add(son);

        son = new Son();
        son.setNomSon("Explosion");
        son.setSon(MediaPlayer.create(getApplicationContext(),R.raw.explosion));
        dataSon.add(son);

        son = new Son();
        son.setNomSon("Tu bluffes");
        son.setSon(MediaPlayer.create(getApplicationContext(),R.raw.bluffes));
        dataSon.add(son);

        son = new Son();
        son.setNomSon("Oof");
        son.setSon(MediaPlayer.create(getApplicationContext(),R.raw.ouf));
        dataSon.add(son);

        son = new Son();
        son.setNomSon("Nico nico");
        son.setSon(MediaPlayer.create(getApplicationContext(),R.raw.niconi));
        dataSon.add(son);

        son = new Son();
        son.setNomSon("Fuck");
        son.setSon(MediaPlayer.create(getApplicationContext(),R.raw.fuck));
        dataSon.add(son);

        son = new Son();
        son.setNomSon("Tuturu");
        son.setSon(MediaPlayer.create(getApplicationContext(),R.raw.tuturu));
        dataSon.add(son);

        son = new Son();
        son.setNomSon("Over 9000");
        son.setSon(MediaPlayer.create(getApplicationContext(),R.raw.over9000));
        dataSon.add(son);

        son = new Son();
        son.setNomSon("Victoire");
        son.setSon(MediaPlayer.create(getApplicationContext(),R.raw.victory));
        dataSon.add(son);

        son = new Son();
        son.setNomSon("On s'en bat ...");
        son.setSon(MediaPlayer.create(getApplicationContext(),R.raw.couilles));
        dataSon.add(son);

        son = new Son();
        son.setNomSon("Piqette Jack");
        son.setSon(MediaPlayer.create(getApplicationContext(),R.raw.piquette));
        dataSon.add(son);

        son = new Son();
        son.setNomSon("Eddy Malou");
        son.setSon(MediaPlayer.create(getApplicationContext(),R.raw.eddy));
        dataSon.add(son);

        son = new Son();
        son.setNomSon("Illuminati");
        son.setSon(MediaPlayer.create(getApplicationContext(),R.raw.illuminati));
        dataSon.add(son);

        son = new Son();
        son.setNomSon("Triste");
        son.setSon(MediaPlayer.create(getApplicationContext(),R.raw.triste));
        dataSon.add(son);

        son = new Son();
        son.setNomSon("Surpise mother");
        son.setSon(MediaPlayer.create(getApplicationContext(),R.raw.surprise));
        dataSon.add(son);

        son = new Son();
        son.setNomSon("Deja vu");
        son.setSon(MediaPlayer.create(getApplicationContext(),R.raw.dejavu));
        dataSon.add(son);

        son = new Son();
        son.setNomSon("Nyan cat");
        son.setSon(MediaPlayer.create(getApplicationContext(),R.raw.nyan));
        dataSon.add(son);

        son = new Son();
        son.setNomSon("Pas souffrir OK");
        son.setSon(MediaPlayer.create(getApplicationContext(),R.raw.passouffrir));
        dataSon.add(son);

        son = new Son();
        son.setNomSon("Philippe !");
        son.setSon(MediaPlayer.create(getApplicationContext(),R.raw.philippe));
        dataSon.add(son);

        son = new Son();
        son.setNomSon("Echec");
        son.setSon(MediaPlayer.create(getApplicationContext(),R.raw.echec));
        dataSon.add(son);

        son = new Son();
        son.setNomSon("WTF");
        son.setSon(MediaPlayer.create(getApplicationContext(),R.raw.wtf));
        dataSon.add(son);

        son = new Son();
        son.setNomSon("Tambour");
        son.setSon(MediaPlayer.create(getApplicationContext(),R.raw.tambour));
        dataSon.add(son);

        son = new Son();
        son.setNomSon("America");
        son.setSon(MediaPlayer.create(getApplicationContext(),R.raw.america));
        dataSon.add(son);

        son = new Son();
        son.setNomSon("Meuh");
        son.setSon(MediaPlayer.create(getApplicationContext(),R.raw.meuh));
        dataSon.add(son);

        son = new Son();
        son.setNomSon("C'est heure duel");
        son.setSon(MediaPlayer.create(getApplicationContext(),R.raw.duel));
        dataSon.add(son);

        son = new Son();
        son.setNomSon("Umu");
        son.setSon(MediaPlayer.create(getApplicationContext(),R.raw.umu));
        dataSon.add(son);

        son = new Son();
        son.setNomSon("Finish him");
        son.setSon(MediaPlayer.create(getApplicationContext(),R.raw.finish));
        dataSon.add(son);

        son = new Son();
        son.setNomSon("See you again");
        son.setSon(MediaPlayer.create(getApplicationContext(),R.raw.seeyou));
        dataSon.add(son);

        son = new Son();
        son.setNomSon("To be continued");
        son.setSon(MediaPlayer.create(getApplicationContext(),R.raw.tobe));
        dataSon.add(son);

        son = new Son();
        son.setNomSon("Zelda récompense");
        son.setSon(MediaPlayer.create(getApplicationContext(),R.raw.zelda));
        dataSon.add(son);

        son = new Son();
        son.setNomSon("It's time to stop");
        son.setSon(MediaPlayer.create(getApplicationContext(),R.raw.timestop));
        dataSon.add(son);

        son = new Son();
        son.setNomSon("URSS");
        son.setSon(MediaPlayer.create(getApplicationContext(),R.raw.urss));
        dataSon.add(son);

        son = new Son();
        son.setNomSon("Oui oui");
        son.setSon(MediaPlayer.create(getApplicationContext(),R.raw.oui));
        dataSon.add(son);

        son = new Son();
        son.setNomSon("Pokemon");
        son.setSon(MediaPlayer.create(getApplicationContext(),R.raw.pokemon));
        dataSon.add(son);


        return dataSon;
    }
}
