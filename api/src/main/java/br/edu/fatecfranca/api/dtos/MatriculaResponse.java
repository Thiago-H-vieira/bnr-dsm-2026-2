package br.edu.fatecfranca.api.dtos;

import java.util.List;

import br.edu.fatecfranca.api.models.*;

public record MatriculaResponse(

    String id,
    String alunoId,
    String turmaId,
    List<Nota> notas,
    Aluno aluno,
    Turma turma) {
    
}
