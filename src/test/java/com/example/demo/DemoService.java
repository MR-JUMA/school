package com.example.demo;

import java.util.List;
import java.util.Optional;

public interface DemoService {

   Demo saveDemo(Demo demo);
   Demo updateDemo(Demo demo);
   void deleteDemo(Demo demo);
   Optional<Demo> getDemoByID(int id);
   List<Demo> getAllDemos();

}
