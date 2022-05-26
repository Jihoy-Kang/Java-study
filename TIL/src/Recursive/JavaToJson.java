package Recursive;

import java.lang.reflect.Array;
import java.util.*;

public class JavaToJson {
    public static void main(String[] args) {
        String string = "String";
        int num = 123;
        Boolean tr = true;
        String[] arrStr = new String[]{"a","b","c","d"};
        Integer[] arrInt = new Integer[]{1,2,3,4};
        Object[] arrOjt = new Object[]{"a",2,"b",4};
        HashMap<Object,Object> map = new HashMap<Object,Object>();
        map.put("name","Johnny");
        map.put("age",23);

        ChangeType print = new ChangeType();
        System.out.println(map);
        System.out.println(print.changeType(map));
    }
}

class ChangeType{
    public String changeType(Object data){

        //String 입력 시
        if(data instanceof String){
            return "\""+data+"\"";
        }
        //int 입력 시
        else if(data instanceof Integer){
            return Integer.toString((Integer) data);
        }
        //Boolean 입력 시
        else if(data instanceof Boolean){
            return data.toString();
        }
        //String[] 입력 시
        else if(data instanceof String[]){
            String[] arr2 = (String[])data;
            for(int i =0;i<arr2.length;i++){
                arr2[i] = changeType(arr2[i]); // 재귀함수로 다시 돌면서 위 메서드에서 String 타입 변환 후  arr2[i]에 입력
            }
            return Arrays.toString(arr2); //어레이 스트링타입으로 변환 리턴
        }
        //int[] 입력 시
        else if(data instanceof Integer[]){
            Object[] arr3 = (Integer[])data;
            for(int i =0;i<arr3.length;i++){
                arr3[i] = changeType(arr3[i]); // 재귀함수로 다시 돌면서 위 메서드에서 Integer 타입 변환 후  arr3[i]에 입력
            }
            return Arrays.toString(arr3); //어레이 스트링타입으로 변환 리턴
        }
        //Object[] 입력 시
        else if(data instanceof Object[]){
            Object[] arr4 = (Object[])data;
            for(int i =0;i<arr4.length;i++){
                arr4[i] = changeType(arr4[i]); // 재귀함수로 다시 돌면서 위 메서드에서 Object 타입 변환 후  arr4[i]에 입력
            }
            return Arrays.toString(arr4); //어레이 스트링타입으로 변환 리턴
        }
        //Hashmap 입력 시
        else if(data instanceof HashMap){
            HashMap<Object,Object> hashMap = (HashMap<Object,Object>)data; //Hashmap 공부더할것
            HashMap<String,String> result = new HashMap<>();

            for(Map.Entry<Object,Object> d : hashMap.entrySet()){
                String key = changeType(d.getKey());
                String value = changeType(d.getValue());

                result.put(key,value);
            }
            return result.toString().replaceAll("=",":"); //스트링타입으로 변환 리턴, = -> : 변환
        }

        //입력되지 않은 타입 입력시
        return "Null";
    }
}
