 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author johnn
 */
@Entity
@Table(name = "paciente", catalog = "dbclinicaii", schema = "")
public class Paciente implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpaciente")
    private Integer idpaciente;
    
    @ManyToOne
    private Dia dia;
    
    
    @ManyToOne
    private Turno turno;
    
    
    @ManyToOne
    private Medico medico;
    
    
    @ManyToOne
    private Tiposanguineo tiposanguineo;
    
    @ManyToOne
    private Duracaohd duracaohd;
    
    @ManyToOne
    private Frequenciahd frequenciahd;
    
    @ManyToOne
    private Estado estado;
    
    @ManyToOne
    private Cidade cidade;
    
    
    @ManyToOne
    private Profissao profissao;
    
    
    @ManyToOne
    private Tiposlogradouro tiposlogradouro;
    
    @ManyToOne
    private Tipodeinsuficiencia tipodeinsuficiencia;
    
    @ManyToOne
    private Tipodedialise tipodedialise;
    
    @OneToMany (mappedBy = "paciente")
    private List<Fichasala> fichasala = new ArrayList<Fichasala>();
    
    @OneToMany (mappedBy = "paciente")
    private List<SessaoHasPaciente> sessaohaspaciente = new ArrayList<SessaoHasPaciente>();
    
    @OneToMany (mappedBy = "paciente")
    private List<Ocorrencias> ocorrencias = new ArrayList<Ocorrencias>();
    
    
    
    @Column(name = "prontuario")
    private String prontuario;
    @Column(name = "nome")
    private String nome;
    @Column(name = "apelido")
    private String apelido;
    @Column(name = "bairro")
    private String bairro;
    @Column(name = "cep")
    private String cep;
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "datanascimento")
    @Temporal(TemporalType.DATE)
    private Date datanascimento;
    @Column(name = "datainiciohd")
    @Temporal(TemporalType.DATE)
    private Date datainiciohd;
      @Column(name = "pesoseco")
    private Float pesoseco;
    @Column(name = "endereco")
    private String endereco;
    @Column(name = "numero")
    private String numero;
    @Column(name = "foto")
    private String foto;
    @Column(name = "rg")
    private String rg;
    @Column(name = "unidadedeencaminhamento")
    private String unidadedeencaminhamento;
    @Column(name = "complemento")
    private String complemento;
    @Column (name = "precisadeclaracao")
    private Short precisadeclaracao;
    @Column (name = "declaracaoacompanhante")
    private Short declaracaoacompanhante;
    
    @Column(name = "nomedamae")
    private String nomedamae;
    
    @Column(name = "idade")
    private String idade;
    
    @Column(name = "raca")
    private String raca;

    @Column(name = "logradouro")
    private String logradouro;
    
    @Column(name = "cidadenome")
    private String cidadenome;
    
    @Column(name = "estadonome")
    private String estadonome;
    
    public Paciente() {
    }

    public Paciente(Integer idpaciente) {
        this.idpaciente = idpaciente;
    }

    public Integer getIdpaciente() {
        return idpaciente;
    }

    public void setIdpaciente(Integer idpaciente) {
        Integer oldIdpaciente = this.idpaciente;
        this.idpaciente = idpaciente;
        changeSupport.firePropertyChange("idpaciente", oldIdpaciente, idpaciente);
    }

    public Dia getDia() {
        return dia;
    }

    public void setDia(Dia dia) {
        Dia oldDia = this.dia;
        this.dia = dia;
        changeSupport.firePropertyChange("dia", oldDia, dia);
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        Turno oldTurno = this.turno;
        this.turno = turno;
        changeSupport.firePropertyChange("turno", oldTurno, turno);
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        Medico oldMedico = this.medico;
        this.medico = medico;
        changeSupport.firePropertyChange("medico", oldMedico, medico);
    }

    public Tiposanguineo getTiposanguineo() {
        return tiposanguineo;
    }

    public void setTiposanguineo(Tiposanguineo tiposanguineo) {
        Tiposanguineo oldTiposanguineo = this.tiposanguineo;
        this.tiposanguineo = tiposanguineo;
        changeSupport.firePropertyChange("tiposanguineo", oldTiposanguineo, tiposanguineo);
    }

    public Duracaohd getDuracaohd() {
        return duracaohd;
    }

    public void setDuracaohd(Duracaohd duracaohdIdduracaohd) {
        Duracaohd oldDuracaohd = this.duracaohd;
        this.duracaohd = duracaohd;
        changeSupport.firePropertyChange("duracaohd", oldDuracaohd, duracaohd);
    }

    public Frequenciahd getFrequenciahd() {
        return frequenciahd;
    }

    public void setFrequenciahd(Frequenciahd frequenciahdIdfrequenciahd) {
        Frequenciahd oldFrequenciahd = this.frequenciahd;
        this.frequenciahd = frequenciahd;
        changeSupport.firePropertyChange("frequenciahd", oldFrequenciahd, frequenciahd);
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        Estado oldEstado = this.estado;
        this.estado = estado;
        changeSupport.firePropertyChange("estado", oldEstado, estado);
    }
    
    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        Cidade oldCidade = this.cidade;
        this.cidade = cidade;
        changeSupport.firePropertyChange("cidade", oldCidade, cidade);
    }

    public Profissao getProfissao() {
        return profissao;
    }

    public void setProfissao(Profissao profissao) {
        Profissao oldProfissao = this.profissao;
        this.profissao = profissao;
        changeSupport.firePropertyChange("profissaoIdprofissao", oldProfissao, profissao);
    }

    public Tiposlogradouro getTiposlogradouro() {
        return tiposlogradouro;
    }

    public void setTiposlogradouro(Tiposlogradouro tiposlogradouro) {
        Tiposlogradouro oldTiposlogradouro = this.tiposlogradouro;
        this.tiposlogradouro = tiposlogradouro;
        changeSupport.firePropertyChange("tiposlogradouro", oldTiposlogradouro, tiposlogradouro);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }
    
   public String getProntuario() {
        return prontuario;
    }

    public void setProntuario(String prontuario) {
        String oldProntuario = this.prontuario;
        this.prontuario = prontuario;
        changeSupport.firePropertyChange("prontuario", oldProntuario, prontuario);
    }
    
    

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        String oldApelido = this.apelido;
        this.apelido = apelido;
        changeSupport.firePropertyChange("apelido", oldApelido, apelido);
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        String oldBairro = this.bairro;
        this.bairro = bairro;
        changeSupport.firePropertyChange("bairro", oldBairro, bairro);
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        String oldCep = this.cep;
        this.cep = cep;
        changeSupport.firePropertyChange("cep", oldCep, cep);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        String oldCpf = this.cpf;
        this.cpf = cpf;
        changeSupport.firePropertyChange("cpf", oldCpf, cpf);
    }

    public Date getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(Date datanascimento) {
        Date oldDatanascimento = this.datanascimento;
        this.datanascimento = datanascimento;
        changeSupport.firePropertyChange("datanascimento", oldDatanascimento, datanascimento);
    }

    public Date getDatainiciohd() {
        return datainiciohd;
    }

    public void setDatainiciohd(Date datainiciohd) {
       Date oldDatainiciohd = this.datainiciohd;
        this.datainiciohd = datainiciohd;
        changeSupport.firePropertyChange("datainiciohd", oldDatainiciohd, datainiciohd);
    }

    public Float getPesoseco() {
        return pesoseco;
    }

    public void setPesoseco(Float pesoseco) {
        Float oldPesoseco = this.pesoseco;
        this.pesoseco = pesoseco;
        changeSupport.firePropertyChange("pesoseco", oldPesoseco, pesoseco);
    }
    
    
    
    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        String oldEndereco = this.endereco;
        this.endereco = endereco;
        changeSupport.firePropertyChange("endereco", oldEndereco, endereco);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        String oldNumero = this.numero;
        this.numero = numero;
        changeSupport.firePropertyChange("numero", oldNumero, numero);
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        String oldFoto = this.foto;
        this.foto = foto;
        changeSupport.firePropertyChange("foto", oldFoto, foto);
    }
    
  public Tipodeinsuficiencia getTipodeinsuficiencia() {
        return tipodeinsuficiencia;
    }

    public void setTipodeinsuficiencia(Tipodeinsuficiencia tipodeinsuficiencia) {
        Tipodeinsuficiencia oldTipodeinsuficiencia = this.tipodeinsuficiencia;
        this.tipodeinsuficiencia = tipodeinsuficiencia;
        changeSupport.firePropertyChange("tipodeinsuficiencia", oldTipodeinsuficiencia, tipodeinsuficiencia);
    }
    
    
     public Tipodedialise getTipodedialise() {
        return tipodedialise;
    }

    public void setTipodedialise(Tipodedialise tipodedialise) {
        Tipodedialise oldTipodedialise = this.tipodedialise;
        this.tipodedialise = tipodedialise;
        changeSupport.firePropertyChange("tipodedialise", oldTipodedialise, tipodedialise);
    }
    
    
    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        String oldRg = this.rg;
        this.rg = rg;
        changeSupport.firePropertyChange("rg", oldRg, rg);
    }
    
    
    public String getUnidadedeencaminhamento() {
        return unidadedeencaminhamento;
    }

    public void setUnidadedeencaminhamento(String unidadedeencaminhamento) {
        String oldUnidadedeencaminhamento = this.unidadedeencaminhamento;
        this.unidadedeencaminhamento = unidadedeencaminhamento;
        changeSupport.firePropertyChange("unidadedeencaminhamento", oldUnidadedeencaminhamento, unidadedeencaminhamento);
    }
    
    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        String oldComplemento = this.complemento;
        this.complemento = complemento;
        changeSupport.firePropertyChange("complemento", oldComplemento, complemento);
    }
    
    public Short getPrecisadeclaracao() {
        return precisadeclaracao;
    }

    public void setPrecisadeclaracao(Short precisadeclaracao) {
        Short oldPrecisadeclaracao = this.precisadeclaracao;
        this.precisadeclaracao = precisadeclaracao;
        changeSupport.firePropertyChange("precisadeclaracao", oldPrecisadeclaracao, precisadeclaracao);
    }

     public Short getDeclaracaoacompanhante() {
        return declaracaoacompanhante;
    }

    public void setDeclaracaoacompanhante(Short declaracaoacompanhante) {
        Short oldDeclaracaoacompanhante = this.declaracaoacompanhante;
        this.declaracaoacompanhante = declaracaoacompanhante;
        changeSupport.firePropertyChange("declaracaoacompanhante", oldDeclaracaoacompanhante, declaracaoacompanhante);
    }
    
    public String getNomedamae() {
        return nomedamae;
    }

    public void setNomedamae(String nomedamae) {
        String oldNomedamae = this.nomedamae;
        this.nomedamae = nomedamae;
        changeSupport.firePropertyChange("nomedamae", oldNomedamae, nomedamae);
    }
    
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        String oldRaca = this.raca;
        this.raca = raca;
        changeSupport.firePropertyChange("raca", oldRaca, raca);
    }
    
    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        String oldIdade = this.idade;
        this.idade = idade;
        changeSupport.firePropertyChange("idade", oldIdade, idade);
    }
    
     public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        String oldLogradouro = this.logradouro;
        this.logradouro = logradouro;
        changeSupport.firePropertyChange("logradouro", oldLogradouro, logradouro);
    }
    
    public String getCidadenome() {
       return cidadenome;
    }

    public void setCidadeNome(String cidadenome) {
        String oldCidadenome = this.cidadenome;
        this.cidadenome = cidadenome;
        changeSupport.firePropertyChange("cidadenome", oldCidadenome, cidadenome);
    }
    
     public String getEstadonome() {
        return estadonome;
    }

    public void setEstadoNome(String estadonome) {
        String oldEstadonome = this.estadonome;
        this.estadonome = estadonome;
        changeSupport.firePropertyChange("estadonome", oldEstadonome, estadonome);
    }
    
    
    public List<Fichasala> getFichasala() {
        return fichasala;
    }

    public void setFichasala(List<Fichasala> fichasala) {
        this.fichasala = fichasala;
    }
    
    
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpaciente != null ? idpaciente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paciente)) {
            return false;
        }
        Paciente other = (Paciente) object;
        if ((this.idpaciente == null && other.idpaciente != null) || (this.idpaciente != null && !this.idpaciente.equals(other.idpaciente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nome;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
