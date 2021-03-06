/**
* @author Ramanpreet Singh
*/
package com.learning.photoapp.api.albums.service;

import com.learning.photoapp.api.albums.data.AlbumEntity;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class AlbumsServiceImpl implements AlbumsService {

    @Override
    public List<AlbumEntity> getAlbums(String userId) {
        List<AlbumEntity> returnValue = new ArrayList<>();
        
        AlbumEntity albumEntity = new AlbumEntity();
        albumEntity.setUserId(userId);
        albumEntity.setAlbumId("album1Id");
        albumEntity.setDescription("album 1 description");
        albumEntity.setId(1L);
        albumEntity.setName("album 1 name");
        
        AlbumEntity albumEntity2 = new AlbumEntity();
        albumEntity2.setUserId(userId);
        albumEntity2.setAlbumId("album2Id");
        albumEntity2.setDescription("album 2 description");
        albumEntity2.setId(2L);
        albumEntity2.setName("album 2 name");
        
        AlbumEntity albumEntity3 = new AlbumEntity();
        albumEntity3.setUserId(userId);
        albumEntity3.setAlbumId("album3Id");
        albumEntity3.setDescription("album 3 description");
        albumEntity3.setId(3L);
        albumEntity3.setName("album 3 name");
        
        returnValue.add(albumEntity);
        returnValue.add(albumEntity2);
        returnValue.add(albumEntity3);
        
        return returnValue;
    }
    
}
