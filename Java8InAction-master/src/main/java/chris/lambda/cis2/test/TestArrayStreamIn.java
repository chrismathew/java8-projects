package chris.lambda.cis2.test;

import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.List;

public class TestArrayStreamIn {
	public static int i;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		i = 0;
		List<ConsAssocDto> consAssocDtoList = populateCis2List();
		ConsAssocDto primary = consAssocDtoList.stream().filter(doc -> doc.getRelation().equals("primary") && doc.getConsAssocType() == null)
		.collect(toList()).get(0);
		//.collect(toList());
		System.out.println("value of filtered list : " + primary.getaNumber());
		
		consAssocDtoList.stream()
			.map(doc -> addFile(primary,doc))
			.collect(toList());
			
	}
	
	public static List<String> addFile(ConsAssocDto primary, ConsAssocDto secondary) {
		i++;
		if(secondary.getConsAssocType() != null && secondary.getConsAssocType().equals("consolidate")) {
			//dos something
			System.out.println("CONS TYPE : " + secondary.getConsAssocType() + " value of file type : " + secondary.getFileType() + " value of a number : " + secondary.getaNumber() + i);
		}else if(secondary.getConsAssocType() != null &&  secondary.getConsAssocType().equals("associate")) {
			//do s
			System.out.println("CONS TYPE : " + secondary.getConsAssocType() + " value of file type : " + secondary.getFileType() + " value of a number : " + secondary.getaNumber() + i );
		}
		return null;
	}
	public static List<ConsAssocDto> populateCis2List() {
		
		List<ConsAssocDto> consAssocDtoList = new ArrayList<ConsAssocDto>();
		ConsAssocDto consAssocDto1 = new ConsAssocDto();
		consAssocDto1.setaNumber("222333444");
		consAssocDto1.setFileType("physical");
		consAssocDto1.setRelation("primary");
		consAssocDto1.setConsAssocType(null);
		
		consAssocDtoList.add(consAssocDto1);
		
		ConsAssocDto consAssocDto2 = new ConsAssocDto();
		consAssocDto2.setaNumber("666777888");
		consAssocDto2.setFileType("physical");
		consAssocDto2.setRelation("secondary");
		consAssocDto2.setConsAssocType("consolidate");
		consAssocDtoList.add(consAssocDto2);
		
		ConsAssocDto consAssocDto3 = new ConsAssocDto();
		consAssocDto3.setaNumber("232323234");
		consAssocDto3.setFileType("physical");
		consAssocDto3.setRelation("secondary");
		consAssocDto3.setConsAssocType("associate");
		consAssocDtoList.add(consAssocDto3);
		
		ConsAssocDto consAssocDto4 = new ConsAssocDto();
		consAssocDto4.setaNumber("232323555");
		consAssocDto4.setFileType("physical");
		consAssocDto4.setRelation("secondary");
		consAssocDto4.setConsAssocType("associate");
		consAssocDtoList.add(consAssocDto4);
		
		return consAssocDtoList;
	}

}
