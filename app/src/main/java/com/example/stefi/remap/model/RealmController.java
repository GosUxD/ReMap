package com.example.stefi.remap.model;

import android.content.Context;
import android.location.Location;

import java.util.ArrayList;

import io.realm.Realm;
import io.realm.RealmObject;
import io.realm.RealmResults;

/**
 * Created by Stefi on 19.01.2017.
 */

public class RealmController  {

    Realm myRealm;

    public RealmController(Context mContext) {
        myRealm = Realm.getInstance(mContext);
    }


    public void insertInDb(String desc, String data, String vreme, Double lat, Double lon) {
        myRealm.beginTransaction();
        // Create an object
        Task task = myRealm.createObject(Task.class);
        // Set its fields
        task.setDescription(desc);
        task.setData(data);
        task.setVreme(vreme);
        task.setLat(lat.toString());
        task.setLon(lon.toString());

        myRealm.commitTransaction();
    }

    public ArrayList<Task> getTasks() {
        ArrayList<Task> taskovi = new ArrayList<>();
        RealmResults<Task> results1 =
                myRealm.where(Task.class).findAll();

        for (int i = 0; i < results1.size(); i++) {
            taskovi.add(new Task(
                    results1.get(i).getDescription(),
                    results1.get(i).getData(),
                    results1.get(i).getVreme(),
                    results1.get(i).getLat(),
                    results1.get(i).getLon()
                    ));
        }

        return taskovi;
    }




}
