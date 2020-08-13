package com.myspring.RedditCLone.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubredditDto {
	
	private Long id;
	private String name;
	private String description;
	private Integer numberOfPosts;

}
