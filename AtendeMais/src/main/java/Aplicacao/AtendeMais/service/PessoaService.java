package Aplicacao.AtendeMais.service;

import Aplicacao.AtendeMais.model.Pessoa;
import Aplicacao.AtendeMais.repository.PessoaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {

    private final PessoaRepository pessoaRepository;

    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    public List<Pessoa> listarTodos() {
        return pessoaRepository.findAll();
    }

    public Pessoa buscarPorId(Long id) {
        return pessoaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pessoa não encontrada"));
    }

    public Pessoa salvar(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    public Pessoa atualizar(Long id, Pessoa pessoaAtualizado) {
        Pessoa pessoa = buscarPorId(id);
        pessoa.setNome(pessoaAtualizado.getNome());
        pessoa.setTipopessoa(pessoaAtualizado.getTipopessoa());
        pessoa.setTipopfpj(pessoaAtualizado.getTipopfpj());
        return pessoaRepository.save(pessoa);
    }

    public void deletar(Long id) {
        pessoaRepository.deleteById(id);
    }
}
