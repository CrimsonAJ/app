.class public final Lcom/anilab/android/ui/categoryDetail/MovieListFragment;
.super LN1/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LN1/a<",
        "LN1/y;",
        "LJ1/A;",
        ">;"
    }
.end annotation


# instance fields
.field public final D0:LY2/r;

.field public final E0:Lb5/G1;

.field public final F0:LA7/l;

.field public final G0:LA7/l;


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, LN1/a;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LN1/q;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-direct {v0, p0, v1}, LN1/q;-><init>(Lcom/anilab/android/ui/categoryDetail/MovieListFragment;I)V

    .line 8
    .line 9
    .line 10
    sget-object v1, LA7/f;->a:LA7/f;

    .line 11
    .line 12
    new-instance v2, LN1/r;

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-direct {v2, v3, v0}, LN1/r;-><init>(ILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-static {v1, v2}, LZ0/a;->p(LA7/f;LO7/a;)LA7/e;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-class v1, LN1/y;

    .line 23
    .line 24
    invoke-static {v1}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    new-instance v2, LN1/s;

    .line 29
    .line 30
    invoke-direct {v2, v0, v3}, LN1/s;-><init>(LA7/e;I)V

    .line 31
    .line 32
    .line 33
    new-instance v3, LN1/s;

    .line 34
    .line 35
    const/4 v4, 0x1

    .line 36
    invoke-direct {v3, v0, v4}, LN1/s;-><init>(LA7/e;I)V

    .line 37
    .line 38
    .line 39
    new-instance v4, LN1/t;

    .line 40
    .line 41
    const/4 v5, 0x0

    .line 42
    invoke-direct {v4, p0, v0, v5}, LN1/t;-><init>(Li0/v;LA7/e;I)V

    .line 43
    .line 44
    .line 45
    invoke-static {p0, v1, v2, v3, v4}, LM4/a;->i(Li0/v;Lkotlin/jvm/internal/d;LO7/a;LO7/a;LO7/a;)LY2/r;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iput-object v0, p0, Lcom/anilab/android/ui/categoryDetail/MovieListFragment;->D0:LY2/r;

    .line 50
    .line 51
    new-instance v0, Lb5/G1;

    .line 52
    .line 53
    const-class v1, LN1/u;

    .line 54
    .line 55
    invoke-static {v1}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    new-instance v2, LN1/q;

    .line 60
    .line 61
    const/4 v3, 0x0

    .line 62
    invoke-direct {v2, p0, v3}, LN1/q;-><init>(Lcom/anilab/android/ui/categoryDetail/MovieListFragment;I)V

    .line 63
    .line 64
    .line 65
    invoke-direct {v0, v1, v2}, Lb5/G1;-><init>(Lkotlin/jvm/internal/d;LO7/a;)V

    .line 66
    .line 67
    .line 68
    iput-object v0, p0, Lcom/anilab/android/ui/categoryDetail/MovieListFragment;->E0:Lb5/G1;

    .line 69
    .line 70
    new-instance v0, LN1/g;

    .line 71
    .line 72
    const/4 v1, 0x0

    .line 73
    invoke-direct {v0, p0, v1}, LN1/g;-><init>(Lcom/anilab/android/ui/categoryDetail/MovieListFragment;I)V

    .line 74
    .line 75
    .line 76
    invoke-static {v0}, LZ0/a;->q(LO7/a;)LA7/l;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    iput-object v0, p0, Lcom/anilab/android/ui/categoryDetail/MovieListFragment;->F0:LA7/l;

    .line 81
    .line 82
    new-instance v0, LN1/g;

    .line 83
    .line 84
    const/4 v1, 0x1

    .line 85
    invoke-direct {v0, p0, v1}, LN1/g;-><init>(Lcom/anilab/android/ui/categoryDetail/MovieListFragment;I)V

    .line 86
    .line 87
    .line 88
    invoke-static {v0}, LZ0/a;->q(LO7/a;)LA7/l;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    iput-object v0, p0, Lcom/anilab/android/ui/categoryDetail/MovieListFragment;->G0:LA7/l;

    .line 93
    .line 94
    return-void
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
.method public final f0()I
    .locals 1

    .line 1
    const v0, 0x7f0d0048

    return v0
.end method

.method public final bridge synthetic h0()LM1/r;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/anilab/android/ui/categoryDetail/MovieListFragment;->t0()LN1/y;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
    .line 6
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
.end method

.method public final k0(I)V
    .locals 1

    .line 1
    const v0, 0x7f0a0071

    .line 2
    .line 3
    .line 4
    if-eq p1, v0, :cond_1

    .line 5
    .line 6
    const v0, 0x7f0a00a0

    .line 7
    .line 8
    .line 9
    if-eq p1, v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    const v0, 0x7f0a018f

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0, p1}, LM1/n;->i0(ILandroid/os/Bundle;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    invoke-static {p0}, LM1/n;->q0(LM1/n;)V

    .line 21
    .line 22
    .line 23
    return-void
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

.method public final l0()V
    .locals 4

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/Y;->f(Landroidx/lifecycle/w;)Landroidx/lifecycle/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, LN1/p;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, v2, p0}, LN1/p;-><init>(LE7/d;Lcom/anilab/android/ui/categoryDetail/MovieListFragment;)V

    .line 9
    .line 10
    .line 11
    const/4 v3, 0x3

    .line 12
    invoke-static {v0, v2, v1, v3}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/anilab/android/ui/categoryDetail/MovieListFragment;->t0()LN1/y;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p0}, Lcom/anilab/android/ui/categoryDetail/MovieListFragment;->s0()LN1/u;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iget-object v1, v1, LN1/u;->a:Lcom/anilab/domain/model/Shortcut;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    const/4 v3, 0x1

    .line 27
    invoke-virtual {v0, v1, v3, v2}, LN1/y;->g(Lcom/anilab/domain/model/Shortcut;IZ)V

    .line 28
    .line 29
    .line 30
    return-void
    .line 31
    .line 32
