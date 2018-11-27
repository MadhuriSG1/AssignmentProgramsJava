package cliniqueManagement;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
//import java.util.HashMap;
	import java.util.LinkedList;
import java.util.List;

//import java.util.Map;
	import org.codehaus.jackson.map.ObjectMapper;

	public class ClinicUtil {
		public static <T> void writeFile(File file, List<T> list) {//convert java object to json 
			ObjectMapper objectMapper = new ObjectMapper();
			//----
				//Map<String,Object> obj;
			//----
			try {
				objectMapper.writeValue(file, list);
				// obj = new HashMap<>();
				// obj.put(T.class.getSimpleName(), list);

				//objectMapper.writeValue(file, obj);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		public static <T> List<T> readFile(File file, Class<T[]> classs) {//read file and return list
			List<T> list = null;//an ordered list so we can get elements of list by index 
			ObjectMapper objectMapper = new ObjectMapper();//ObjectMapper convert json file to java object and vice versa 
			try {
				list = new LinkedList<T>(Arrays.asList(objectMapper.readValue(file,
						classs)));//reading values from file and store in list
			} catch (IOException e) {
				System.out.println("No data Found");
			}

			return list;
		}

	}

