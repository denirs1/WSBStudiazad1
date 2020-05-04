package com.example.zadaniejeden.repositories;

import com.example.zadaniejeden.model.Song;
import org.springframework.data.repository.CrudRepository;

public interface SongRepository extends CrudRepository<Song, Long> {
}
