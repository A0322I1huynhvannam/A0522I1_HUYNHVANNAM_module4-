package com.example.music.repository;

import com.example.music.model.Music1;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMusicRepository extends JpaRepository<Music1,String> {
    Music1 findBymusicNameContaining(String name);
}
