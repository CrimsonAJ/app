.class public final Ll2/d;
.super LM1/s;
.source "SourceFile"


# instance fields
.field public final synthetic j:Lcom/anilab/android/ui/search/SearchFragment;


# direct methods
.method public constructor <init>(Lcom/anilab/android/ui/search/SearchFragment;Landroidx/recyclerview/widget/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ll2/d;->j:Lcom/anilab/android/ui/search/SearchFragment;

    .line 2
    .line 3
    const-string p1, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager"

    .line 4
    .line 5
    invoke-static {p2, p1}, Lkotlin/jvm/internal/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    check-cast p2, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 9
    .line 10
    invoke-direct {p0, p2}, LM1/s;-><init>(Landroidx/recyclerview/widget/a;)V

    .line 11
    .line 12
    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
.end method


# virtual methods
.method public final c(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Ll2/d;->j:Lcom/anilab/android/ui/search/SearchFragment;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/anilab/android/ui/search/SearchFragment;->s0()Ll2/n;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0}, LM1/n;->e0()LW/g;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, LJ1/u0;

    .line 12
    .line 13
    iget-object v0, v0, LJ1/u0;->D:Landroidx/appcompat/widget/AppCompatEditText;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, LW7/d;->j0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v1, p1, v0}, Ll2/n;->g(ILjava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-void
    .line 35
    .line 36
    .line 37
    .line 38
.end method
