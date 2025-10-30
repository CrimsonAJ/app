.class public final Lcom/anilab/android/ui/login/LoginFragment;
.super LY1/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LY1/a<",
        "LY1/h;",
        "LJ1/U;",
        ">;"
    }
.end annotation


# instance fields
.field public final D0:LY2/r;

.field public final E0:LY2/r;

.field public final F0:Li0/o;


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, LY1/a;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LY1/e;

    .line 5
    .line 6
    const/4 v1, 0x3

    .line 7
    invoke-direct {v0, p0, v1}, LY1/e;-><init>(Lcom/anilab/android/ui/login/LoginFragment;I)V

    .line 8
    .line 9
    .line 10
    sget-object v1, LA7/f;->a:LA7/f;

    .line 11
    .line 12
    new-instance v2, LN1/r;

    .line 13
    .line 14
    const/16 v3, 0x11

    .line 15
    .line 16
    invoke-direct {v2, v3, v0}, LN1/r;-><init>(ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v1, v2}, LZ0/a;->p(LA7/f;LO7/a;)LA7/e;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-class v1, LY1/h;

    .line 24
    .line 25
    invoke-static {v1}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    new-instance v2, LN1/s;

    .line 30
    .line 31
    const/16 v3, 0x16

    .line 32
    .line 33
    invoke-direct {v2, v0, v3}, LN1/s;-><init>(LA7/e;I)V

    .line 34
    .line 35
    .line 36
    new-instance v3, LN1/s;

    .line 37
    .line 38
    const/16 v4, 0x17

    .line 39
    .line 40
    invoke-direct {v3, v0, v4}, LN1/s;-><init>(LA7/e;I)V

    .line 41
    .line 42
    .line 43
    new-instance v4, LN1/t;

    .line 44
    .line 45
    const/16 v5, 0xb

    .line 46
    .line 47
    invoke-direct {v4, p0, v0, v5}, LN1/t;-><init>(Li0/v;LA7/e;I)V

    .line 48
    .line 49
    .line 50
    invoke-static {p0, v1, v2, v3, v4}, LM4/a;->i(Li0/v;Lkotlin/jvm/internal/d;LO7/a;LO7/a;LO7/a;)LY2/r;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iput-object v0, p0, Lcom/anilab/android/ui/login/LoginFragment;->D0:LY2/r;

    .line 55
    .line 56
    const-class v0, LL1/S;

    .line 57
    .line 58
    invoke-static {v0}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    new-instance v1, LY1/e;

    .line 63
    .line 64
    const/4 v2, 0x0

    .line 65
    invoke-direct {v1, p0, v2}, LY1/e;-><init>(Lcom/anilab/android/ui/login/LoginFragment;I)V

    .line 66
    .line 67
    .line 68
    new-instance v2, LY1/e;

    .line 69
    .line 70
    const/4 v3, 0x1

    .line 71
    invoke-direct {v2, p0, v3}, LY1/e;-><init>(Lcom/anilab/android/ui/login/LoginFragment;I)V

    .line 72
    .line 73
    .line 74
    new-instance v3, LY1/e;

    .line 75
    .line 76
    const/4 v4, 0x2

    .line 77
    invoke-direct {v3, p0, v4}, LY1/e;-><init>(Lcom/anilab/android/ui/login/LoginFragment;I)V

    .line 78
    .line 79
    .line 80
    invoke-static {p0, v0, v1, v2, v3}, LM4/a;->i(Li0/v;Lkotlin/jvm/internal/d;LO7/a;LO7/a;LO7/a;)LY2/r;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    iput-object v0, p0, Lcom/anilab/android/ui/login/LoginFragment;->E0:LY2/r;

    .line 85
    .line 86
    new-instance v0, Lg/a;

    .line 87
    .line 88
    const/4 v1, 0x2

    .line 89
    invoke-direct {v0, v1}, Lg/a;-><init>(I)V

    .line 90
    .line 91
    .line 92
    new-instance v1, LC3/v;

    .line 93
    .line 94
    const/16 v2, 0xa

    .line 95
    .line 96
    invoke-direct {v1, v2, p0}, LC3/v;-><init>(ILjava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0, v1, v0}, Li0/v;->V(Lf/b;Lv4/e;)Lf/c;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    check-cast v0, Li0/o;

    .line 104
    .line 105
    iput-object v0, p0, Lcom/anilab/android/ui/login/LoginFragment;->F0:Li0/o;

    .line 106
    .line 107
    return-void
    .line 108
.end method


