package com.tts.personalizedSite.repository;

import org.springframework.data.repository.CrudRepository;

import com.tts.personalizedSite.model.Site;

public interface SiteRepository 
	extends CrudRepository<Site, Long> {

}
