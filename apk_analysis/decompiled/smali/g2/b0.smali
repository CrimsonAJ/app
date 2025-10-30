.class public final Lg2/b0;
.super LM1/o;
.source "SourceFile"


# instance fields
.field public final u:LJ1/Y0;


# direct methods
.method public constructor <init>(LJ1/Y0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LM1/o;-><init>(LW/g;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg2/b0;->u:LJ1/Y0;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
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
.end method


# virtual methods
.method public final r(Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, LH2/x;

    .line 2
    .line 3
    iget-object v0, p0, Lg2/b0;->u:LJ1/Y0;

    .line 4
    .line 5
    iget-object v1, v0, LJ1/Y0;->v:Landroid/widget/TextView;

    .line 6
    .line 7
    iget-object v2, p1, LH2/x;->a:LI2/b;

    .line 8
    .line 9
    iget-object v2, v2, LI2/b;->a:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 12
    .line 13
    .line 14
    iget-boolean p1, p1, LH2/x;->b:Z

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    const p1, 0x7f0800a4

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const p1, 0x7f0800aa

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object v0, v0, LJ1/Y0;->v:Landroid/widget/TextView;

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 28
    .line 29
    .line 30
    return-void
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method
