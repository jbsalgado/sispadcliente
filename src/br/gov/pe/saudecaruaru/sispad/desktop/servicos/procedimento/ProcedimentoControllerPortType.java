/**
 * ProcedimentoControllerPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento;

public interface ProcedimentoControllerPortType extends java.rmi.Remote {
    public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[] getLastMessages(br.gov.pe.saudecaruaru.sispad.desktop.modelos.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException;
    public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[] login(br.gov.pe.saudecaruaru.sispad.desktop.modelos.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException;
    public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[] logout(br.gov.pe.saudecaruaru.sispad.desktop.modelos.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException;
    public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Medico[] getMedicos(java.lang.String codigoUnidade, br.gov.pe.saudecaruaru.sispad.desktop.modelos.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException;
    public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[] getProcedimentosAEnviarSIAB(br.gov.pe.saudecaruaru.sispad.desktop.modelos.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException;
    public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[] getProcedimentosDeMedicoAEnviarSIAB(br.gov.pe.saudecaruaru.sispad.desktop.modelos.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException;
    public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[] getProcedimentosDeEnfermeiroAEnviarSIAB(br.gov.pe.saudecaruaru.sispad.desktop.modelos.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException;
    public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[] getProcedimentosDeOdontologoAEnviarSIAB(br.gov.pe.saudecaruaru.sispad.desktop.modelos.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException;
    public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[] getProcedimentosDeAgenteSaudeAEnviarSIAB(br.gov.pe.saudecaruaru.sispad.desktop.modelos.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException;
    public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[] getProcedimentosAEnviarSIA(br.gov.pe.saudecaruaru.sispad.desktop.modelos.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException;
    public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[] getProcedimentosDeMedicoAEnviarSIA(br.gov.pe.saudecaruaru.sispad.desktop.modelos.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException;
    public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[] getProcedimentosDeEnfermeiroAEnviarSIA(br.gov.pe.saudecaruaru.sispad.desktop.modelos.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException;
    public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[] getProcedimentosDeOdontologoAEnviarSIA(br.gov.pe.saudecaruaru.sispad.desktop.modelos.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException;
    public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[] getProcedimentosDeAgenteSaudeAEnviarSIA(br.gov.pe.saudecaruaru.sispad.desktop.modelos.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException;
    public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Unidade[] getUnidades(br.gov.pe.saudecaruaru.sispad.desktop.modelos.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException;
    public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[] validarUnidades(br.gov.pe.saudecaruaru.sispad.desktop.modelos.UsuarioDesktop usuarioDesktop, br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Unidade[] unidades) throws java.rmi.RemoteException;
    public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.AgenteSaude[] getAgenteSaude(java.lang.String codigoUnidade, br.gov.pe.saudecaruaru.sispad.desktop.modelos.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException;
    public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Odontologo[] getOdontologos(java.lang.String codigoUnidade, br.gov.pe.saudecaruaru.sispad.desktop.modelos.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException;
    public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Enfermeiro[] getEnfermeiros(java.lang.String codigoUnidade, br.gov.pe.saudecaruaru.sispad.desktop.modelos.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException;
    public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[] sendExecutadosPorServidor(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.ServidorExecutaProcedimento[] procedimentosExecutados, br.gov.pe.saudecaruaru.sispad.desktop.modelos.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException;
    public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[] sendExecutadosPorEquipe(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.EquipeExecutaProcedimento[] procedimentosExecutados, br.gov.pe.saudecaruaru.sispad.desktop.modelos.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException;
    public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[] sendExecutadosPorMedico(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MedicoExecutaProcedimento[] procedimentosExecutados, br.gov.pe.saudecaruaru.sispad.desktop.modelos.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException;
    public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[] sendExecutadosPorEnfermeiro(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.EnfermeiroExecutaProcedimento[] procedimentosExecutados, br.gov.pe.saudecaruaru.sispad.desktop.modelos.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException;
    public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[] sendExecutadosPorOdontologo(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.OdontologoExecutaProcedimento[] procedimentosExecutados, br.gov.pe.saudecaruaru.sispad.desktop.modelos.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException;
    public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[] sendExecutadosPorAgenteSaude(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.AgenteSaudeExecutaProcedimento[] procedimentosExecutados, br.gov.pe.saudecaruaru.sispad.desktop.modelos.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException;
}
