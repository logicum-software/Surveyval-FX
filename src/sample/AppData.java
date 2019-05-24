package sample;

import javafx.beans.InvalidationListener;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AppData implements Serializable {

    public ObservableList<Fragebogen> appFrageboegen;
    public ObservableList<Frage> appFragen;

    public AppData() {

        appFrageboegen = new ObservableList<Fragebogen>() {
            @Override
            public void addListener(ListChangeListener<? super Fragebogen> listener) {

            }

            @Override
            public void removeListener(ListChangeListener<? super Fragebogen> listener) {

            }

            @Override
            public boolean addAll(Fragebogen... elements) {
                return false;
            }

            @Override
            public boolean setAll(Fragebogen... elements) {
                return false;
            }

            @Override
            public boolean setAll(Collection<? extends Fragebogen> col) {
                return false;
            }

            @Override
            public boolean removeAll(Fragebogen... elements) {
                return false;
            }

            @Override
            public boolean retainAll(Fragebogen... elements) {
                return false;
            }

            @Override
            public void remove(int from, int to) {

            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Fragebogen> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] ts) {
                return null;
            }

            @Override
            public boolean add(Fragebogen fragebogen) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> collection) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Fragebogen> collection) {
                return false;
            }

            @Override
            public boolean addAll(int i, Collection<? extends Fragebogen> collection) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> collection) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> collection) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Fragebogen get(int i) {
                return null;
            }

            @Override
            public Fragebogen set(int i, Fragebogen fragebogen) {
                return null;
            }

            @Override
            public void add(int i, Fragebogen fragebogen) {

            }

            @Override
            public Fragebogen remove(int i) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Fragebogen> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Fragebogen> listIterator(int i) {
                return null;
            }

            @Override
            public List<Fragebogen> subList(int i, int i1) {
                return null;
            }

            @Override
            public void addListener(InvalidationListener listener) {

            }

            @Override
            public void removeListener(InvalidationListener listener) {

            }
        };

        appFragen = new ObservableList<Frage>() {
            @Override
            public void addListener(ListChangeListener<? super Frage> listener) {

            }

            @Override
            public void removeListener(ListChangeListener<? super Frage> listener) {

            }

            @Override
            public boolean addAll(Frage... elements) {
                return false;
            }

            @Override
            public boolean setAll(Frage... elements) {
                return false;
            }

            @Override
            public boolean setAll(Collection<? extends Frage> col) {
                return false;
            }

            @Override
            public boolean removeAll(Frage... elements) {
                return false;
            }

            @Override
            public boolean retainAll(Frage... elements) {
                return false;
            }

            @Override
            public void remove(int from, int to) {

            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Frage> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] ts) {
                return null;
            }

            @Override
            public boolean add(Frage frage) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> collection) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Frage> collection) {
                return false;
            }

            @Override
            public boolean addAll(int i, Collection<? extends Frage> collection) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> collection) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> collection) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Frage get(int i) {
                return null;
            }

            @Override
            public Frage set(int i, Frage frage) {
                return null;
            }

            @Override
            public void add(int i, Frage frage) {

            }

            @Override
            public Frage remove(int i) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Frage> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Frage> listIterator(int i) {
                return null;
            }

            @Override
            public List<Frage> subList(int i, int i1) {
                return null;
            }

            @Override
            public void addListener(InvalidationListener listener) {

            }

            @Override
            public void removeListener(InvalidationListener listener) {

            }
        };
    }
}
