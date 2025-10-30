.class public final Lcom/anilab/android/ui/rating/BottomSheetRating;
.super Li2/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Li2/i<",
        "LJ1/m;",
        "Li2/n;",
        ">;"
    }
.end annotation


# instance fields
.field public final S0:LY2/r;

.field public final T0:LA7/l;

.field public final U0:Lb5/G1;


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, Li2/i;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Li2/f;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-direct {v0, p0, v1}, Li2/f;-><init>(Lcom/anilab/android/ui/rating/BottomSheetRating;I)V

    .line 8
    .line 9
    .line 10
    sget-object v1, LA7/f;->a:LA7/f;

    .line 11
    .line 12
    new-instance v2, Le2/e;

    .line 13
    .line 14
    const/4 v3, 0x5

    .line 15
    invoke-direct {v2, v3, v0}, Le2/e;-><init>(ILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-static {v1, v2}, LZ0/a;->p(LA7/f;LO7/a;)LA7/e;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-class v1, Li2/n;

    .line 23
    .line 24
    invoke-static {v1}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    new-instance v2, Lc2/h;

    .line 29
    .line 30
    const/16 v3, 0x10

    .line 31
    .line 32
    invoke-direct {v2, v0, v3}, Lc2/h;-><init>(LA7/e;I)V

    .line 33
    .line 34
    .line 35
    new-instance v3, Lc2/h;

    .line 36
    .line 37
    const/16 v4, 0x11

    .line 38
    .line 39
    invoke-direct {v3, v0, v4}, Lc2/h;-><init>(LA7/e;I)V

    .line 40
    .line 41
    .line 42
    new-instance v4, LN1/t;

    .line 43
    .line 44
    const/16 v5, 0x17

    .line 45
    .line 46
    invoke-direct {v4, p0, v0, v5}, LN1/t;-><init>(Li0/v;LA7/e;I)V

    .line 47
    .line 48
    .line 49
    invoke-static {p0, v1, v2, v3, v4}, LM4/a;->i(Li0/v;Lkotlin/jvm/internal/d;LO7/a;LO7/a;LO7/a;)LY2/r;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iput-object v0, p0, Lcom/anilab/android/ui/rating/BottomSheetRating;->S0:LY2/r;

    .line 54
    .line 55
    new-instance v0, LC2/P;

    .line 56
    .line 57
    const/16 v1, 0xe

    .line 58
    .line 59
    invoke-direct {v0, v1}, LC2/P;-><init>(I)V

    .line 60
    .line 61
    .line 62
    invoke-static {v0}, LZ0/a;->q(LO7/a;)LA7/l;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iput-object v0, p0, Lcom/anilab/android/ui/rating/BottomSheetRating;->T0:LA7/l;

    .line 67
    .line 68
    new-instance v0, Lb5/G1;

    .line 69
    .line 70
    const-class v1, Li2/g;

    .line 71
    .line 72
    invoke-static {v1}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    new-instance v2, Li2/f;

    .line 77
    .line 78
    const/4 v3, 0x0

    .line 79
    invoke-direct {v2, p0, v3}, Li2/f;-><init>(Lcom/anilab/android/ui/rating/BottomSheetRating;I)V

    .line 80
    .line 81
    .line 82
    invoke-direct {v0, v1, v2}, Lb5/G1;-><init>(Lkotlin/jvm/internal/d;LO7/a;)V

    .line 83
    .line 84
    .line 85
    iput-object v0, p0, Lcom/anilab/android/ui/rating/BottomSheetRating;->U0:Lb5/G1;

    .line 86
    .line 87
    return-void
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


# virtual methods
.method public final n0()I
    .locals 1

    .line 1
    const v0, 0x7f0d0022

    return v0
.end method

.method public final o0(I)V
    .locals 7

    .line 1
    const v0, 0x7f0a0074

    .line 2
    .line 3
    .line 4
    if-eq p1, v0, :cond_1

    .line 5
    .line 6
    const v0, 0x7f0a00ac

    .line 7
    .line 8
    .line 9
    if-eq p1, v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-virtual {p0}, Lcom/anilab/android/ui/rating/BottomSheetRating;->t0()Li2/n;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    iget-object p1, p0, Lcom/anilab/android/ui/rating/BottomSheetRating;->U0:Lb5/G1;

    .line 17
    .line 18
    invoke-virtual {p1}, Lb5/G1;->getValue()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Li2/g;

    .line 23
    .line 24
    iget-object p1, p1, Li2/g;->a:Lcom/anilab/domain/model/Movie;

    .line 25
    .line 26
    invoke-virtual {p0}, LM1/g;->m0()LW/g;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, LJ1/m;

    .line 31
    .line 32
    iget-object v0, v0, LJ1/m;->x:Landroidx/appcompat/widget/AppCompatRatingBar;

    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getProgress()I

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    new-instance v1, Li2/m;

    .line 42
    .line 43
    const/4 v6, 0x0

    .line 44
    iget-wide v3, p1, Lcom/anilab/domain/model/Movie;->a:J

    .line 45
    .line 46
    invoke-direct/range {v1 .. v6}, Li2/m;-><init>(Li2/n;JILE7/d;)V

    .line 47
    .line 48
    .line 49
    const/4 p1, 0x0

    .line 50
    invoke-virtual {v2, p1, v1}, LM1/r;->d(ZLO7/p;)LY7/y0;

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_1
    invoke-static {p0}, Lcom/google/android/gms/internal/measurement/u1;->A(Li0/v;)Lu0/H;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {p1}, Lu0/H;->m()Z

    .line 59
    .line 60
    .line 61
    return-void
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

.method public final p0()V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/Y;->f(Landroidx/lifecycle/w;)Landroidx/lifecycle/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Li2/e;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, v2}, Li2/e;-><init>(Lcom/anilab/android/ui/rating/BottomSheetRating;LE7/d;)V

    .line 9
    .line 10
    .line 11
    const/4 v3, 0x3

    .line 12
    invoke-static {v0, v2, v1, v3}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/anilab/android/ui/rating/BottomSheetRating;->t0()Li2/n;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v1, p0, Lcom/anilab/android/ui/rating/BottomSheetRating;->U0:Lb5/G1;

    .line 20
    .line 21
    invoke-virtual {v1}, Lb5/G1;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Li2/g;

    .line 26
    .line 27
    iget-object v1, v1, Li2/g;->a:Lcom/anilab/domain/model/Movie;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    new-instance v3, Li2/l;

    .line 33
    .line 34
    iget-wide v4, v1, Lcom/anilab/domain/model/Movie;->a:J

    .line 35
    .line 36
    invoke-direct {v3, v0, v4, v5, v2}, Li2/l;-><init>(Li2/n;JLE7/d;)V

    .line 37
    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    invoke-virtual {v0, v1, v3}, LM1/r;->d(ZLO7/p;)LY7/y0;

    .line 41
    .line 42
    .line 43
    return-void
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

