package br.com.fiap;

import br.com.fiap.pessoa.model.PessoaFisica;
import br.com.fiap.pessoa.model.PessoaJuridica;
import br.com.fiap.pessoa.model.Sexo;
import br.com.fiap.usuario.model.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        EntityManagerFactory factory = Persistence.createEntityManagerFactory("oracle-fiap");
        EntityManager manager = factory.createEntityManager();

        PessoaFisica LuanSa = new PessoaFisica();
        LuanSa.setSexo(Sexo.MASCULINO)
                .setCPF(getCpf())
                .setNome("Luan Victor da Silva Sá")
                .setNascimento(LocalDate.now().minusYears(19));

        Usuario vip = new Usuario();
        vip.setPessoa(LuanSa);

        PessoaJuridica Soriye = new PessoaJuridica();
        Soriye.setCNPJ(getCnpj())
                .setNome("Henrique Alves de Freitas")
                .setNascimento(LocalDate.now().minusYears(20));

        Usuario vip2 = new Usuario();
        vip2.setPessoa(Soriye);

        PessoaFisica Gabriel = new PessoaFisica();
        Gabriel.setSexo(Sexo.MASCULINO)
                .setCPF(getCpf())
                .setNome("Gabriel Henrique Nascimento Paulino Santos")
                .setNascimento(LocalDate.now().minusYears(22));

        Usuario vip3 = new Usuario();
        vip3.setPessoa(Gabriel);

        findAll(manager);
        findAll2(manager);
        findAll3(manager);

        manager.getTransaction().begin();
        manager.persist(LuanSa);
        manager.persist(Soriye);
        manager.persist(Gabriel);
        manager.persist(vip);
        manager.persist(vip2);
        manager.persist(vip3);
        manager.getTransaction().commit();

    }
    private static void findAll(EntityManager manager) {
        String jpql = "From Usuario ";
        List<Usuario> list = manager.createQuery(jpql).getResultList();
        list.stream().forEach(System.out::println);
    }
    private static void findAll2(EntityManager manager) {
        String jpql = "From PessoaFisica ";
        List<PessoaFisica> list = manager.createQuery(jpql).getResultList();
        list.stream().forEach(System.out::println);
    }
    private static void findAll3(EntityManager manager) {
        String jpql = "From PessoaJuridica ";
        List<PessoaJuridica> list = manager.createQuery(jpql).getResultList();
        list.stream().forEach(System.out::println);
    }
    private static String getCpf() {
        return String.valueOf(new Random().nextInt(999999999));
    }

    private static String getCnpj() {
        return String.valueOf(new Random().nextInt(999999999));
    }
}