# virtual methods
.method public final f0()I
    .locals 1

    .line 1
    const v0, 0x7f0d0052

    return v0
.end method

.method public final h0()LM1/r;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/anilab/android/ui/login/LoginFragment;->D0:LY2/r;

    .line 2
    .line 3
    invoke-virtual {v0}, LY2/r;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LY1/h;

    .line 8
    .line 9
    return-object v0
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
.end method

.method public final k0(I)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    sparse-switch p1, :sswitch_data_0

    .line 3
    .line 4
    .line 5
    goto :goto_0

    .line 6
    :sswitch_0
    const p1, 0x7f0a0226

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1, v0}, LM1/n;->i0(ILandroid/os/Bundle;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :sswitch_1
    const p1, 0x7f0a0225

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1, v0}, LM1/n;->i0(ILandroid/os/Bundle;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :sswitch_2
    invoke-virtual {p0}, Li0/v;->k()Li0/y;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    iget-object v0, p0, Lcom/anilab/android/ui/login/LoginFragment;->D0:LY2/r;

    .line 27
    .line 28
    invoke-virtual {v0}, LY2/r;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, LY1/h;

    .line 33
    .line 34
    iget-object v0, v0, LY1/h;->g:LP2/h;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    sget-object v0, Lg6/o;->a:Lg6/o;

    .line 40
    .line 41
    invoke-virtual {v0}, Lg6/o;->J()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget-object v1, p0, Lcom/anilab/android/ui/login/LoginFragment;->F0:Li0/o;

    .line 46
    .line 47
    invoke-static {p1, v1, v0}, Lcom/google/android/gms/internal/measurement/Y1;->B(Li0/y;Li0/o;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    :cond_0
    :goto_0
    return-void

    .line 51
    :sswitch_3
    invoke-static {p0}, LM1/n;->q0(LM1/n;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :sswitch_data_0
    .sparse-switch
        0x7f0a0071 -> :sswitch_3
        0x7f0a007b -> :sswitch_2
        0x7f0a00a8 -> :sswitch_1
        0x7f0a03d8 -> :sswitch_0
    .end sparse-switch
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
.end method

.method public final l0()V
    .locals 4

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/Y;->f(Landroidx/lifecycle/w;)Landroidx/lifecycle/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, LY1/d;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, v2, p0}, LY1/d;-><init>(LE7/d;Lcom/anilab/android/ui/login/LoginFragment;)V

    .line 9
    .line 10
    .line 11
    const/4 v3, 0x3

    .line 12
    invoke-static {v0, v2, v1, v3}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    .line 13
    .line 14
    .line 15
    return-void
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
.end method

.method public final m0(LW/g;)Ljava/util/List;
    .locals 5

    .line 1
    check-cast p1, LJ1/U;

    .line 2
    .line 3
    iget-object v0, p1, LJ1/U;->z:Landroidx/appcompat/widget/AppCompatTextView;

    .line 4
    .line 5
    iget-object v1, p1, LJ1/U;->w:Lcom/google/android/material/button/MaterialButton;

    .line 6
    .line 7
    iget-object v2, p1, LJ1/U;->x:Lcom/google/android/material/button/MaterialButton;

    .line 8
    .line 9
    iget-object p1, p1, LJ1/U;->v:Landroidx/appcompat/widget/AppCompatImageView;

    .line 10
    .line 11
    const/4 v3, 0x4

    .line 12
    new-array v3, v3, [Landroid/view/View;

    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    aput-object v2, v3, v4

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    aput-object p1, v3, v2

    .line 19
    .line 20
    const/4 p1, 0x2

    .line 21
    aput-object v0, v3, p1

    .line 22
    .line 23
    const/4 p1, 0x3

    .line 24
    aput-object v1, v3, p1

    .line 25
    .line 26
    invoke-static {v3}, LB7/l;->b0([Ljava/lang/Object;)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    return-object p1
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public final n0(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LM1/n;->e0()LW/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, LJ1/U;

    .line 6
    .line 7
    iget-object v0, v0, LJ1/U;->y:LJ1/E1;

    .line 8
    .line 9
    iget-object v0, v0, LW/g;->k:Landroid/view/View;

    .line 10
    .line 11
    const-string v1, "getRoot(...)"

    .line 12
    .line 13
    invoke-static {v0, v1}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/16 p1, 0x8

    .line 21
    .line 22
    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 23
    .line 24
    .line 25
    return-void
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

.method public final p0()V
    .locals 0

    .line 1
    return-void
.end method
