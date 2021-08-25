package bean;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Paciente.class)
public abstract class Paciente_ {

	public static volatile SingularAttribute<Paciente, Estado> estado;
	public static volatile SingularAttribute<Paciente, Cidade> cidade;
	public static volatile ListAttribute<Paciente, Ocorrencias> ocorrencias;
	public static volatile SingularAttribute<Paciente, String> prontuario;
	public static volatile SingularAttribute<Paciente, String> apelido;
	public static volatile SingularAttribute<Paciente, String> numero;
	public static volatile SingularAttribute<Paciente, Turno> turno;
	public static volatile SingularAttribute<Paciente, Integer> idpaciente;
	public static volatile SingularAttribute<Paciente, Date> datanascimento;
	public static volatile SingularAttribute<Paciente, Tiposlogradouro> tiposlogradouro;
	public static volatile SingularAttribute<Paciente, String> cep;
	public static volatile SingularAttribute<Paciente, String> estadonome;
	public static volatile SingularAttribute<Paciente, Date> datainiciohd;
	public static volatile ListAttribute<Paciente, Fichasala> fichasala;
	public static volatile SingularAttribute<Paciente, String> idade;
	public static volatile SingularAttribute<Paciente, String> complemento;
	public static volatile SingularAttribute<Paciente, String> cpf;
	public static volatile SingularAttribute<Paciente, Duracaohd> duracaohd;
	public static volatile SingularAttribute<Paciente, String> nomedamae;
	public static volatile SingularAttribute<Paciente, String> endereco;
	public static volatile SingularAttribute<Paciente, Tipodeinsuficiencia> tipodeinsuficiencia;
	public static volatile SingularAttribute<Paciente, String> bairro;
	public static volatile SingularAttribute<Paciente, Float> pesoseco;
	public static volatile SingularAttribute<Paciente, Profissao> profissao;
	public static volatile SingularAttribute<Paciente, String> nome;
	public static volatile SingularAttribute<Paciente, String> cidadenome;
	public static volatile SingularAttribute<Paciente, Tiposanguineo> tiposanguineo;
	public static volatile SingularAttribute<Paciente, Tipodedialise> tipodedialise;
	public static volatile SingularAttribute<Paciente, Short> precisadeclaracao;
	public static volatile ListAttribute<Paciente, SessaoHasPaciente> sessaohaspaciente;
	public static volatile SingularAttribute<Paciente, String> unidadedeencaminhamento;
	public static volatile SingularAttribute<Paciente, String> foto;
	public static volatile SingularAttribute<Paciente, String> rg;
	public static volatile SingularAttribute<Paciente, String> logradouro;
	public static volatile SingularAttribute<Paciente, Medico> medico;
	public static volatile SingularAttribute<Paciente, Frequenciahd> frequenciahd;
	public static volatile SingularAttribute<Paciente, String> raca;
	public static volatile SingularAttribute<Paciente, Dia> dia;
	public static volatile SingularAttribute<Paciente, Short> declaracaoacompanhante;

}

