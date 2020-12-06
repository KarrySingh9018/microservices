/**
* @author Ramanpreet Singh
*/
package com.learning.photoapp.api.albums.io.controllers;

import com.learning.photoapp.api.albums.data.AlbumEntity;
import com.learning.photoapp.api.albums.service.AlbumsService;
import com.learning.photoapp.api.albums.ui.model.AlbumResponseModel;
import java.util.ArrayList;
import java.util.List;
import org.modelmapper.ModelMapper;
import java.lang.reflect.Type;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/users/{id}/albums")
public class AlbumsController {
    
    @Autowired //Dependecy Injection
    AlbumsService albumsService;
    
    Logger logger = LoggerFactory.getLogger(this.getClass());
    
    /**
    *
    * @return List<AlbumResponseModel> 
    * @param id equals to {id} in the reource uri
    * Method returns the list of albums in dataformat specified in accept header
    * of get request.
    */
    @GetMapping( 
            produces = { 
                MediaType.APPLICATION_JSON_VALUE,
                MediaType.APPLICATION_XML_VALUE,
            })
    public List<AlbumResponseModel> userAlbums(@PathVariable String id) {

        List<AlbumResponseModel> returnValue = new ArrayList<>();
        
        List<AlbumEntity> albumsEntities = albumsService.getAlbums(id);
        
        if(albumsEntities == null || albumsEntities.isEmpty())
        {
            return returnValue;
        }
        
        Type listType = new TypeToken<List<AlbumResponseModel>>(){}.getType();
 
        returnValue = new ModelMapper().map(albumsEntities, listType);
        logger.info("Returning " + returnValue.size() + " albums");
        return returnValue;
    }
}
