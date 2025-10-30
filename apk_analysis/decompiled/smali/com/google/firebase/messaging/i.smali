.class public final synthetic Lcom/google/firebase/messaging/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf5/a;
.implements LP/o;
.implements Li4/l;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/firebase/messaging/i;->b:Ljava/lang/Object;

    iput-object p2, p0, Lcom/google/firebase/messaging/i;->c:Ljava/lang/Object;

    iput-boolean p3, p0, Lcom/google/firebase/messaging/i;->a:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILN3/m0;[I)LP5/S;
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/google/firebase/messaging/i;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Li4/o;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    new-instance v8, Li4/d;

    .line 9
    .line 10
    invoke-direct {v8, v0}, Li4/d;-><init>(Li4/o;)V

    .line 11
    .line 12
    .line 13
    sget-object v0, LP5/F;->b:LP5/D;

    .line 14
    .line 15
    const/4 v0, 0x4

    .line 16
    const-string v1, "initialCapacity"

    .line 17
    .line 18
    invoke-static {v0, v1}, LP5/q;->c(ILjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-array v0, v0, [Ljava/lang/Object;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    move v4, v1

    .line 25
    move v9, v4

    .line 26
    :goto_0
    iget v1, p2, LN3/m0;->a:I

    .line 27
    .line 28
    if-ge v4, v1, :cond_1

    .line 29
    .line 30
    new-instance v1, Li4/e;

    .line 31
    .line 32
    aget v6, p3, v4

    .line 33
    .line 34
    iget-object v2, p0, Lcom/google/firebase/messaging/i;->c:Ljava/lang/Object;

    .line 35
    .line 36
    move-object v5, v2

    .line 37
    check-cast v5, Li4/h;

    .line 38
    .line 39
    iget-boolean v7, p0, Lcom/google/firebase/messaging/i;->a:Z

    .line 40
    .line 41
    move v2, p1

    .line 42
    move-object v3, p2

    .line 43
    invoke-direct/range {v1 .. v8}, Li4/e;-><init>(ILN3/m0;ILi4/h;IZLi4/d;)V

    .line 44
    .line 45
    .line 46
    add-int/lit8 p1, v9, 0x1

    .line 47
    .line 48
    array-length p2, v0

    .line 49
    if-ge p2, p1, :cond_0

    .line 50
    .line 51
    array-length p2, v0

    .line 52
    invoke-static {p2, p1}, LP5/C;->e(II)I

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    invoke-static {v0, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    move-object v0, p2

    .line 61
    :cond_0
    aput-object v1, v0, v9

    .line 62
    .line 63
    add-int/lit8 v4, v4, 0x1

    .line 64
    .line 65
    move v9, p1

    .line 66
    move p1, v2

    .line 67
    move-object p2, v3

    .line 68
    goto :goto_0

    .line 69
    :cond_1
    invoke-static {v9, v0}, LP5/F;->k(I[Ljava/lang/Object;)LP5/S;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    return-object p1
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
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
.end method

.method public i(Lf5/h;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, LK4/b;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p1}, Lf5/h;->g()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/16 v1, 0x192

    .line 18
    .line 19
    if-eq v0, v1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object p1, p0, Lcom/google/firebase/messaging/i;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p1, Landroid/content/Intent;

    .line 25
    .line 26
    iget-boolean v0, p0, Lcom/google/firebase/messaging/i;->a:Z

    .line 27
    .line 28
    iget-object v1, p0, Lcom/google/firebase/messaging/i;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, Landroid/content/Context;

    .line 31
    .line 32
    invoke-static {v1, p1, v0}, Lcom/google/firebase/messaging/j;->a(Landroid/content/Context;Landroid/content/Intent;Z)Lf5/q;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    new-instance v0, LC0/e;

    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    invoke-direct {v0, v1}, LC0/e;-><init>(I)V

    .line 40
    .line 41
    .line 42
    new-instance v1, LX0/k;

    .line 43
    .line 44
    const/16 v2, 0xb

    .line 45
    .line 46
    invoke-direct {v1, v2}, LX0/k;-><init>(I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, v0, v1}, Lf5/q;->l(Ljava/util/concurrent/Executor;Lf5/a;)Lf5/q;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    :cond_1
    :goto_0
    return-object p1
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

.method public t(Landroid/view/View;LP/u0;)LP/u0;
    .locals 9

    .line 1
    sget p1, Lcom/anilab/android/ui/player/PlayerActivity;->w0:I

    .line 2
    .line 3
    iget-object p1, p2, LP/u0;->a:LP/r0;

    .line 4
    .line 5
    const/16 p2, 0x89

    .line 6
    .line 7
    invoke-virtual {p1, p2}, LP/r0;->f(I)LH/c;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    const/16 v0, 0x8

    .line 12
    .line 13
    invoke-virtual {p1, v0}, LP/r0;->o(I)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    iget-object v1, p0, Lcom/google/firebase/messaging/i;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Lkotlin/jvm/internal/k;

    .line 20
    .line 21
    iget-boolean v2, v1, Lkotlin/jvm/internal/k;->a:Z

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    iget-object v4, p0, Lcom/google/firebase/messaging/i;->c:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v4, Lcom/anilab/android/ui/player/PlayerActivity;

    .line 27
    .line 28
    const-string v5, "binding"

    .line 29
    .line 30
    const/4 v6, 0x0

    .line 31
    if-eq p1, v2, :cond_3

    .line 32
    .line 33
    iget-object v2, v4, Lcom/anilab/android/ui/player/PlayerActivity;->D:LJ1/c;

    .line 34
    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    iput-boolean p1, v1, Lkotlin/jvm/internal/k;->a:Z

    .line 38
    .line 39
    iget-object v1, v2, LJ1/c;->I:Landroid/widget/FrameLayout;

    .line 40
    .line 41
    const-string v7, "layoutComment"

    .line 42
    .line 43
    invoke-static {v1, v7}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    if-nez p1, :cond_0

    .line 47
    .line 48
    invoke-virtual {v4}, Li/h;->getResources()Landroid/content/res/Resources;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    invoke-virtual {v7}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    iget v7, v7, Landroid/content/res/Configuration;->orientation:I

    .line 57
    .line 58
    const/4 v8, 0x2

    .line 59
    if-eq v7, v8, :cond_0

    .line 60
    .line 61
    move v0, v6

    .line 62
    :cond_0
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 63
    .line 64
    .line 65
    if-eqz p1, :cond_1

    .line 66
    .line 67
    move p1, v6

    .line 68
    goto :goto_0

    .line 69
    :cond_1
    iget p1, p2, LH/c;->d:I

    .line 70
    .line 71
    :goto_0
    iget-object v0, v2, LJ1/c;->J:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 72
    .line 73
    invoke-virtual {v0, v6, v6, v6, p1}, Landroid/view/View;->setPadding(IIII)V

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_2
    invoke-static {v5}, Lkotlin/jvm/internal/h;->h(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw v3

    .line 81
    :cond_3
    :goto_1
    iget-boolean p1, p0, Lcom/google/firebase/messaging/i;->a:Z

    .line 82
    .line 83
    if-eqz p1, :cond_4

    .line 84
    .line 85
    iget p1, p2, LH/c;->b:I

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_4
    move p1, v6

    .line 89
    :goto_2
    iget-object v0, v4, Lcom/anilab/android/ui/player/PlayerActivity;->D:LJ1/c;

    .line 90
    .line 91
    if-eqz v0, :cond_5

    .line 92
    .line 93
    iget p2, p2, LH/c;->d:I

    .line 94
    .line 95
    iget-object v0, v0, LW/g;->k:Landroid/view/View;

    .line 96
    .line 97
    invoke-virtual {v0, v6, p1, v6, p2}, Landroid/view/View;->setPadding(IIII)V

    .line 98
    .line 99
    .line 100
    sget-object p1, LP/u0;->b:LP/u0;

    .line 101
    .line 102
    return-object p1

    .line 103
    :cond_5
    invoke-static {v5}, Lkotlin/jvm/internal/h;->h(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    throw v3
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
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
