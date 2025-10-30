.class public final Lcom/anilab/android/ui/external_player/SelectPlayerFragment;
.super LT1/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LT1/a<",
        "LJ1/o;",
        "LT1/p;",
        ">;"
    }
.end annotation


# instance fields
.field public final S0:LY2/r;

.field public final T0:LY2/r;

.field public final U0:LA7/l;


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, LT1/a;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, LL1/S;

    .line 5
    .line 6
    invoke-static {v0}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, LT1/j;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v1, p0, v2}, LT1/j;-><init>(Lcom/anilab/android/ui/external_player/SelectPlayerFragment;I)V

    .line 14
    .line 15
    .line 16
    new-instance v2, LT1/j;

    .line 17
    .line 18
    const/4 v3, 0x1

    .line 19
    invoke-direct {v2, p0, v3}, LT1/j;-><init>(Lcom/anilab/android/ui/external_player/SelectPlayerFragment;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, LT1/j;

    .line 23
    .line 24
    const/4 v4, 0x2

    .line 25
    invoke-direct {v3, p0, v4}, LT1/j;-><init>(Lcom/anilab/android/ui/external_player/SelectPlayerFragment;I)V

    .line 26
    .line 27
    .line 28
    invoke-static {p0, v0, v1, v2, v3}, LM4/a;->i(Li0/v;Lkotlin/jvm/internal/d;LO7/a;LO7/a;LO7/a;)LY2/r;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, Lcom/anilab/android/ui/external_player/SelectPlayerFragment;->S0:LY2/r;

    .line 33
    .line 34
    new-instance v0, LT1/j;

    .line 35
    .line 36
    const/4 v1, 0x3

    .line 37
    invoke-direct {v0, p0, v1}, LT1/j;-><init>(Lcom/anilab/android/ui/external_player/SelectPlayerFragment;I)V

    .line 38
    .line 39
    .line 40
    sget-object v1, LA7/f;->a:LA7/f;

    .line 41
    .line 42
    new-instance v2, LN1/r;

    .line 43
    .line 44
    const/16 v3, 0x8

    .line 45
    .line 46
    invoke-direct {v2, v3, v0}, LN1/r;-><init>(ILjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    invoke-static {v1, v2}, LZ0/a;->p(LA7/f;LO7/a;)LA7/e;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    const-class v1, LT1/p;

    .line 54
    .line 55
    invoke-static {v1}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    new-instance v2, LN1/s;

    .line 60
    .line 61
    const/16 v3, 0xa

    .line 62
    .line 63
    invoke-direct {v2, v0, v3}, LN1/s;-><init>(LA7/e;I)V

    .line 64
    .line 65
    .line 66
    new-instance v3, LN1/s;

    .line 67
    .line 68
    const/16 v4, 0xb

    .line 69
    .line 70
    invoke-direct {v3, v0, v4}, LN1/s;-><init>(LA7/e;I)V

    .line 71
    .line 72
    .line 73
    new-instance v4, LN1/t;

    .line 74
    .line 75
    const/4 v5, 0x5

    .line 76
    invoke-direct {v4, p0, v0, v5}, LN1/t;-><init>(Li0/v;LA7/e;I)V

    .line 77
    .line 78
    .line 79
    invoke-static {p0, v1, v2, v3, v4}, LM4/a;->i(Li0/v;Lkotlin/jvm/internal/d;LO7/a;LO7/a;LO7/a;)LY2/r;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    iput-object v0, p0, Lcom/anilab/android/ui/external_player/SelectPlayerFragment;->T0:LY2/r;

    .line 84
    .line 85
    new-instance v0, LC2/P;

    .line 86
    .line 87
    const/4 v1, 0x6

    .line 88
    invoke-direct {v0, v1}, LC2/P;-><init>(I)V

    .line 89
    .line 90
    .line 91
    invoke-static {v0}, LZ0/a;->q(LO7/a;)LA7/l;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    iput-object v0, p0, Lcom/anilab/android/ui/external_player/SelectPlayerFragment;->U0:LA7/l;

    .line 96
    .line 97
    return-void
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
.end method


# virtual methods
.method public final n0()I
    .locals 1

    .line 1
    const v0, 0x7f0d0023

    return v0
.end method

.method public final o0(I)V
    .locals 5

    .line 1
    const v0, 0x7f0a0071

    .line 2
    .line 3
    .line 4
    if-eq p1, v0, :cond_2

    .line 5
    .line 6
    const v0, 0x7f0a00a3

    .line 7
    .line 8
    .line 9
    if-eq p1, v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object p1, p0, Lcom/anilab/android/ui/external_player/SelectPlayerFragment;->U0:LA7/l;

    .line 13
    .line 14
    invoke-virtual {p1}, LA7/l;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, LT1/c;

    .line 19
    .line 20
    iget-object v0, p1, LF0/I;->d:LF0/f;

    .line 21
    .line 22
    iget-object v0, v0, LF0/f;->f:Ljava/util/List;

    .line 23
    .line 24
    const-string v1, "getCurrentList(...)"

    .line 25
    .line 26
    invoke-static {v0, v1}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iget p1, p1, LT1/c;->e:I

    .line 30
    .line 31
    invoke-static {v0, p1}, LB7/k;->r0(Ljava/util/List;I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, LH2/t;

    .line 36
    .line 37
    if-nez p1, :cond_1

    .line 38
    .line 39
    :goto_0
    return-void

    .line 40
    :cond_1
    iget-object v0, p0, Lcom/anilab/android/ui/external_player/SelectPlayerFragment;->S0:LY2/r;

    .line 41
    .line 42
    invoke-virtual {v0}, LY2/r;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, LL1/S;

    .line 47
    .line 48
    iput-object p1, v0, LL1/S;->B:LH2/t;

    .line 49
    .line 50
    new-instance v1, LM1/t;

    .line 51
    .line 52
    new-instance v2, LL1/C;

    .line 53
    .line 54
    iget-wide v3, p1, LH2/t;->a:J

    .line 55
    .line 56
    invoke-direct {v2, v3, v4}, LL1/C;-><init>(J)V

    .line 57
    .line 58
    .line 59
    invoke-direct {v1, v2}, LM1/t;-><init>(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iget-object p1, v0, LL1/S;->u:Lb8/Q;

    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    const/4 v0, 0x0

    .line 68
    invoke-virtual {p1, v0, v1}, Lb8/Q;->j(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_2
    invoke-virtual {p0}, Lm5/g;->l0()V

    .line 73
    .line 74
    .line 75
    return-void
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

.method public final q0(LW/g;)Ljava/util/List;
    .locals 3

    .line 1
    check-cast p1, LJ1/o;

    .line 2
    .line 3
    iget-object v0, p1, LJ1/o;->v:Lcom/google/android/material/button/MaterialButton;

    .line 4
    .line 5
    iget-object p1, p1, LJ1/o;->w:Lcom/google/android/material/button/MaterialButton;

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    new-array v1, v1, [Lcom/google/android/material/button/MaterialButton;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    aput-object v0, v1, v2

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    aput-object p1, v1, v0

    .line 15
    .line 16
    invoke-static {v1}, LB7/l;->b0([Ljava/lang/Object;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
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

.method public final r0()V
    .locals 4

    .line 1
    invoke-virtual {p0}, LM1/g;->m0()LW/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, LJ1/o;

    .line 6
    .line 7
    iget-object v0, v0, LJ1/o;->y:Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lcom/anilab/android/ui/external_player/SelectPlayerFragment;->U0:LA7/l;

    .line 14
    .line 15
    invoke-virtual {v1}, LA7/l;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, LT1/c;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(LF0/S;)V

    .line 22
    .line 23
    .line 24
    invoke-static {p0}, Landroidx/lifecycle/Y;->f(Landroidx/lifecycle/w;)Landroidx/lifecycle/r;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    new-instance v1, LT1/i;

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    invoke-direct {v1, v2, p0}, LT1/i;-><init>(LE7/d;Lcom/anilab/android/ui/external_player/SelectPlayerFragment;)V

    .line 32
    .line 33
    .line 34
    const/4 v3, 0x3

    .line 35
    invoke-static {v0, v2, v1, v3}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    .line 36
    .line 37
    .line 38
    return-void
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
    .line 53
    .line 54
    .line 55
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
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
.end method
