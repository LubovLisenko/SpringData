package com.example.springData.Service;


import com.example.springData.Entity.Note;
import com.example.springData.Repository.NoteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@RequiredArgsConstructor
@Service
public class NoteService {
    private final NoteRepository noteRepository;

    public List<Note> listAll(){
       return noteRepository.findAll();
    }

    public void add(Note note){
        noteRepository.save(note);
    }

    public Note getById(Long id){
      return   noteRepository.findById(id)
                .orElseThrow(()-> new IllegalArgumentException("Write right Id"));
    }

    public void deleteById(Long id){
        noteRepository.deleteById(id);
    }

    public void update(Note note){
        getById(note.getId());
        noteRepository.save(note);
    }
}
