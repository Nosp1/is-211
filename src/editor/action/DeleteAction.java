package editor.action;

import editor.Document;
import editor.Editor;

import java.awt.event.ActionEvent;

public class DeleteAction extends EditorAction {
    Editor editor;
    public DeleteAction(String name, Editor ed) {
        super(name);
        this.editor = ed;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
            Document doc = editor.getDocument();
            doc.deleteChar(' ');
        }
    }

