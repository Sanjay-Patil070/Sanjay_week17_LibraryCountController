package com.GL.Library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.GL.Library.repository.LibraryCountService;

@RestController("/countService")
public class LibraryCountController {

		@Autowired
		LibraryCountService countService;
		
		@GetMapping("/countLibraries")
		public long countLibraries() {
			return countService.countLibraries();
			
		}
}
