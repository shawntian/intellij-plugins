package com.intellij.flex.uiDesigner.mxml;

import com.intellij.psi.xml.XmlFile;
import gnu.trove.TIntArrayList;

import java.util.ArrayList;
import java.util.List;

public class ProjectDocumentReferenceCounter {
  public final TIntArrayList total = new TIntArrayList();
  public final List<XmlFile> unregistered = new ArrayList<XmlFile>();

  public void registered(int id) {
    total.add(id);
  }

  public void unregistered(int id, XmlFile psiFile) {
    total.add(id);
    unregistered.add(psiFile);
  }
}
