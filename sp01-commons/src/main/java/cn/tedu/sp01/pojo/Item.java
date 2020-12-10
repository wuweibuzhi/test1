package cn.tedu.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor   //1111111111111111111
@AllArgsConstructor
public class Item {
	private Integer id;
	private String name;
	private Integer number;
}
