.class public final Lcom/anilab/android/ui/update/CommonErrorDialogFragment;
.super Li0/n;
.source "SourceFile"

# interfaces
.implements Lx7/b;


# instance fields
.field public L0:Landroid/content/ContextWrapper;

.field public M0:Z

.field public volatile N0:Lv7/f;

.field public final O0:Ljava/lang/Object;

.field public P0:Z

.field public Q0:LJ1/u;

.field public final R0:LY2/r;


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, Li0/n;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/anilab/android/ui/update/CommonErrorDialogFragment;->O0:Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lcom/anilab/android/ui/update/CommonErrorDialogFragment;->P0:Z

    .line 13
    .line 14
    new-instance v0, Le2/e;

    .line 15
    .line 16
    const/16 v1, 0x16

    .line 17
    .line 18
    invoke-direct {v0, v1, p0}, Le2/e;-><init>(ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    sget-object v1, LA7/f;->a:LA7/f;

    .line 22
    .line 23
    new-instance v2, Le2/e;

    .line 24
    .line 25
    const/16 v3, 0x17

    .line 26
    .line 27
    invoke-direct {v2, v3, v0}, Le2/e;-><init>(ILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v1, v2}, LZ0/a;->p(LA7/f;LO7/a;)LA7/e;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const-class v1, Lq2/c;

    .line 35
    .line 36
    invoke-static {v1}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    new-instance v2, Lo2/o;

    .line 41
    .line 42
    const/4 v3, 0x4

    .line 43
    invoke-direct {v2, v0, v3}, Lo2/o;-><init>(LA7/e;I)V

    .line 44
    .line 45
    .line 46
    new-instance v3, Lo2/o;

    .line 47
    .line 48
    const/4 v4, 0x5

    .line 49
    invoke-direct {v3, v0, v4}, Lo2/o;-><init>(LA7/e;I)V

    .line 50
    .line 51
    .line 52
    new-instance v4, Lo2/p;

    .line 53
    .line 54
    const/4 v5, 0x2

    .line 55
    invoke-direct {v4, p0, v0, v5}, Lo2/p;-><init>(Li0/v;LA7/e;I)V

    .line 56
    .line 57
    .line 58
    invoke-static {p0, v1, v2, v3, v4}, LM4/a;->i(Li0/v;Lkotlin/jvm/internal/d;LO7/a;LO7/a;LO7/a;)LY2/r;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iput-object v0, p0, Lcom/anilab/android/ui/update/CommonErrorDialogFragment;->R0:LY2/r;

    .line 63
    .line 64
    return-void
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


# virtual methods
.method public final D(Landroid/app/Activity;)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Li0/v;->D:Z

    .line 3
    .line 4
    iget-object v1, p0, Lcom/anilab/android/ui/update/CommonErrorDialogFragment;->L0:Landroid/content/ContextWrapper;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    invoke-static {v1}, Lv7/f;->b(Landroid/content/Context;)Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-ne v1, p1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move p1, v2

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    :goto_0
    move p1, v0

    .line 19
    :goto_1
    const-string v1, "onAttach called multiple times with different Context! Hilt Fragments should not be retained."

    .line 20
    .line 21
    new-array v2, v2, [Ljava/lang/Object;

    .line 22
    .line 23
    invoke-static {p1, v1, v2}, Ls8/e;->h(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/anilab/android/ui/update/CommonErrorDialogFragment;->l0()V

    .line 27
    .line 28
    .line 29
    iget-boolean p1, p0, Lcom/anilab/android/ui/update/CommonErrorDialogFragment;->P0:Z

    .line 30
    .line 31
    if-nez p1, :cond_2

    .line 32
    .line 33
    iput-boolean v0, p0, Lcom/anilab/android/ui/update/CommonErrorDialogFragment;->P0:Z

    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/anilab/android/ui/update/CommonErrorDialogFragment;->e()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Lq2/b;

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    :cond_2
    return-void
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
.end method

.method public final E(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Li0/n;->E(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/anilab/android/ui/update/CommonErrorDialogFragment;->l0()V

    .line 5
    .line 6
    .line 7
    iget-boolean p1, p0, Lcom/anilab/android/ui/update/CommonErrorDialogFragment;->P0:Z

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    iput-boolean p1, p0, Lcom/anilab/android/ui/update/CommonErrorDialogFragment;->P0:Z

    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/anilab/android/ui/update/CommonErrorDialogFragment;->e()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lq2/b;

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    :cond_0
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

.method public final G(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const-string v2, "inflater"

    .line 4
    .line 5
    invoke-static {p1, v2}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget v2, LJ1/u;->y:I

    .line 9
    .line 10
    const v2, 0x7f0d003c

    .line 11
    .line 12
    .line 13
    invoke-static {p1, v2, p2, v1}, LW/c;->b(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)LW/g;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, LJ1/u;

    .line 18
    .line 19
    iput-object p1, p0, Lcom/anilab/android/ui/update/CommonErrorDialogFragment;->Q0:LJ1/u;

    .line 20
    .line 21
    invoke-virtual {p0, v1}, Li0/n;->i0(Z)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lcom/anilab/android/ui/update/CommonErrorDialogFragment;->Q0:LJ1/u;

    .line 25
    .line 26
    const/4 p2, 0x0

    .line 27
    const-string v2, "binding"

    .line 28
    .line 29
    if-eqz p1, :cond_4

    .line 30
    .line 31
    iget-object p1, p1, LJ1/u;->x:Landroid/widget/TextView;

    .line 32
    .line 33
    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lcom/anilab/android/ui/update/CommonErrorDialogFragment;->Q0:LJ1/u;

    .line 41
    .line 42
    if-eqz p1, :cond_3

    .line 43
    .line 44
    iget-object v3, p0, Lcom/anilab/android/ui/update/CommonErrorDialogFragment;->R0:LY2/r;

    .line 45
    .line 46
    invoke-virtual {v3}, LY2/r;->getValue()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    check-cast v3, Lq2/c;

    .line 51
    .line 52
    iget-object v3, v3, Lq2/c;->g:Ljava/lang/String;

    .line 53
    .line 54
    new-array v4, v0, [Ljava/lang/Object;

    .line 55
    .line 56
    aput-object v3, v4, v1

    .line 57
    .line 58
    const v3, 0x7f140177

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, v3, v4}, Li0/v;->s(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    iget-object p1, p1, LJ1/u;->x:Landroid/widget/TextView;

    .line 66
    .line 67
    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 68
    .line 69
    .line 70
    iget-object p1, p0, Lcom/anilab/android/ui/update/CommonErrorDialogFragment;->Q0:LJ1/u;

    .line 71
    .line 72
    if-eqz p1, :cond_2

    .line 73
    .line 74
    new-instance v3, Lq2/a;

    .line 75
    .line 76
    invoke-direct {v3, p0, v1}, Lq2/a;-><init>(Lcom/anilab/android/ui/update/CommonErrorDialogFragment;I)V

    .line 77
    .line 78
    .line 79
    iget-object p1, p1, LJ1/u;->v:Lcom/google/android/material/button/MaterialButton;

    .line 80
    .line 81
    invoke-virtual {p1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 82
    .line 83
    .line 84
    iget-object p1, p0, Lcom/anilab/android/ui/update/CommonErrorDialogFragment;->Q0:LJ1/u;

    .line 85
    .line 86
    if-eqz p1, :cond_1

    .line 87
    .line 88
    new-instance v1, Lq2/a;

    .line 89
    .line 90
    invoke-direct {v1, p0, v0}, Lq2/a;-><init>(Lcom/anilab/android/ui/update/CommonErrorDialogFragment;I)V

    .line 91
    .line 92
    .line 93
    iget-object p1, p1, LJ1/u;->w:Lcom/google/android/material/button/MaterialButton;

    .line 94
    .line 95
    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 96
    .line 97
    .line 98
    iget-object p1, p0, Lcom/anilab/android/ui/update/CommonErrorDialogFragment;->Q0:LJ1/u;

    .line 99
    .line 100
    if-eqz p1, :cond_0

    .line 101
    .line 102
    iget-object p1, p1, LW/g;->k:Landroid/view/View;

    .line 103
    .line 104
    const-string p2, "getRoot(...)"

    .line 105
    .line 106
    invoke-static {p1, p2}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    return-object p1

    .line 110
    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/h;->h(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    throw p2

    .line 114
    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/h;->h(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    throw p2

    .line 118
    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/h;->h(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    throw p2

    .line 122
    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/h;->h(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    throw p2

    .line 126
    :cond_4
    invoke-static {v2}, Lkotlin/jvm/internal/h;->h(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    throw p2
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
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
.end method

.method public final K(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
    .locals 1

    .line 1
    invoke-super {p0, p1}, Li0/n;->K(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Lv7/h;

    .line 6
    .line 7
    invoke-direct {v0, p1, p0}, Lv7/h;-><init>(Landroid/view/LayoutInflater;Li0/v;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, v0}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
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

.method public final O()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Li0/v;->D:Z

    .line 3
    .line 4
    iget-object v0, p0, Li0/n;->G0:Landroid/app/Dialog;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 21
    .line 22
    .line 23
    const/4 v1, -0x1

    .line 24
    invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setLayout(II)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public final e()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/anilab/android/ui/update/CommonErrorDialogFragment;->N0:Lv7/f;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/anilab/android/ui/update/CommonErrorDialogFragment;->O0:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object v1, p0, Lcom/anilab/android/ui/update/CommonErrorDialogFragment;->N0:Lv7/f;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lv7/f;

    .line 13
    .line 14
    invoke-direct {v1, p0}, Lv7/f;-><init>(Li0/v;)V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, Lcom/anilab/android/ui/update/CommonErrorDialogFragment;->N0:Lv7/f;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v1

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    monitor-exit v0

    .line 23
    goto :goto_2

    .line 24
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw v1

    .line 26
    :cond_1
    :goto_2
    iget-object v0, p0, Lcom/anilab/android/ui/update/CommonErrorDialogFragment;->N0:Lv7/f;

    .line 27
    .line 28
    invoke-virtual {v0}, Lv7/f;->e()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    return-object v0
.end method

.method public final g0(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 3

    .line 1
    invoke-super {p0, p1}, Li0/n;->g0(Landroid/os/Bundle;)Landroid/app/Dialog;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 18
    .line 19
    .line 20
    const/4 v1, -0x1

    .line 21
    invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setLayout(II)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-object p1
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

.method public final j()Landroidx/lifecycle/h0;
    .locals 1

    .line 1
    invoke-super {p0}, Li0/v;->j()Landroidx/lifecycle/h0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0, v0}, LZ0/a;->i(Li0/v;Landroidx/lifecycle/h0;)Lu7/e;

    .line 6
    .line 7
    .line 8
    move-result-object v0

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

.method public final l0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/anilab/android/ui/update/CommonErrorDialogFragment;->L0:Landroid/content/ContextWrapper;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0}, Li0/v;->m()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Lv7/h;

    .line 10
    .line 11
    invoke-direct {v1, v0, p0}, Lv7/h;-><init>(Landroid/content/Context;Li0/v;)V

    .line 12
    .line 13
    .line 14
    iput-object v1, p0, Lcom/anilab/android/ui/update/CommonErrorDialogFragment;->L0:Landroid/content/ContextWrapper;

    .line 15
    .line 16
    invoke-super {p0}, Li0/v;->m()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0}, La/a;->t(Landroid/content/Context;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iput-boolean v0, p0, Lcom/anilab/android/ui/update/CommonErrorDialogFragment;->M0:Z

    .line 25
    .line 26
    :cond_0
    return-void
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public final m()Landroid/content/Context;
    .locals 1

    .line 1
    invoke-super {p0}, Li0/v;->m()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-boolean v0, p0, Lcom/anilab/android/ui/update/CommonErrorDialogFragment;->M0:Z

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0

    .line 13
    :cond_0
    invoke-virtual {p0}, Lcom/anilab/android/ui/update/CommonErrorDialogFragment;->l0()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/anilab/android/ui/update/CommonErrorDialogFragment;->L0:Landroid/content/ContextWrapper;

    .line 17
    .line 18
    return-object v0
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
