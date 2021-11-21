package com.CourseManagement.App.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.CourseManagement.App.Entity.courseManagement;

@Service
public class CourseService {
	
	private List<courseManagement> topics = new ArrayList<>(Arrays.asList(
	           new courseManagement("Spring","Spring Framework","Spring_Frmework Description",25000),
	           new courseManagement("Java","core java","Core Java Description",25000),
                new courseManagement("JDBC"," Hibernate Framework","hibernate_Frmework Description",25000),
       	new courseManagement("Spring","Structs Framework","Structs_Frmework Description",25000),
	             new courseManagement("Spring_IOc","Spring Bootk","Spring_Frmework Description",25000)));

public List<courseManagement> getAllCourse(){
	
	return topics;
	
}

public courseManagement getCourseManagement(String id)
{
 	return topics.stream().filter(t -> t.getCourseId().equals(id)).findFirst().get();
}

public void addcourse(courseManagement course) {
	// TODO Auto-generated method stub
	 topics.add(course);
	
	
}

public void updatecourse(String id, courseManagement course) {
	// TODO Auto-generated method stub
	for(int i=0;i< topics.size();i++)
	{
		courseManagement t = topics.get(i);
		if(t.getCourseId().equals(id))
		{
			topics.set(i, course);
			return;
		}
	}
	
	
}

public void delteTopic(String id) {
	// TODO Auto-generated method stub
	topics.removeIf(t -> t.getCourseId().equals(id));
}
}

	

