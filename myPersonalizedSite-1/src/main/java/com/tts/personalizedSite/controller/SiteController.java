package com.tts.personalizedSite.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.tts.personalizedSite.model.Site;
import com.tts.personalizedSite.repository.SiteRepository;

@Controller
public class SiteController {
	
	@Autowired
	private SiteRepository siteRepository;
	
	@GetMapping(value = "/")
	public String index(Site site) {
		return "index";
	}

	@PostMapping(value = "/")
	public String addNewSite(Site site, Model model) {
		siteRepository.save(new Site(site.getName(), site.getEmail(),
				site.getMessage(), site.getSignupDate()));
		model.addAttribute("name", site.getName());
		model.addAttribute("email", site.getEmail());
		model.addAttribute("message", site.getMessage());
		return "show";
	}
}