.method public final q0(LW/g;)Ljava/util/List;
    .locals 3

    .line 1
    check-cast p1, LJ1/m;

    .line 2
    .line 3
    iget-object v0, p1, LJ1/m;->v:Lcom/google/android/material/button/MaterialButton;

    .line 4
    .line 5
    iget-object p1, p1, LJ1/m;->w:Lcom/google/android/material/button/MaterialButton;

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
    check-cast v0, LJ1/m;

    .line 6
    .line 7
    iget-object v0, v0, LJ1/m;->z:Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, LM1/g;->m0()LW/g;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, LJ1/m;

    .line 18
    .line 19
    iget-object v1, p0, Lcom/anilab/android/ui/rating/BottomSheetRating;->T0:LA7/l;

    .line 20
    .line 21
    invoke-virtual {v1}, LA7/l;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Li2/j;

    .line 26
    .line 27
    iget-object v0, v0, LJ1/m;->z:Landroidx/recyclerview/widget/RecyclerView;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(LF0/S;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, LM1/g;->m0()LW/g;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, LJ1/m;

    .line 37
    .line 38
    iget-object v1, p0, Lcom/anilab/android/ui/rating/BottomSheetRating;->U0:Lb5/G1;

    .line 39
    .line 40
    invoke-virtual {v1}, Lb5/G1;->getValue()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    check-cast v2, Li2/g;

    .line 45
    .line 46
    iget-object v2, v2, Li2/g;->a:Lcom/anilab/domain/model/Movie;

    .line 47
    .line 48
    iget-wide v2, v2, Lcom/anilab/domain/model/Movie;->r:D

    .line 49
    .line 50
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    iget-object v0, v0, LJ1/m;->A:Landroidx/appcompat/widget/AppCompatTextView;

    .line 55
    .line 56
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, LM1/g;->m0()LW/g;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, LJ1/m;

    .line 64
    .line 65
    invoke-virtual {v1}, Lb5/G1;->getValue()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    check-cast v1, Li2/g;

    .line 70
    .line 71
    iget-object v1, v1, Li2/g;->a:Lcom/anilab/domain/model/Movie;

    .line 72
    .line 73
    iget-wide v1, v1, Lcom/anilab/domain/model/Movie;->r:D

    .line 74
    .line 75
    double-to-float v1, v1

    .line 76
    iget-object v0, v0, LJ1/m;->y:Landroidx/appcompat/widget/AppCompatRatingBar;

    .line 77
    .line 78
    invoke-virtual {v0, v1}, Landroid/widget/RatingBar;->setRating(F)V

    .line 79
    .line 80
    .line 81
    return-void
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

.method public final t0()Li2/n;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/anilab/android/ui/rating/BottomSheetRating;->S0:LY2/r;

    .line 2
    .line 3
    invoke-virtual {v0}, LY2/r;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Li2/n;

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