.end method

.method public final m0(LW/g;)Ljava/util/List;
    .locals 3

    .line 1
    check-cast p1, LJ1/A;

    .line 2
    .line 3
    iget-object v0, p1, LJ1/A;->v:Landroidx/appcompat/widget/AppCompatImageView;

    .line 4
    .line 5
    iget-object p1, p1, LJ1/A;->w:Landroidx/appcompat/widget/AppCompatImageView;

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    new-array v1, v1, [Landroidx/appcompat/widget/AppCompatImageView;

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

.method public final n0(Z)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/anilab/android/ui/categoryDetail/MovieListFragment;->t0()LN1/y;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, LN1/y;->m:Z

    .line 6
    .line 7
    const/16 v1, 0x8

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, LM1/n;->e0()LW/g;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, LJ1/A;

    .line 17
    .line 18
    const-string v3, "loadingLoadMore"

    .line 19
    .line 20
    iget-object v0, v0, LJ1/A;->y:Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    .line 21
    .line 22
    invoke-static {v0, v3}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    move v1, v2

    .line 28
    :cond_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    invoke-virtual {p0}, LM1/n;->e0()LW/g;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, LJ1/A;

    .line 37
    .line 38
    iget-object v0, v0, LJ1/A;->x:LJ1/E1;

    .line 39
    .line 40
    iget-object v0, v0, LW/g;->k:Landroid/view/View;

    .line 41
    .line 42
    const-string v3, "getRoot(...)"

    .line 43
    .line 44
    invoke-static {v0, v3}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    if-eqz p1, :cond_2

    .line 48
    .line 49
    move v1, v2

    .line 50
    :cond_2
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 51
    .line 52
    .line 53
    return-void
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
.end method

.method public final p0()V
    .locals 7

    .line 1
    invoke-virtual {p0}, LM1/n;->e0()LW/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, LJ1/A;

    .line 6
    .line 7
    iget-object v1, v0, LJ1/A;->z:Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 11
    .line 12
    .line 13
    iget-object v3, p0, Lcom/anilab/android/ui/categoryDetail/MovieListFragment;->F0:LA7/l;

    .line 14
    .line 15
    invoke-virtual {v3}, LA7/l;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    check-cast v4, LN1/f;

    .line 20
    .line 21
    invoke-virtual {v1, v4}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(LF0/S;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/anilab/android/ui/categoryDetail/MovieListFragment;->s0()LN1/u;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    iget-object v4, v4, LN1/u;->a:Lcom/anilab/domain/model/Shortcut;

    .line 29
    .line 30
    iget-boolean v4, v4, Lcom/anilab/domain/model/Shortcut;->d:Z

    .line 31
    .line 32
    iget-object v5, v0, LW/g;->k:Landroid/view/View;

    .line 33
    .line 34
    if-eqz v4, :cond_1

    .line 35
    .line 36
    invoke-virtual {p0}, Li0/v;->q()Landroid/content/res/Resources;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    const v6, 0x7f0b004d

    .line 41
    .line 42
    .line 43
    invoke-virtual {v4, v6}, Landroid/content/res/Resources;->getInteger(I)I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    new-instance v6, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 48
    .line 49
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 50
    .line 51
    .line 52
    if-gt v2, v4, :cond_0

    .line 53
    .line 54
    const/4 v2, 0x4

    .line 55
    if-ge v4, v2, :cond_0

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    const/4 v4, 0x2

    .line 59
    :goto_0
    invoke-direct {v6, v4}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, v6}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/a;)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    new-instance v4, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 67
    .line 68
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 69
    .line 70
    .line 71
    invoke-direct {v4, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1, v4}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/a;)V

    .line 75
    .line 76
    .line 77
    :goto_1
    new-instance v2, LN1/h;

    .line 78
    .line 79
    const/4 v4, 0x0

    .line 80
    invoke-direct {v2, v0, v4, p0}, LN1/h;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    iget-object v4, v0, LJ1/A;->A:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 84
    .line 85
    invoke-virtual {v4, v2}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setOnRefreshListener(LV0/i;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0}, Lcom/anilab/android/ui/categoryDetail/MovieListFragment;->s0()LN1/u;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    iget-object v2, v2, LN1/u;->a:Lcom/anilab/domain/model/Shortcut;

    .line 93
    .line 94
    iget-object v0, v0, LJ1/A;->B:Landroidx/appcompat/widget/AppCompatTextView;

    .line 95
    .line 96
    iget-object v2, v2, Lcom/anilab/domain/model/Shortcut;->b:Ljava/lang/String;

    .line 97
    .line 98
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/a;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    iget-object v2, p0, Lcom/anilab/android/ui/categoryDetail/MovieListFragment;->G0:LA7/l;

    .line 106
    .line 107
    if-eqz v0, :cond_2

    .line 108
    .line 109
    invoke-virtual {v2}, LA7/l;->getValue()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    check-cast v4, LN1/j;

    .line 114
    .line 115
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    iput-object v0, v4, LM1/s;->i:Landroidx/recyclerview/widget/a;

    .line 119
    .line 120
    :cond_2
    invoke-virtual {v2}, LA7/l;->getValue()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    check-cast v0, LN1/j;

    .line 125
    .line 126
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->j(LF0/e0;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v3}, LA7/l;->getValue()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    check-cast v0, LN1/f;

    .line 134
    .line 135
    invoke-virtual {p0}, Lcom/anilab/android/ui/categoryDetail/MovieListFragment;->t0()LN1/y;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    iget-object v1, v1, LN1/y;->j:LP2/e;

    .line 140
    .line 141
    iget-object v1, v1, LP2/e;->a:LC2/g0;

    .line 142
    .line 143
    invoke-virtual {v1}, LC2/g0;->b()Z

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    iput-boolean v1, v0, LN1/f;->i:Z

    .line 148
    .line 149
    return-void
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
.end method

.method public final s0()LN1/u;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/anilab/android/ui/categoryDetail/MovieListFragment;->E0:Lb5/G1;

    .line 2
    .line 3
    invoke-interface {v0}, LA7/e;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LN1/u;

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

.method public final t0()LN1/y;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/anilab/android/ui/categoryDetail/MovieListFragment;->D0:LY2/r;

    .line 2
    .line 3
    invoke-virtual {v0}, LY2/r;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LN1/y;

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
