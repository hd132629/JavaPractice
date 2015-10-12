package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MelonGenreChart {

	public static void main(String[] args) {
		/*
		List<Music> list = new ArrayList<Music>();
		
		list.add(new Music("바람이나 좀 쐐", "개리"));
		list.add(new Music("보통연애", "박경"));
		list.add(new Music("취향저격", "iKON"));
		
		System.out.println("--<<멜론 차트>>--");
		printList(list);

		list.add(1, new Music("레옹", "이유갓지"));
		System.out.println("--<<2위 곡 추가>>--");
		printList(list);

		list.set(2, new Music("맙소사", "황태지"));
		System.out.println("--<<3위 곡 변경>>--");
		printList(list);

		list.remove(3);
		System.out.println("--<<4위 곡 삭제>>--");
		printList(list);
		
		list.clear();
		System.out.println("--<<전체 리스트 삭제>>--");
		printList(list);
		*/

		Map<String, List<Music>> map = new HashMap<String, List<Music>>();
		
		List<Music> ballad = new ArrayList<Music>();
		ballad.add(new Music("내 첫사랑", "베리굿"));
		ballad.add(new Music("또 다시 사랑", "임창정"));
		ballad.add(new Music("부산에 가면", "박진영"));
		
		List<Music> dance = new ArrayList<Music>();
		dance.add(new Music("커피", "유재환,김예림"));
		dance.add(new Music("다 잘될거야", "쿨"));
		
		map.put("발라드", ballad);  
		map.put("댄스", dance);
		
		System.out.println("-----<<멜론 장르별 차트>>-----");
		printMap(map);
		

		System.out.println("-----<<발라드 3위 곡 변경>>-----");
		map.get("발라드").set(2, new Music("지우고 지워도", "차수경"));
		printMap(map);
		

		System.out.println("-----<<발라드 1위 곡 삭제>>-----");
		map.get("발라드").remove(0);
		printMap(map);
	}
	/*
	public static void printList(List<Music> list){
		int i=1;
		for(Music s : list) {
			System.out.println(i++ + "." + s);
		}
		System.out.println();
	}
	*/ 
	public static void printMap(Map<String, List<Music>> map){
		for(String key : map.keySet()){
			int i=1;
			
			System.out.println("[" + key + "]");
			for(Music music : map.get(key)){
				System.out.println(i + ". " + music.toString());
				i++;
			}
		}
	}
}
