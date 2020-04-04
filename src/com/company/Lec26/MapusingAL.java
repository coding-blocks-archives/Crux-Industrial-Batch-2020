package com.company.Lec26;

import java.util.ArrayList;
import java.util.LinkedList;

public class MapusingAL<K,V> {

    ArrayList<LinkedList<Entity>> entities;
    float lf=0.5f;
    int size=0;

    public MapusingAL(){
        this.entities = new ArrayList<>();

        for (int i = 0; i <5 ; i++) {
            entities.add(new LinkedList<>());
        }
    }

    public void add(K key, V value){

        if(((float)(size))/entities.size()>lf){
            rehash();
        }   // Place this at top so that when size gets doubled then the element gets added at new hashcode not the previous one

        int hashcode = Math.abs(key.hashCode()%entities.size());

        LinkedList<Entity> list = entities.get(hashcode);

        for (Entity entity: list) {
            if(entity.key.equals(key)){
                entity.value=value;
                return;
            }
        }

//        if(((float)(size))/entities.size()>lf){
//         rehash();
//        }

        list.add(new Entity(key, value));
        size++;
    }

    private void rehash(){

        System.out.println("doubled");

        ArrayList<LinkedList<Entity>> old =entities;

        entities=new ArrayList<>();

        for (int i = 0; i <old.size()*2 ; i++) {
            entities.add(new LinkedList<>());
        }

        size=0;


        for (LinkedList<Entity> list: old) {

            for(Entity entity: list){

                add(entity.key,entity.value);
            }

        }

    }

    public V get(K key){

        int hashcode = Math.abs(key.hashCode()%entities.size());
        LinkedList<Entity> list = entities.get(hashcode);

        for (Entity entity: list) {

            if(entity.key.equals(key)){
                return entity.value;
            }

        }
        return null;
    }

    public V remove(K key){

        int hashcode = Math.abs(key.hashCode()%entities.size());
        LinkedList<Entity> list = entities.get(hashcode);

        Entity target=null;

        for (Entity entity:list) {
            if(entity.key.equals(key)){
                target=entity;
                break;
            }
        }
        V temp= target.value;
        entities.remove(target);
        size--;
        return temp;
    }


    class Entity{

        K key;
        V value;

        public Entity(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
