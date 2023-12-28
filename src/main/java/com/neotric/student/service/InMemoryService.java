package com.neotric.student.service;

import java.util.HashMap;
import java.util.Map;

public class InMemoryService {
    public HashMap<Integer,String> getStudentMap() {
        StudentMap s = new StudentMap("appu", 123);
        StudentMap ss = new StudentMap("chandu", 234);
        HashMap<Integer, String> map = new HashMap<>();
        addStudentToMap(map, s);
        addStudentToMap(map,ss);

        return map;
    }

        public void addStudentToMap (HashMap < Integer, String > map, StudentMap Student){
            map.put(Student.getRollno(), Student.getName());
        }

        public String getStudentNameByRollNo( int rollNo){
            HashMap<Integer, String> studentMap = getStudentMap();
            return studentMap.get(rollNo);

        }

    }



