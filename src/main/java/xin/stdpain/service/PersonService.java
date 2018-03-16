package xin.stdpain.service;

import org.springframework.stereotype.Service;
import xin.stdpain.domain.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 维C果糖 on 2017/1/26.
 */

@Service
public class PersonService {  // 模拟内存数据库，准备数据
    // 声明一个容器
    private static Map<Integer, Person> map = new HashMap<Integer, Person>();
    
    // 初始化 id
    private static Integer id = 1;

    // 利用静态块初始化数据
    static {
        for (int i = 0; i < 10; i++) {
            Person p = new Person();
            id++; 
            p.setId(id);
            p.setName("Charie"+id);
            p.setAge(10+id);
            map.put(id,p);
        }
    }
    // 获得一个 Person 对象
    public Person get(Integer id) {
        return map.get(id);
    }

    
    // 获取人员列表
    public List<Person> findAll(){
        // 将 map 对象转换为 list 结合
        return new ArrayList(map.values());
    }
    
    // 新增人员信息
    public void insert(Person p) {
        id++;
        p.setId(id);
        map.put(id, p);
    }
    
    // 修改人员信息
    public void update(Person p) {
        map.put(p.getId(), p);
    }

    // 删除单条记录
    public void deleteById(Integer id) {
        map.remove(id);
    }
    
}