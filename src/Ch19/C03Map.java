package Ch19;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C03Map {

	public static void main(String[] args) {
		//Map객체 생성
		Map<String,Integer> map = new HashMap();
		
		//추가
		map.put("aaa", 1234);
		map.put("bbb", 2222);
		map.put("ccc", 3333);
		map.put("ddd", 4444);
		map.put("ddd", 1234);	//중복 K:V - 나중에 저장된 K:V적용
		//개수
		System.out.println("저장 수 : " +map.size());
		
		//전체 조회
		Set<String> set = map.keySet();
		for(String key:set) {
			System.out.printf("KEY : %s VAL : %d\n", key,map.get(key));
		}
		//삭제
		map.remove("aaa");
		//개수
		System.out.println("저장 수 : "+map.size());
	}

}
