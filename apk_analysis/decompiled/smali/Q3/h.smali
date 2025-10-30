.class public final LQ3/h;
.super LN3/a;
.source "SourceFile"


# instance fields
.field public A:Lk4/M;

.field public B:Lk4/W;

.field public C:LN3/M;

.field public D:Landroid/os/Handler;

.field public X:Lj3/T;

.field public Y:Landroid/net/Uri;

.field public final Z:Landroid/net/Uri;

.field public f0:LR3/c;

.field public g0:Z

.field public final h:Lj3/Y;

.field public h0:J

.field public final i:Z

.field public i0:J

.field public final j:Lk4/l;

.field public j0:J

.field public final k:Lo1/f;

.field public k0:I

.field public final l:LF5/e;

.field public l0:J

.field public final m:Ln3/o;

.field public m0:I

.field public final n:Le1/q;

.field public final o:Lcom/google/firebase/messaging/s;

.field public final p:J

.field public final q:LN3/G;

.field public final r:Lk4/O;

.field public final s:Lo1/f;

.field public final t:Ljava/lang/Object;

.field public final u:Landroid/util/SparseArray;

.field public final v:LQ3/c;

.field public final w:LQ3/c;

.field public final x:LQ3/f;

.field public final y:Lk4/N;

.field public z:Lk4/m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "goog.exo.dash"

    .line 2
    .line 3
    invoke-static {v0}, Lj3/K;->a(Ljava/lang/String;)V

    .line 4
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
.end method

.method public constructor <init>(Lj3/Y;Lk4/l;Lk4/O;Lo1/f;LF5/e;Ln3/o;Le1/q;J)V
    .locals 1

    .line 1
    invoke-direct {p0}, LN3/a;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LQ3/h;->h:Lj3/Y;

    .line 5
    .line 6
    iget-object v0, p1, Lj3/Y;->c:Lj3/T;

    .line 7
    .line 8
    iput-object v0, p0, LQ3/h;->X:Lj3/T;

    .line 9
    .line 10
    iget-object p1, p1, Lj3/Y;->b:Lj3/U;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object p1, p1, Lj3/U;->a:Landroid/net/Uri;

    .line 16
    .line 17
    iput-object p1, p0, LQ3/h;->Y:Landroid/net/Uri;

    .line 18
    .line 19
    iput-object p1, p0, LQ3/h;->Z:Landroid/net/Uri;

    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    iput-object p1, p0, LQ3/h;->f0:LR3/c;

    .line 23
    .line 24
    iput-object p2, p0, LQ3/h;->j:Lk4/l;

    .line 25
    .line 26
    iput-object p3, p0, LQ3/h;->r:Lk4/O;

    .line 27
    .line 28
    iput-object p4, p0, LQ3/h;->k:Lo1/f;

    .line 29
    .line 30
    iput-object p6, p0, LQ3/h;->m:Ln3/o;

    .line 31
    .line 32
    iput-object p7, p0, LQ3/h;->n:Le1/q;

    .line 33
    .line 34
    iput-wide p8, p0, LQ3/h;->p:J

    .line 35
    .line 36
    iput-object p5, p0, LQ3/h;->l:LF5/e;

    .line 37
    .line 38
    new-instance p2, Lcom/google/firebase/messaging/s;

    .line 39
    .line 40
    const/4 p3, 0x4

    .line 41
    invoke-direct {p2, p3}, Lcom/google/firebase/messaging/s;-><init>(I)V

    .line 42
    .line 43
    .line 44
    iput-object p2, p0, LQ3/h;->o:Lcom/google/firebase/messaging/s;

    .line 45
    .line 46
    const/4 p2, 0x0

    .line 47
    iput-boolean p2, p0, LQ3/h;->i:Z

    .line 48
    .line 49
    invoke-virtual {p0, p1}, LN3/a;->a(LN3/A;)LN3/G;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    iput-object p1, p0, LQ3/h;->q:LN3/G;

    .line 54
    .line 55
    new-instance p1, Ljava/lang/Object;

    .line 56
    .line 57
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-object p1, p0, LQ3/h;->t:Ljava/lang/Object;

    .line 61
    .line 62
    new-instance p1, Landroid/util/SparseArray;

    .line 63
    .line 64
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    .line 65
    .line 66
    .line 67
    iput-object p1, p0, LQ3/h;->u:Landroid/util/SparseArray;

    .line 68
    .line 69
    new-instance p1, LQ3/f;

    .line 70
    .line 71
    invoke-direct {p1, p0}, LQ3/f;-><init>(LQ3/h;)V

    .line 72
    .line 73
    .line 74
    iput-object p1, p0, LQ3/h;->x:LQ3/f;

    .line 75
    .line 76
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    iput-wide p1, p0, LQ3/h;->l0:J

    .line 82
    .line 83
    iput-wide p1, p0, LQ3/h;->j0:J

    .line 84
    .line 85
    new-instance p1, Lo1/f;

    .line 86
    .line 87
    const/16 p2, 0x11

    .line 88
    .line 89
    invoke-direct {p1, p2, p0}, Lo1/f;-><init>(ILjava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    iput-object p1, p0, LQ3/h;->s:Lo1/f;

    .line 93
    .line 94
    new-instance p1, LQ3/d;

    .line 95
    .line 96
    invoke-direct {p1, p0}, LQ3/d;-><init>(LQ3/h;)V

    .line 97
    .line 98
    .line 99
    iput-object p1, p0, LQ3/h;->y:Lk4/N;

    .line 100
    .line 101
    new-instance p1, LQ3/c;

    .line 102
    .line 103
    const/4 p2, 0x0

    .line 104
    invoke-direct {p1, p0, p2}, LQ3/c;-><init>(LQ3/h;I)V

    .line 105
    .line 106
    .line 107
    iput-object p1, p0, LQ3/h;->v:LQ3/c;

    .line 108
    .line 109
    new-instance p1, LQ3/c;

    .line 110
    .line 111
    const/4 p2, 0x1

    .line 112
    invoke-direct {p1, p0, p2}, LQ3/c;-><init>(LQ3/h;I)V

    .line 113
    .line 114
    .line 115
    iput-object p1, p0, LQ3/h;->w:LQ3/c;

    .line 116
    .line 117
    return-void
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
.end method

.method public static v(LR3/h;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget-object v2, p0, LR3/h;->c:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v3

    .line 9
    if-ge v1, v3, :cond_2

    .line 10
    .line 11
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, LR3/a;

    .line 16
    .line 17
    iget v2, v2, LR3/a;->b:I

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    if-eq v2, v3, :cond_1

    .line 21
    .line 22
    const/4 v4, 0x2

    .line 23
    if-ne v2, v4, :cond_0

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    :goto_1
    return v3

    .line 30
    :cond_2
    return v0
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
.method public final b(LN3/A;Lk4/q;J)LN3/x;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v4, p1

    .line 4
    .line 5
    iget-object v1, v4, LN3/y;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget v2, v0, LQ3/h;->m0:I

    .line 14
    .line 15
    sub-int v7, v1, v2

    .line 16
    .line 17
    iget-object v1, v0, LQ3/h;->f0:LR3/c;

    .line 18
    .line 19
    invoke-virtual {v1, v7}, LR3/c;->b(I)LR3/h;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iget-wide v5, v1, LR3/h;->b:J

    .line 24
    .line 25
    new-instance v13, LN3/G;

    .line 26
    .line 27
    iget-object v1, v0, LN3/a;->c:LN3/G;

    .line 28
    .line 29
    iget-object v2, v1, LN3/G;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    move-object v1, v13

    .line 33
    invoke-direct/range {v1 .. v6}, LN3/G;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILN3/A;J)V

    .line 34
    .line 35
    .line 36
    new-instance v11, Ln3/l;

    .line 37
    .line 38
    iget-object v1, v0, LN3/a;->d:Ln3/l;

    .line 39
    .line 40
    iget-object v1, v1, Ln3/l;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    invoke-direct {v11, v1, v2, v4}, Ln3/l;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILN3/A;)V

    .line 44
    .line 45
    .line 46
    new-instance v3, LQ3/b;

    .line 47
    .line 48
    iget v1, v0, LQ3/h;->m0:I

    .line 49
    .line 50
    add-int v4, v1, v7

    .line 51
    .line 52
    iget-object v5, v0, LQ3/h;->f0:LR3/c;

    .line 53
    .line 54
    iget-object v9, v0, LQ3/h;->B:Lk4/W;

    .line 55
    .line 56
    iget-wide v14, v0, LQ3/h;->j0:J

    .line 57
    .line 58
    iget-object v1, v0, LN3/a;->g:Lk3/l;

    .line 59
    .line 60
    invoke-static {v1}, Ll4/a;->n(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iget-object v2, v0, LQ3/h;->l:LF5/e;

    .line 64
    .line 65
    iget-object v6, v0, LQ3/h;->x:LQ3/f;

    .line 66
    .line 67
    move-object/from16 v19, v6

    .line 68
    .line 69
    iget-object v6, v0, LQ3/h;->o:Lcom/google/firebase/messaging/s;

    .line 70
    .line 71
    iget-object v8, v0, LQ3/h;->k:Lo1/f;

    .line 72
    .line 73
    iget-object v10, v0, LQ3/h;->m:Ln3/o;

    .line 74
    .line 75
    iget-object v12, v0, LQ3/h;->n:Le1/q;

    .line 76
    .line 77
    move-object/from16 v20, v1

    .line 78
    .line 79
    iget-object v1, v0, LQ3/h;->y:Lk4/N;

    .line 80
    .line 81
    move-object/from16 v17, p2

    .line 82
    .line 83
    move-object/from16 v16, v1

    .line 84
    .line 85
    move-object/from16 v18, v2

    .line 86
    .line 87
    invoke-direct/range {v3 .. v20}, LQ3/b;-><init>(ILR3/c;Lcom/google/firebase/messaging/s;ILo1/f;Lk4/W;Ln3/o;Ln3/l;Le1/q;LN3/G;JLk4/N;Lk4/q;LF5/e;LQ3/f;Lk3/l;)V

    .line 88
    .line 89
    .line 90
    iget-object v1, v0, LQ3/h;->u:Landroid/util/SparseArray;

    .line 91
    .line 92
    invoke-virtual {v1, v4, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    return-object v3
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

.method public final j()Lj3/Y;
    .locals 1

    .line 1
    iget-object v0, p0, LQ3/h;->h:Lj3/Y;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
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

.method public final l()V
    .locals 1

    .line 1
    iget-object v0, p0, LQ3/h;->y:Lk4/N;

    .line 2
    .line 3
    invoke-interface {v0}, Lk4/N;->b()V

    .line 4
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
.end method

.method public final n(Lk4/W;)V
    .locals 2

    .line 1
    iput-object p1, p0, LQ3/h;->B:Lk4/W;

    .line 2
    .line 3
    iget-object p1, p0, LQ3/h;->m:Ln3/o;

    .line 4
    .line 5
    invoke-interface {p1}, Ln3/o;->b()V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, LN3/a;->g:Lk3/l;

    .line 13
    .line 14
    invoke-static {v1}, Ll4/a;->n(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p1, v0, v1}, Ln3/o;->l(Landroid/os/Looper;Lk3/l;)V

    .line 18
    .line 19
    .line 20
    iget-boolean p1, p0, LQ3/h;->i:Z

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    invoke-virtual {p0, p1}, LQ3/h;->x(Z)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    iget-object p1, p0, LQ3/h;->j:Lk4/l;

    .line 30
    .line 31
    invoke-interface {p1}, Lk4/l;->c()Lk4/m;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iput-object p1, p0, LQ3/h;->z:Lk4/m;

    .line 36
    .line 37
    new-instance p1, Lk4/M;

    .line 38
    .line 39
    const-string v0, "DashMediaSource"

    .line 40
    .line 41
    invoke-direct {p1, v0}, Lk4/M;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, LQ3/h;->A:Lk4/M;

    .line 45
    .line 46
    const/4 p1, 0x0

    .line 47
    invoke-static {p1}, Ll4/y;->l(Landroid/os/Handler$Callback;)Landroid/os/Handler;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iput-object p1, p0, LQ3/h;->D:Landroid/os/Handler;

    .line 52
    .line 53
    invoke-virtual {p0}, LQ3/h;->y()V

    .line 54
    .line 55
    .line 56
    return-void
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

.method public final p(LN3/x;)V
    .locals 5

    .line 1
    check-cast p1, LQ3/b;

    .line 2
    .line 3
    iget-object v0, p1, LQ3/b;->m:LQ3/p;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    iput-boolean v1, v0, LQ3/p;->i:Z

    .line 7
    .line 8
    iget-object v0, v0, LQ3/p;->d:Landroid/os/Handler;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p1, LQ3/b;->r:[LP3/g;

    .line 15
    .line 16
    array-length v2, v0

    .line 17
    const/4 v3, 0x0

    .line 18
    :goto_0
    if-ge v3, v2, :cond_0

    .line 19
    .line 20
    aget-object v4, v0, v3

    .line 21
    .line 22
    invoke-virtual {v4, p1}, LP3/g;->A(LQ3/b;)V

    .line 23
    .line 24
    .line 25
    add-int/lit8 v3, v3, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iput-object v1, p1, LQ3/b;->q:LN3/w;

    .line 29
    .line 30
    iget-object v0, p0, LQ3/h;->u:Landroid/util/SparseArray;

    .line 31
    .line 32
    iget p1, p1, LQ3/b;->a:I

    .line 33
    .line 34
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->remove(I)V

    .line 35
    .line 36
    .line 37
    return-void
    .line 38
.end method

.method public final r()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, LQ3/h;->g0:Z

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    iput-object v1, p0, LQ3/h;->z:Lk4/m;

    .line 6
    .line 7
    iget-object v2, p0, LQ3/h;->A:Lk4/M;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    invoke-virtual {v2, v1}, Lk4/M;->e(Lk4/K;)V

    .line 12
    .line 13
    .line 14
    iput-object v1, p0, LQ3/h;->A:Lk4/M;

    .line 15
    .line 16
    :cond_0
    const-wide/16 v2, 0x0

    .line 17
    .line 18
    iput-wide v2, p0, LQ3/h;->h0:J

    .line 19
    .line 20
    iput-wide v2, p0, LQ3/h;->i0:J

    .line 21
    .line 22
    iget-boolean v2, p0, LQ3/h;->i:Z

    .line 23
    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    iget-object v2, p0, LQ3/h;->f0:LR3/c;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move-object v2, v1

    .line 30
    :goto_0
    iput-object v2, p0, LQ3/h;->f0:LR3/c;

    .line 31
    .line 32
    iget-object v2, p0, LQ3/h;->Z:Landroid/net/Uri;

    .line 33
    .line 34
    iput-object v2, p0, LQ3/h;->Y:Landroid/net/Uri;

    .line 35
    .line 36
    iput-object v1, p0, LQ3/h;->C:LN3/M;

    .line 37
    .line 38
    iget-object v2, p0, LQ3/h;->D:Landroid/os/Handler;

    .line 39
    .line 40
    if-eqz v2, :cond_2

    .line 41
    .line 42
    invoke-virtual {v2, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iput-object v1, p0, LQ3/h;->D:Landroid/os/Handler;

    .line 46
    .line 47
    :cond_2
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    iput-wide v1, p0, LQ3/h;->j0:J

    .line 53
    .line 54
    iput v0, p0, LQ3/h;->k0:I

    .line 55
    .line 56
    iput-wide v1, p0, LQ3/h;->l0:J

    .line 57
    .line 58
    iput v0, p0, LQ3/h;->m0:I

    .line 59
    .line 60
    iget-object v0, p0, LQ3/h;->u:Landroid/util/SparseArray;

    .line 61
    .line 62
    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    .line 63
    .line 64
    .line 65
    iget-object v0, p0, LQ3/h;->o:Lcom/google/firebase/messaging/s;

    .line 66
    .line 67
    iget-object v1, v0, Lcom/google/firebase/messaging/s;->b:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v1, Ljava/util/HashMap;

    .line 70
    .line 71
    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 72
    .line 73
    .line 74
    iget-object v1, v0, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v1, Ljava/util/HashMap;

    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 79
    .line 80
    .line 81
    iget-object v0, v0, Lcom/google/firebase/messaging/s;->d:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v0, Ljava/util/HashMap;

    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 86
    .line 87
    .line 88
    iget-object v0, p0, LQ3/h;->m:Ln3/o;

    .line 89
    .line 90
    invoke-interface {v0}, Ln3/o;->a()V

    .line 91
    .line 92
    .line 93
    return-void
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

.method public final w()V
    .locals 5

    .line 1
    iget-object v0, p0, LQ3/h;->A:Lk4/M;

    .line 2
    .line 3
    new-instance v1, LQ3/d;

    .line 4
    .line 5
    invoke-direct {v1, p0}, LQ3/d;-><init>(LQ3/h;)V

    .line 6
    .line 7
    .line 8
    sget-object v2, Ll4/a;->i:Ljava/lang/Object;

    .line 9
    .line 10
    monitor-enter v2

    .line 11
    :try_start_0
    sget-boolean v3, Ll4/a;->j:Z

    .line 12
    .line 13
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    invoke-virtual {v1}, LQ3/d;->a()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    if-nez v0, :cond_1

    .line 21
    .line 22
    new-instance v0, Lk4/M;

    .line 23
    .line 24
    const-string v2, "SntpClient"

    .line 25
    .line 26
    invoke-direct {v0, v2}, Lk4/M;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    new-instance v2, Ld0/o;

    .line 30
    .line 31
    const/16 v3, 0x8

    .line 32
    .line 33
    invoke-direct {v2, v3}, Ld0/o;-><init>(I)V

    .line 34
    .line 35
    .line 36
    new-instance v3, Lf5/o;

    .line 37
    .line 38
    const/16 v4, 0x8

    .line 39
    .line 40
    invoke-direct {v3, v4, v1}, Lf5/o;-><init>(ILjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    const/4 v1, 0x1

    .line 44
    invoke-virtual {v0, v2, v3, v1}, Lk4/M;->f(Lk4/J;Lk4/H;I)J

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :catchall_0
    move-exception v0

    .line 49
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 50
    throw v0
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

.method public final x(Z)V
    .locals 45

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    move v3, v2

    .line 5
    :goto_0
    iget-object v0, v1, LQ3/h;->u:Landroid/util/SparseArray;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 8
    .line 9
    .line 10
    move-result v4

    .line 11
    if-ge v3, v4, :cond_9

    .line 12
    .line 13
    invoke-virtual {v0, v3}, Landroid/util/SparseArray;->keyAt(I)I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    iget v6, v1, LQ3/h;->m0:I

    .line 18
    .line 19
    if-lt v4, v6, :cond_8

    .line 20
    .line 21
    invoke-virtual {v0, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    move-object v6, v0

    .line 26
    check-cast v6, LQ3/b;

    .line 27
    .line 28
    iget-object v7, v1, LQ3/h;->f0:LR3/c;

    .line 29
    .line 30
    iget v0, v1, LQ3/h;->m0:I

    .line 31
    .line 32
    sub-int/2addr v4, v0

    .line 33
    iput-object v7, v6, LQ3/b;->u:LR3/c;

    .line 34
    .line 35
    iput v4, v6, LQ3/b;->v:I

    .line 36
    .line 37
    iget-object v0, v6, LQ3/b;->m:LQ3/p;

    .line 38
    .line 39
    iput-boolean v2, v0, LQ3/p;->h:Z

    .line 40
    .line 41
    iput-object v7, v0, LQ3/p;->f:LR3/c;

    .line 42
    .line 43
    iget-object v8, v0, LQ3/p;->e:Ljava/util/TreeMap;

    .line 44
    .line 45
    invoke-virtual {v8}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 46
    .line 47
    .line 48
    move-result-object v8

    .line 49
    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v8

    .line 53
    :cond_0
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v9

    .line 57
    if-eqz v9, :cond_1

    .line 58
    .line 59
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v9

    .line 63
    check-cast v9, Ljava/util/Map$Entry;

    .line 64
    .line 65
    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v9

    .line 69
    check-cast v9, Ljava/lang/Long;

    .line 70
    .line 71
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 72
    .line 73
    .line 74
    move-result-wide v9

    .line 75
    iget-object v11, v0, LQ3/p;->f:LR3/c;

    .line 76
    .line 77
    iget-wide v11, v11, LR3/c;->h:J

    .line 78
    .line 79
    cmp-long v9, v9, v11

    .line 80
    .line 81
    if-gez v9, :cond_0

    .line 82
    .line 83
    invoke-interface {v8}, Ljava/util/Iterator;->remove()V

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_1
    iget-object v8, v6, LQ3/b;->r:[LP3/g;

    .line 88
    .line 89
    if-eqz v8, :cond_4

    .line 90
    .line 91
    array-length v9, v8

    .line 92
    move v10, v2

    .line 93
    :goto_2
    if-ge v10, v9, :cond_3

    .line 94
    .line 95
    aget-object v0, v8, v10

    .line 96
    .line 97
    iget-object v0, v0, LP3/g;->e:LP3/h;

    .line 98
    .line 99
    move-object v11, v0

    .line 100
    check-cast v11, LQ3/l;

    .line 101
    .line 102
    iget-object v0, v11, LQ3/l;->h:[LQ3/j;

    .line 103
    .line 104
    :try_start_0
    iput-object v7, v11, LQ3/l;->j:LR3/c;

    .line 105
    .line 106
    iput v4, v11, LQ3/l;->k:I

    .line 107
    .line 108
    invoke-virtual {v7, v4}, LR3/c;->d(I)J

    .line 109
    .line 110
    .line 111
    move-result-wide v12

    .line 112
    invoke-virtual {v11}, LQ3/l;->i()Ljava/util/ArrayList;

    .line 113
    .line 114
    .line 115
    move-result-object v14
    :try_end_0
    .catch LN3/b; {:try_start_0 .. :try_end_0} :catch_1

    .line 116
    move v15, v2

    .line 117
    const/16 v16, 0x1

    .line 118
    .line 119
    :goto_3
    :try_start_1
    array-length v5, v0

    .line 120
    if-ge v15, v5, :cond_2

    .line 121
    .line 122
    iget-object v5, v11, LQ3/l;->i:Li4/q;

    .line 123
    .line 124
    invoke-interface {v5, v15}, Li4/q;->e(I)I

    .line 125
    .line 126
    .line 127
    move-result v5

    .line 128
    invoke-virtual {v14, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    check-cast v5, LR3/m;

    .line 133
    .line 134
    aget-object v2, v0, v15

    .line 135
    .line 136
    invoke-virtual {v2, v12, v13, v5}, LQ3/j;->a(JLR3/m;)LQ3/j;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    aput-object v2, v0, v15
    :try_end_1
    .catch LN3/b; {:try_start_1 .. :try_end_1} :catch_0

    .line 141
    .line 142
    add-int/lit8 v15, v15, 0x1

    .line 143
    .line 144
    const/4 v2, 0x0

    .line 145
    goto :goto_3

    .line 146
    :catch_0
    move-exception v0

    .line 147
    goto :goto_4

    .line 148
    :catch_1
    move-exception v0

    .line 149
    const/16 v16, 0x1

    .line 150
    .line 151
    :goto_4
    iput-object v0, v11, LQ3/l;->l:LN3/b;

    .line 152
    .line 153
    :cond_2
    add-int/lit8 v10, v10, 0x1

    .line 154
    .line 155
    const/4 v2, 0x0

    .line 156
    goto :goto_2

    .line 157
    :cond_3
    const/16 v16, 0x1

    .line 158
    .line 159
    iget-object v0, v6, LQ3/b;->q:LN3/w;

    .line 160
    .line 161
    invoke-interface {v0, v6}, LN3/e0;->v(LN3/f0;)V

    .line 162
    .line 163
    .line 164
    goto :goto_5

    .line 165
    :cond_4
    const/16 v16, 0x1

    .line 166
    .line 167
    :goto_5
    invoke-virtual {v7, v4}, LR3/c;->b(I)LR3/h;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    iget-object v0, v0, LR3/h;->d:Ljava/util/List;

    .line 172
    .line 173
    iput-object v0, v6, LQ3/b;->w:Ljava/util/List;

    .line 174
    .line 175
    iget-object v0, v6, LQ3/b;->s:[LQ3/m;

    .line 176
    .line 177
    array-length v2, v0

    .line 178
    const/4 v5, 0x0

    .line 179
    :goto_6
    if-ge v5, v2, :cond_8

    .line 180
    .line 181
    aget-object v8, v0, v5

    .line 182
    .line 183
    iget-object v9, v6, LQ3/b;->w:Ljava/util/List;

    .line 184
    .line 185
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 186
    .line 187
    .line 188
    move-result-object v9

    .line 189
    :cond_5
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 190
    .line 191
    .line 192
    move-result v10

    .line 193
    if-eqz v10, :cond_7

    .line 194
    .line 195
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v10

    .line 199
    check-cast v10, LR3/g;

    .line 200
    .line 201
    invoke-virtual {v10}, LR3/g;->a()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v11

    .line 205
    iget-object v12, v8, LQ3/m;->e:LR3/g;

    .line 206
    .line 207
    invoke-virtual {v12}, LR3/g;->a()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v12

    .line 211
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v11

    .line 215
    if-eqz v11, :cond_5

    .line 216
    .line 217
    iget-object v9, v7, LR3/c;->m:Ljava/util/List;

    .line 218
    .line 219
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 220
    .line 221
    .line 222
    move-result v9

    .line 223
    add-int/lit8 v9, v9, -0x1

    .line 224
    .line 225
    iget-boolean v11, v7, LR3/c;->d:Z

    .line 226
    .line 227
    if-eqz v11, :cond_6

    .line 228
    .line 229
    if-ne v4, v9, :cond_6

    .line 230
    .line 231
    move/from16 v9, v16

    .line 232
    .line 233
    goto :goto_7

    .line 234
    :cond_6
    const/4 v9, 0x0

    .line 235
    :goto_7
    invoke-virtual {v8, v10, v9}, LQ3/m;->a(LR3/g;Z)V

    .line 236
    .line 237
    .line 238
    :cond_7
    add-int/lit8 v5, v5, 0x1

    .line 239
    .line 240
    goto :goto_6

    .line 241
    :cond_8
    add-int/lit8 v3, v3, 0x1

    .line 242
    .line 243
    const/4 v2, 0x0

    .line 244
    goto/16 :goto_0

    .line 245
    .line 246
    :cond_9
    const/16 v16, 0x1

    .line 247
    .line 248
    iget-object v0, v1, LQ3/h;->f0:LR3/c;

    .line 249
    .line 250
    const/4 v2, 0x0

    .line 251
    invoke-virtual {v0, v2}, LR3/c;->b(I)LR3/h;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    iget-object v2, v1, LQ3/h;->f0:LR3/c;

    .line 256
    .line 257
    iget-object v2, v2, LR3/c;->m:Ljava/util/List;

    .line 258
    .line 259
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 260
    .line 261
    .line 262
    move-result v2

    .line 263
    add-int/lit8 v2, v2, -0x1

    .line 264
    .line 265
    iget-object v3, v1, LQ3/h;->f0:LR3/c;

    .line 266
    .line 267
    invoke-virtual {v3, v2}, LR3/c;->b(I)LR3/h;

    .line 268
    .line 269
    .line 270
    move-result-object v3

    .line 271
    iget-object v4, v1, LQ3/h;->f0:LR3/c;

    .line 272
    .line 273
    invoke-virtual {v4, v2}, LR3/c;->d(I)J

    .line 274
    .line 275
    .line 276
    move-result-wide v4

    .line 277
    iget-wide v6, v1, LQ3/h;->j0:J

    .line 278
    .line 279
    invoke-static {v6, v7}, Ll4/y;->v(J)J

    .line 280
    .line 281
    .line 282
    move-result-wide v6

    .line 283
    invoke-static {v6, v7}, Ll4/y;->H(J)J

    .line 284
    .line 285
    .line 286
    move-result-wide v6

    .line 287
    iget-object v2, v1, LQ3/h;->f0:LR3/c;

    .line 288
    .line 289
    const/4 v8, 0x0

    .line 290
    invoke-virtual {v2, v8}, LR3/c;->d(I)J

    .line 291
    .line 292
    .line 293
    move-result-wide v9

    .line 294
    iget-wide v11, v0, LR3/h;->b:J

    .line 295
    .line 296
    invoke-static {v11, v12}, Ll4/y;->H(J)J

    .line 297
    .line 298
    .line 299
    move-result-wide v11

    .line 300
    invoke-static {v0}, LQ3/h;->v(LR3/h;)Z

    .line 301
    .line 302
    .line 303
    move-result v2

    .line 304
    move-wide v13, v11

    .line 305
    const/4 v8, 0x0

    .line 306
    :goto_8
    iget-object v15, v0, LR3/h;->c:Ljava/util/List;

    .line 307
    .line 308
    move/from16 v18, v2

    .line 309
    .line 310
    invoke-interface {v15}, Ljava/util/List;->size()I

    .line 311
    .line 312
    .line 313
    move-result v2

    .line 314
    move-wide/from16 v19, v11

    .line 315
    .line 316
    if-ge v8, v2, :cond_f

    .line 317
    .line 318
    invoke-interface {v15, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v2

    .line 322
    check-cast v2, LR3/a;

    .line 323
    .line 324
    iget-object v15, v2, LR3/a;->c:Ljava/util/List;

    .line 325
    .line 326
    if-eqz v18, :cond_a

    .line 327
    .line 328
    iget v2, v2, LR3/a;->b:I

    .line 329
    .line 330
    const/4 v11, 0x3

    .line 331
    const-wide/16 v22, 0x0

    .line 332
    .line 333
    if-eq v2, v11, :cond_e

    .line 334
    .line 335
    goto :goto_9

    .line 336
    :cond_a
    const-wide/16 v22, 0x0

    .line 337
    .line 338
    :goto_9
    invoke-interface {v15}, Ljava/util/List;->isEmpty()Z

    .line 339
    .line 340
    .line 341
    move-result v2

    .line 342
    if-eqz v2, :cond_b

    .line 343
    .line 344
    goto :goto_b

    .line 345
    :cond_b
    const/4 v2, 0x0

    .line 346
    invoke-interface {v15, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v11

    .line 350
    check-cast v11, LR3/m;

    .line 351
    .line 352
    invoke-virtual {v11}, LR3/m;->b()LQ3/i;

    .line 353
    .line 354
    .line 355
    move-result-object v2

    .line 356
    if-nez v2, :cond_c

    .line 357
    .line 358
    goto :goto_a

    .line 359
    :cond_c
    invoke-interface {v2, v9, v10, v6, v7}, LQ3/i;->A(JJ)J

    .line 360
    .line 361
    .line 362
    move-result-wide v11

    .line 363
    cmp-long v11, v11, v22

    .line 364
    .line 365
    if-nez v11, :cond_d

    .line 366
    .line 367
    :goto_a
    move-wide/from16 v11, v19

    .line 368
    .line 369
    goto :goto_c

    .line 370
    :cond_d
    invoke-interface {v2, v9, v10, v6, v7}, LQ3/i;->k(JJ)J

    .line 371
    .line 372
    .line 373
    move-result-wide v11

    .line 374
    invoke-interface {v2, v11, v12}, LQ3/i;->c(J)J

    .line 375
    .line 376
    .line 377
    move-result-wide v11

    .line 378
    add-long v11, v11, v19

    .line 379
    .line 380
    invoke-static {v13, v14, v11, v12}, Ljava/lang/Math;->max(JJ)J

    .line 381
    .line 382
    .line 383
    move-result-wide v13

    .line 384
    :cond_e
    :goto_b
    add-int/lit8 v8, v8, 0x1

    .line 385
    .line 386
    move/from16 v2, v18

    .line 387
    .line 388
    move-wide/from16 v11, v19

    .line 389
    .line 390
    goto :goto_8

    .line 391
    :cond_f
    const-wide/16 v22, 0x0

    .line 392
    .line 393
    move-wide v11, v13

    .line 394
    :goto_c
    iget-wide v8, v3, LR3/h;->b:J

    .line 395
    .line 396
    invoke-static {v8, v9}, Ll4/y;->H(J)J

    .line 397
    .line 398
    .line 399
    move-result-wide v8

    .line 400
    invoke-static {v3}, LQ3/h;->v(LR3/h;)Z

    .line 401
    .line 402
    .line 403
    move-result v2

    .line 404
    const-wide v13, 0x7fffffffffffffffL

    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    const/4 v10, 0x0

    .line 410
    :goto_d
    iget-object v15, v3, LR3/h;->c:Ljava/util/List;

    .line 411
    .line 412
    move/from16 v18, v2

    .line 413
    .line 414
    invoke-interface {v15}, Ljava/util/List;->size()I

    .line 415
    .line 416
    .line 417
    move-result v2

    .line 418
    if-ge v10, v2, :cond_15

    .line 419
    .line 420
    invoke-interface {v15, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v2

    .line 424
    check-cast v2, LR3/a;

    .line 425
    .line 426
    move-object/from16 v19, v3

    .line 427
    .line 428
    iget-object v3, v2, LR3/a;->c:Ljava/util/List;

    .line 429
    .line 430
    if-eqz v18, :cond_10

    .line 431
    .line 432
    iget v2, v2, LR3/a;->b:I

    .line 433
    .line 434
    move-wide/from16 v24, v8

    .line 435
    .line 436
    const/4 v8, 0x3

    .line 437
    if-eq v2, v8, :cond_14

    .line 438
    .line 439
    goto :goto_e

    .line 440
    :cond_10
    move-wide/from16 v24, v8

    .line 441
    .line 442
    const/4 v8, 0x3

    .line 443
    :goto_e
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 444
    .line 445
    .line 446
    move-result v2

    .line 447
    if-eqz v2, :cond_11

    .line 448
    .line 449
    goto :goto_f

    .line 450
    :cond_11
    const/4 v2, 0x0

    .line 451
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object v3

    .line 455
    check-cast v3, LR3/m;

    .line 456
    .line 457
    invoke-virtual {v3}, LR3/m;->b()LQ3/i;

    .line 458
    .line 459
    .line 460
    move-result-object v2

    .line 461
    if-nez v2, :cond_12

    .line 462
    .line 463
    add-long v8, v24, v4

    .line 464
    .line 465
    goto :goto_10

    .line 466
    :cond_12
    invoke-interface {v2, v4, v5, v6, v7}, LQ3/i;->A(JJ)J

    .line 467
    .line 468
    .line 469
    move-result-wide v20

    .line 470
    cmp-long v3, v20, v22

    .line 471
    .line 472
    if-nez v3, :cond_13

    .line 473
    .line 474
    move-wide/from16 v8, v24

    .line 475
    .line 476
    goto :goto_10

    .line 477
    :cond_13
    invoke-interface {v2, v4, v5, v6, v7}, LQ3/i;->k(JJ)J

    .line 478
    .line 479
    .line 480
    move-result-wide v26

    .line 481
    add-long v26, v26, v20

    .line 482
    .line 483
    const-wide/16 v20, 0x1

    .line 484
    .line 485
    sub-long v8, v26, v20

    .line 486
    .line 487
    invoke-interface {v2, v8, v9}, LQ3/i;->c(J)J

    .line 488
    .line 489
    .line 490
    move-result-wide v20

    .line 491
    add-long v20, v20, v24

    .line 492
    .line 493
    invoke-interface {v2, v8, v9, v4, v5}, LQ3/i;->h(JJ)J

    .line 494
    .line 495
    .line 496
    move-result-wide v8

    .line 497
    add-long v8, v8, v20

    .line 498
    .line 499
    invoke-static {v13, v14, v8, v9}, Ljava/lang/Math;->min(JJ)J

    .line 500
    .line 501
    .line 502
    move-result-wide v8

    .line 503
    move-wide v13, v8

    .line 504
    :cond_14
    :goto_f
    add-int/lit8 v10, v10, 0x1

    .line 505
    .line 506
    move/from16 v2, v18

    .line 507
    .line 508
    move-object/from16 v3, v19

    .line 509
    .line 510
    move-wide/from16 v8, v24

    .line 511
    .line 512
    goto :goto_d

    .line 513
    :cond_15
    move-wide v8, v13

    .line 514
    :goto_10
    iget-object v2, v1, LQ3/h;->f0:LR3/c;

    .line 515
    .line 516
    iget-boolean v2, v2, LR3/c;->d:Z

    .line 517
    .line 518
    if-eqz v2, :cond_18

    .line 519
    .line 520
    const/4 v2, 0x0

    .line 521
    :goto_11
    invoke-interface {v15}, Ljava/util/List;->size()I

    .line 522
    .line 523
    .line 524
    move-result v3

    .line 525
    if-ge v2, v3, :cond_17

    .line 526
    .line 527
    invoke-interface {v15, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 528
    .line 529
    .line 530
    move-result-object v3

    .line 531
    check-cast v3, LR3/a;

    .line 532
    .line 533
    iget-object v3, v3, LR3/a;->c:Ljava/util/List;

    .line 534
    .line 535
    const/4 v4, 0x0

    .line 536
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 537
    .line 538
    .line 539
    move-result-object v3

    .line 540
    check-cast v3, LR3/m;

    .line 541
    .line 542
    invoke-virtual {v3}, LR3/m;->b()LQ3/i;

    .line 543
    .line 544
    .line 545
    move-result-object v3

    .line 546
    if-eqz v3, :cond_18

    .line 547
    .line 548
    invoke-interface {v3}, LQ3/i;->q()Z

    .line 549
    .line 550
    .line 551
    move-result v3

    .line 552
    if-eqz v3, :cond_16

    .line 553
    .line 554
    goto :goto_12

    .line 555
    :cond_16
    add-int/lit8 v2, v2, 0x1

    .line 556
    .line 557
    goto :goto_11

    .line 558
    :cond_17
    move/from16 v2, v16

    .line 559
    .line 560
    goto :goto_13

    .line 561
    :cond_18
    :goto_12
    const/4 v2, 0x0

    .line 562
    :goto_13
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    if-eqz v2, :cond_19

    .line 568
    .line 569
    iget-object v5, v1, LQ3/h;->f0:LR3/c;

    .line 570
    .line 571
    iget-wide v13, v5, LR3/c;->f:J

    .line 572
    .line 573
    cmp-long v5, v13, v3

    .line 574
    .line 575
    if-eqz v5, :cond_19

    .line 576
    .line 577
    invoke-static {v13, v14}, Ll4/y;->H(J)J

    .line 578
    .line 579
    .line 580
    move-result-wide v13

    .line 581
    sub-long v13, v8, v13

    .line 582
    .line 583
    invoke-static {v11, v12, v13, v14}, Ljava/lang/Math;->max(JJ)J

    .line 584
    .line 585
    .line 586
    move-result-wide v11

    .line 587
    :cond_19
    sub-long v34, v8, v11

    .line 588
    .line 589
    iget-object v5, v1, LQ3/h;->f0:LR3/c;

    .line 590
    .line 591
    iget-boolean v8, v5, LR3/c;->d:Z

    .line 592
    .line 593
    if-eqz v8, :cond_2f

    .line 594
    .line 595
    iget-wide v8, v5, LR3/c;->a:J

    .line 596
    .line 597
    cmp-long v5, v8, v3

    .line 598
    .line 599
    if-eqz v5, :cond_1a

    .line 600
    .line 601
    move/from16 v5, v16

    .line 602
    .line 603
    goto :goto_14

    .line 604
    :cond_1a
    const/4 v5, 0x0

    .line 605
    :goto_14
    invoke-static {v5}, Ll4/a;->m(Z)V

    .line 606
    .line 607
    .line 608
    iget-object v5, v1, LQ3/h;->f0:LR3/c;

    .line 609
    .line 610
    iget-wide v8, v5, LR3/c;->a:J

    .line 611
    .line 612
    invoke-static {v8, v9}, Ll4/y;->H(J)J

    .line 613
    .line 614
    .line 615
    move-result-wide v8

    .line 616
    sub-long/2addr v6, v8

    .line 617
    sub-long/2addr v6, v11

    .line 618
    invoke-static {v6, v7}, Ll4/y;->T(J)J

    .line 619
    .line 620
    .line 621
    move-result-wide v8

    .line 622
    iget-object v5, v1, LQ3/h;->h:Lj3/Y;

    .line 623
    .line 624
    iget-object v10, v5, Lj3/Y;->c:Lj3/T;

    .line 625
    .line 626
    iget-wide v13, v10, Lj3/T;->c:J

    .line 627
    .line 628
    cmp-long v10, v13, v3

    .line 629
    .line 630
    if-eqz v10, :cond_1b

    .line 631
    .line 632
    invoke-static {v8, v9, v13, v14}, Ljava/lang/Math;->min(JJ)J

    .line 633
    .line 634
    .line 635
    move-result-wide v13

    .line 636
    goto :goto_15

    .line 637
    :cond_1b
    iget-object v10, v1, LQ3/h;->f0:LR3/c;

    .line 638
    .line 639
    iget-object v10, v10, LR3/c;->j:LR3/t;

    .line 640
    .line 641
    if-eqz v10, :cond_1c

    .line 642
    .line 643
    iget-wide v13, v10, LR3/t;->c:J

    .line 644
    .line 645
    cmp-long v10, v13, v3

    .line 646
    .line 647
    if-eqz v10, :cond_1c

    .line 648
    .line 649
    invoke-static {v8, v9, v13, v14}, Ljava/lang/Math;->min(JJ)J

    .line 650
    .line 651
    .line 652
    move-result-wide v13

    .line 653
    goto :goto_15

    .line 654
    :cond_1c
    move-wide v13, v8

    .line 655
    :goto_15
    sub-long v18, v6, v34

    .line 656
    .line 657
    invoke-static/range {v18 .. v19}, Ll4/y;->T(J)J

    .line 658
    .line 659
    .line 660
    move-result-wide v18

    .line 661
    cmp-long v10, v18, v22

    .line 662
    .line 663
    if-gez v10, :cond_1d

    .line 664
    .line 665
    cmp-long v10, v13, v22

    .line 666
    .line 667
    if-lez v10, :cond_1d

    .line 668
    .line 669
    move-wide/from16 v18, v22

    .line 670
    .line 671
    :cond_1d
    iget-object v10, v1, LQ3/h;->f0:LR3/c;

    .line 672
    .line 673
    move-wide/from16 v20, v3

    .line 674
    .line 675
    iget-wide v3, v10, LR3/c;->c:J

    .line 676
    .line 677
    cmp-long v10, v3, v20

    .line 678
    .line 679
    if-eqz v10, :cond_1e

    .line 680
    .line 681
    add-long v3, v18, v3

    .line 682
    .line 683
    invoke-static {v3, v4, v8, v9}, Ljava/lang/Math;->min(JJ)J

    .line 684
    .line 685
    .line 686
    move-result-wide v18

    .line 687
    :cond_1e
    move-wide/from16 v26, v18

    .line 688
    .line 689
    iget-object v3, v5, Lj3/Y;->c:Lj3/T;

    .line 690
    .line 691
    iget-wide v4, v3, Lj3/T;->b:J

    .line 692
    .line 693
    cmp-long v10, v4, v20

    .line 694
    .line 695
    if-eqz v10, :cond_20

    .line 696
    .line 697
    move-wide/from16 v24, v4

    .line 698
    .line 699
    move-wide/from16 v28, v8

    .line 700
    .line 701
    invoke-static/range {v24 .. v29}, Ll4/y;->j(JJJ)J

    .line 702
    .line 703
    .line 704
    move-result-wide v26

    .line 705
    :cond_1f
    :goto_16
    move-wide/from16 v30, v26

    .line 706
    .line 707
    goto :goto_17

    .line 708
    :cond_20
    move-wide/from16 v28, v8

    .line 709
    .line 710
    iget-object v4, v1, LQ3/h;->f0:LR3/c;

    .line 711
    .line 712
    iget-object v4, v4, LR3/c;->j:LR3/t;

    .line 713
    .line 714
    if-eqz v4, :cond_1f

    .line 715
    .line 716
    iget-wide v4, v4, LR3/t;->b:J

    .line 717
    .line 718
    cmp-long v8, v4, v20

    .line 719
    .line 720
    if-eqz v8, :cond_1f

    .line 721
    .line 722
    move-wide/from16 v24, v4

    .line 723
    .line 724
    invoke-static/range {v24 .. v29}, Ll4/y;->j(JJJ)J

    .line 725
    .line 726
    .line 727
    move-result-wide v26

    .line 728
    goto :goto_16

    .line 729
    :goto_17
    cmp-long v4, v30, v13

    .line 730
    .line 731
    if-lez v4, :cond_21

    .line 732
    .line 733
    move-wide/from16 v32, v30

    .line 734
    .line 735
    goto :goto_18

    .line 736
    :cond_21
    move-wide/from16 v32, v13

    .line 737
    .line 738
    :goto_18
    iget-object v4, v1, LQ3/h;->X:Lj3/T;

    .line 739
    .line 740
    iget-wide v4, v4, Lj3/T;->a:J

    .line 741
    .line 742
    cmp-long v8, v4, v20

    .line 743
    .line 744
    if-eqz v8, :cond_22

    .line 745
    .line 746
    goto :goto_19

    .line 747
    :cond_22
    iget-object v4, v1, LQ3/h;->f0:LR3/c;

    .line 748
    .line 749
    iget-object v5, v4, LR3/c;->j:LR3/t;

    .line 750
    .line 751
    if-eqz v5, :cond_23

    .line 752
    .line 753
    iget-wide v8, v5, LR3/t;->a:J

    .line 754
    .line 755
    cmp-long v5, v8, v20

    .line 756
    .line 757
    if-eqz v5, :cond_23

    .line 758
    .line 759
    move-wide v4, v8

    .line 760
    goto :goto_19

    .line 761
    :cond_23
    iget-wide v4, v4, LR3/c;->g:J

    .line 762
    .line 763
    cmp-long v8, v4, v20

    .line 764
    .line 765
    if-eqz v8, :cond_24

    .line 766
    .line 767
    goto :goto_19

    .line 768
    :cond_24
    iget-wide v4, v1, LQ3/h;->p:J

    .line 769
    .line 770
    :goto_19
    cmp-long v8, v4, v30

    .line 771
    .line 772
    if-gez v8, :cond_25

    .line 773
    .line 774
    move-wide/from16 v4, v30

    .line 775
    .line 776
    :cond_25
    cmp-long v8, v4, v32

    .line 777
    .line 778
    const-wide/32 v9, 0x4c4b40

    .line 779
    .line 780
    .line 781
    const-wide/16 v13, 0x2

    .line 782
    .line 783
    if-lez v8, :cond_26

    .line 784
    .line 785
    div-long v4, v34, v13

    .line 786
    .line 787
    invoke-static {v9, v10, v4, v5}, Ljava/lang/Math;->min(JJ)J

    .line 788
    .line 789
    .line 790
    move-result-wide v4

    .line 791
    sub-long v4, v6, v4

    .line 792
    .line 793
    invoke-static {v4, v5}, Ll4/y;->T(J)J

    .line 794
    .line 795
    .line 796
    move-result-wide v28

    .line 797
    invoke-static/range {v28 .. v33}, Ll4/y;->j(JJJ)J

    .line 798
    .line 799
    .line 800
    move-result-wide v4

    .line 801
    :cond_26
    move-wide/from16 v37, v4

    .line 802
    .line 803
    iget v4, v3, Lj3/T;->d:F

    .line 804
    .line 805
    const v5, -0x800001

    .line 806
    .line 807
    .line 808
    cmpl-float v8, v4, v5

    .line 809
    .line 810
    if-eqz v8, :cond_27

    .line 811
    .line 812
    goto :goto_1a

    .line 813
    :cond_27
    iget-object v4, v1, LQ3/h;->f0:LR3/c;

    .line 814
    .line 815
    iget-object v4, v4, LR3/c;->j:LR3/t;

    .line 816
    .line 817
    if-eqz v4, :cond_28

    .line 818
    .line 819
    iget v4, v4, LR3/t;->d:F

    .line 820
    .line 821
    goto :goto_1a

    .line 822
    :cond_28
    move v4, v5

    .line 823
    :goto_1a
    iget v3, v3, Lj3/T;->e:F

    .line 824
    .line 825
    cmpl-float v8, v3, v5

    .line 826
    .line 827
    if-eqz v8, :cond_29

    .line 828
    .line 829
    goto :goto_1b

    .line 830
    :cond_29
    iget-object v3, v1, LQ3/h;->f0:LR3/c;

    .line 831
    .line 832
    iget-object v3, v3, LR3/c;->j:LR3/t;

    .line 833
    .line 834
    if-eqz v3, :cond_2a

    .line 835
    .line 836
    iget v3, v3, LR3/t;->e:F

    .line 837
    .line 838
    goto :goto_1b

    .line 839
    :cond_2a
    move v3, v5

    .line 840
    :goto_1b
    cmpl-float v8, v4, v5

    .line 841
    .line 842
    if-nez v8, :cond_2c

    .line 843
    .line 844
    cmpl-float v5, v3, v5

    .line 845
    .line 846
    if-nez v5, :cond_2c

    .line 847
    .line 848
    iget-object v5, v1, LQ3/h;->f0:LR3/c;

    .line 849
    .line 850
    iget-object v5, v5, LR3/c;->j:LR3/t;

    .line 851
    .line 852
    move-wide/from16 v18, v13

    .line 853
    .line 854
    if-eqz v5, :cond_2b

    .line 855
    .line 856
    iget-wide v13, v5, LR3/t;->a:J

    .line 857
    .line 858
    cmp-long v5, v13, v20

    .line 859
    .line 860
    if-nez v5, :cond_2d

    .line 861
    .line 862
    :cond_2b
    const/high16 v4, 0x3f800000    # 1.0f

    .line 863
    .line 864
    move/from16 v43, v4

    .line 865
    .line 866
    move/from16 v44, v43

    .line 867
    .line 868
    goto :goto_1c

    .line 869
    :cond_2c
    move-wide/from16 v18, v13

    .line 870
    .line 871
    :cond_2d
    move/from16 v44, v3

    .line 872
    .line 873
    move/from16 v43, v4

    .line 874
    .line 875
    :goto_1c
    new-instance v36, Lj3/T;

    .line 876
    .line 877
    move-wide/from16 v39, v30

    .line 878
    .line 879
    move-wide/from16 v41, v32

    .line 880
    .line 881
    invoke-direct/range {v36 .. v44}, Lj3/T;-><init>(JJJFF)V

    .line 882
    .line 883
    .line 884
    move-object/from16 v3, v36

    .line 885
    .line 886
    iput-object v3, v1, LQ3/h;->X:Lj3/T;

    .line 887
    .line 888
    iget-object v3, v1, LQ3/h;->f0:LR3/c;

    .line 889
    .line 890
    iget-wide v3, v3, LR3/c;->a:J

    .line 891
    .line 892
    invoke-static {v11, v12}, Ll4/y;->T(J)J

    .line 893
    .line 894
    .line 895
    move-result-wide v13

    .line 896
    add-long/2addr v13, v3

    .line 897
    iget-object v3, v1, LQ3/h;->X:Lj3/T;

    .line 898
    .line 899
    iget-wide v3, v3, Lj3/T;->a:J

    .line 900
    .line 901
    invoke-static {v3, v4}, Ll4/y;->H(J)J

    .line 902
    .line 903
    .line 904
    move-result-wide v3

    .line 905
    sub-long/2addr v6, v3

    .line 906
    div-long v3, v34, v18

    .line 907
    .line 908
    invoke-static {v9, v10, v3, v4}, Ljava/lang/Math;->min(JJ)J

    .line 909
    .line 910
    .line 911
    move-result-wide v3

    .line 912
    cmp-long v5, v6, v3

    .line 913
    .line 914
    if-gez v5, :cond_2e

    .line 915
    .line 916
    move-wide/from16 v36, v3

    .line 917
    .line 918
    :goto_1d
    move-wide/from16 v27, v13

    .line 919
    .line 920
    goto :goto_1e

    .line 921
    :cond_2e
    move-wide/from16 v36, v6

    .line 922
    .line 923
    goto :goto_1d

    .line 924
    :cond_2f
    move-wide/from16 v20, v3

    .line 925
    .line 926
    move-wide/from16 v27, v20

    .line 927
    .line 928
    move-wide/from16 v36, v22

    .line 929
    .line 930
    :goto_1e
    iget-wide v3, v0, LR3/h;->b:J

    .line 931
    .line 932
    invoke-static {v3, v4}, Ll4/y;->H(J)J

    .line 933
    .line 934
    .line 935
    move-result-wide v3

    .line 936
    sub-long v32, v11, v3

    .line 937
    .line 938
    new-instance v24, LQ3/e;

    .line 939
    .line 940
    iget-object v0, v1, LQ3/h;->f0:LR3/c;

    .line 941
    .line 942
    iget-wide v3, v0, LR3/c;->a:J

    .line 943
    .line 944
    iget-wide v5, v1, LQ3/h;->j0:J

    .line 945
    .line 946
    iget v7, v1, LQ3/h;->m0:I

    .line 947
    .line 948
    iget-boolean v8, v0, LR3/c;->d:Z

    .line 949
    .line 950
    if-eqz v8, :cond_30

    .line 951
    .line 952
    iget-object v8, v1, LQ3/h;->X:Lj3/T;

    .line 953
    .line 954
    :goto_1f
    move-object/from16 v40, v8

    .line 955
    .line 956
    goto :goto_20

    .line 957
    :cond_30
    const/4 v8, 0x0

    .line 958
    goto :goto_1f

    .line 959
    :goto_20
    iget-object v8, v1, LQ3/h;->h:Lj3/Y;

    .line 960
    .line 961
    move-object/from16 v38, v0

    .line 962
    .line 963
    move-wide/from16 v25, v3

    .line 964
    .line 965
    move-wide/from16 v29, v5

    .line 966
    .line 967
    move/from16 v31, v7

    .line 968
    .line 969
    move-object/from16 v39, v8

    .line 970
    .line 971
    invoke-direct/range {v24 .. v40}, LQ3/e;-><init>(JJJIJJJLR3/c;Lj3/Y;Lj3/T;)V

    .line 972
    .line 973
    .line 974
    move-object/from16 v0, v24

    .line 975
    .line 976
    invoke-virtual {v1, v0}, LN3/a;->o(Lj3/E0;)V

    .line 977
    .line 978
    .line 979
    iget-boolean v0, v1, LQ3/h;->i:Z

    .line 980
    .line 981
    if-nez v0, :cond_3c

    .line 982
    .line 983
    iget-object v0, v1, LQ3/h;->D:Landroid/os/Handler;

    .line 984
    .line 985
    iget-object v3, v1, LQ3/h;->w:LQ3/c;

    .line 986
    .line 987
    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 988
    .line 989
    .line 990
    const-wide/16 v4, 0x1388

    .line 991
    .line 992
    if-eqz v2, :cond_39

    .line 993
    .line 994
    iget-object v0, v1, LQ3/h;->D:Landroid/os/Handler;

    .line 995
    .line 996
    iget-object v2, v1, LQ3/h;->f0:LR3/c;

    .line 997
    .line 998
    iget-wide v6, v1, LQ3/h;->j0:J

    .line 999
    .line 1000
    invoke-static {v6, v7}, Ll4/y;->v(J)J

    .line 1001
    .line 1002
    .line 1003
    move-result-wide v6

    .line 1004
    iget-object v8, v2, LR3/c;->m:Ljava/util/List;

    .line 1005
    .line 1006
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 1007
    .line 1008
    .line 1009
    move-result v8

    .line 1010
    add-int/lit8 v8, v8, -0x1

    .line 1011
    .line 1012
    invoke-virtual {v2, v8}, LR3/c;->b(I)LR3/h;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v9

    .line 1016
    iget-wide v10, v9, LR3/h;->b:J

    .line 1017
    .line 1018
    invoke-static {v10, v11}, Ll4/y;->H(J)J

    .line 1019
    .line 1020
    .line 1021
    move-result-wide v10

    .line 1022
    invoke-virtual {v2, v8}, LR3/c;->d(I)J

    .line 1023
    .line 1024
    .line 1025
    move-result-wide v12

    .line 1026
    invoke-static {v6, v7}, Ll4/y;->H(J)J

    .line 1027
    .line 1028
    .line 1029
    move-result-wide v6

    .line 1030
    iget-wide v14, v2, LR3/c;->a:J

    .line 1031
    .line 1032
    invoke-static {v14, v15}, Ll4/y;->H(J)J

    .line 1033
    .line 1034
    .line 1035
    move-result-wide v14

    .line 1036
    invoke-static {v4, v5}, Ll4/y;->H(J)J

    .line 1037
    .line 1038
    .line 1039
    move-result-wide v18

    .line 1040
    const/4 v2, 0x0

    .line 1041
    :goto_21
    iget-object v8, v9, LR3/h;->c:Ljava/util/List;

    .line 1042
    .line 1043
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 1044
    .line 1045
    .line 1046
    move-result v4

    .line 1047
    if-ge v2, v4, :cond_34

    .line 1048
    .line 1049
    invoke-interface {v8, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v4

    .line 1053
    check-cast v4, LR3/a;

    .line 1054
    .line 1055
    iget-object v4, v4, LR3/a;->c:Ljava/util/List;

    .line 1056
    .line 1057
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 1058
    .line 1059
    .line 1060
    move-result v5

    .line 1061
    if-eqz v5, :cond_31

    .line 1062
    .line 1063
    const/4 v8, 0x0

    .line 1064
    goto :goto_22

    .line 1065
    :cond_31
    const/4 v8, 0x0

    .line 1066
    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1067
    .line 1068
    .line 1069
    move-result-object v4

    .line 1070
    check-cast v4, LR3/m;

    .line 1071
    .line 1072
    invoke-virtual {v4}, LR3/m;->b()LQ3/i;

    .line 1073
    .line 1074
    .line 1075
    move-result-object v4

    .line 1076
    if-eqz v4, :cond_33

    .line 1077
    .line 1078
    add-long v26, v14, v10

    .line 1079
    .line 1080
    invoke-interface {v4, v12, v13, v6, v7}, LQ3/i;->o(JJ)J

    .line 1081
    .line 1082
    .line 1083
    move-result-wide v4

    .line 1084
    add-long v4, v4, v26

    .line 1085
    .line 1086
    sub-long/2addr v4, v6

    .line 1087
    const-wide/32 v26, 0x186a0

    .line 1088
    .line 1089
    .line 1090
    sub-long v28, v18, v26

    .line 1091
    .line 1092
    cmp-long v17, v4, v28

    .line 1093
    .line 1094
    if-ltz v17, :cond_32

    .line 1095
    .line 1096
    cmp-long v17, v4, v18

    .line 1097
    .line 1098
    if-lez v17, :cond_33

    .line 1099
    .line 1100
    add-long v26, v18, v26

    .line 1101
    .line 1102
    cmp-long v17, v4, v26

    .line 1103
    .line 1104
    if-gez v17, :cond_33

    .line 1105
    .line 1106
    :cond_32
    move-wide/from16 v18, v4

    .line 1107
    .line 1108
    :cond_33
    :goto_22
    add-int/lit8 v2, v2, 0x1

    .line 1109
    .line 1110
    const-wide/16 v4, 0x1388

    .line 1111
    .line 1112
    goto :goto_21

    .line 1113
    :cond_34
    sget-object v2, Ljava/math/RoundingMode;->CEILING:Ljava/math/RoundingMode;

    .line 1114
    .line 1115
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1116
    .line 1117
    .line 1118
    const-wide/16 v4, 0x3e8

    .line 1119
    .line 1120
    div-long v6, v18, v4

    .line 1121
    .line 1122
    mul-long v8, v4, v6

    .line 1123
    .line 1124
    sub-long v8, v18, v8

    .line 1125
    .line 1126
    cmp-long v10, v8, v22

    .line 1127
    .line 1128
    if-nez v10, :cond_35

    .line 1129
    .line 1130
    goto :goto_24

    .line 1131
    :cond_35
    xor-long v11, v18, v4

    .line 1132
    .line 1133
    const/16 v13, 0x3f

    .line 1134
    .line 1135
    shr-long/2addr v11, v13

    .line 1136
    long-to-int v11, v11

    .line 1137
    or-int/lit8 v11, v11, 0x1

    .line 1138
    .line 1139
    sget-object v12, LQ5/b;->a:[I

    .line 1140
    .line 1141
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 1142
    .line 1143
    .line 1144
    move-result v2

    .line 1145
    aget v2, v12, v2

    .line 1146
    .line 1147
    packed-switch v2, :pswitch_data_0

    .line 1148
    .line 1149
    .line 1150
    new-instance v0, Ljava/lang/AssertionError;

    .line 1151
    .line 1152
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 1153
    .line 1154
    .line 1155
    throw v0

    .line 1156
    :pswitch_0
    invoke-static {v8, v9}, Ljava/lang/Math;->abs(J)J

    .line 1157
    .line 1158
    .line 1159
    move-result-wide v8

    .line 1160
    invoke-static {v4, v5}, Ljava/lang/Math;->abs(J)J

    .line 1161
    .line 1162
    .line 1163
    move-result-wide v4

    .line 1164
    sub-long/2addr v4, v8

    .line 1165
    sub-long/2addr v8, v4

    .line 1166
    cmp-long v2, v8, v22

    .line 1167
    .line 1168
    if-nez v2, :cond_36

    .line 1169
    .line 1170
    sget-object v2, Ljava/math/RoundingMode;->HALF_UP:Ljava/math/RoundingMode;

    .line 1171
    .line 1172
    sget-object v2, Ljava/math/RoundingMode;->HALF_EVEN:Ljava/math/RoundingMode;

    .line 1173
    .line 1174
    goto :goto_24

    .line 1175
    :cond_36
    if-lez v2, :cond_37

    .line 1176
    .line 1177
    goto :goto_23

    .line 1178
    :pswitch_1
    if-lez v11, :cond_37

    .line 1179
    .line 1180
    goto :goto_23

    .line 1181
    :pswitch_2
    if-gez v11, :cond_37

    .line 1182
    .line 1183
    :goto_23
    :pswitch_3
    int-to-long v4, v11

    .line 1184
    add-long/2addr v6, v4

    .line 1185
    goto :goto_24

    .line 1186
    :pswitch_4
    if-nez v10, :cond_38

    .line 1187
    .line 1188
    :cond_37
    :goto_24
    :pswitch_5
    invoke-virtual {v0, v3, v6, v7}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1189
    .line 1190
    .line 1191
    goto :goto_25

    .line 1192
    :cond_38
    new-instance v0, Ljava/lang/ArithmeticException;

    .line 1193
    .line 1194
    const-string v2, "mode was UNNECESSARY, but rounding was necessary"

    .line 1195
    .line 1196
    invoke-direct {v0, v2}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    .line 1197
    .line 1198
    .line 1199
    throw v0

    .line 1200
    :cond_39
    :goto_25
    iget-boolean v0, v1, LQ3/h;->g0:Z

    .line 1201
    .line 1202
    if-eqz v0, :cond_3a

    .line 1203
    .line 1204
    invoke-virtual {v1}, LQ3/h;->y()V

    .line 1205
    .line 1206
    .line 1207
    goto :goto_27

    .line 1208
    :cond_3a
    if-eqz p1, :cond_3c

    .line 1209
    .line 1210
    iget-object v0, v1, LQ3/h;->f0:LR3/c;

    .line 1211
    .line 1212
    iget-boolean v2, v0, LR3/c;->d:Z

    .line 1213
    .line 1214
    if-eqz v2, :cond_3c

    .line 1215
    .line 1216
    iget-wide v2, v0, LR3/c;->e:J

    .line 1217
    .line 1218
    cmp-long v0, v2, v20

    .line 1219
    .line 1220
    if-eqz v0, :cond_3c

    .line 1221
    .line 1222
    cmp-long v0, v2, v22

    .line 1223
    .line 1224
    if-nez v0, :cond_3b

    .line 1225
    .line 1226
    const-wide/16 v4, 0x1388

    .line 1227
    .line 1228
    goto :goto_26

    .line 1229
    :cond_3b
    move-wide v4, v2

    .line 1230
    :goto_26
    iget-wide v2, v1, LQ3/h;->h0:J

    .line 1231
    .line 1232
    add-long/2addr v2, v4

    .line 1233
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 1234
    .line 1235
    .line 1236
    move-result-wide v4

    .line 1237
    sub-long/2addr v2, v4

    .line 1238
    move-wide/from16 v4, v22

    .line 1239
    .line 1240
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 1241
    .line 1242
    .line 1243
    move-result-wide v2

    .line 1244
    iget-object v0, v1, LQ3/h;->D:Landroid/os/Handler;

    .line 1245
    .line 1246
    iget-object v4, v1, LQ3/h;->v:LQ3/c;

    .line 1247
    .line 1248
    invoke-virtual {v0, v4, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1249
    .line 1250
    .line 1251
    :cond_3c
    :goto_27
    return-void

    .line 1252
    nop

    .line 1253
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_5
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
.end method

.method public final y()V
    .locals 15

    .line 1
    iget-object v0, p0, LQ3/h;->D:Landroid/os/Handler;

    .line 2
    .line 3
    iget-object v1, p0, LQ3/h;->v:LQ3/c;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LQ3/h;->A:Lk4/M;

    .line 9
    .line 10
    invoke-virtual {v0}, Lk4/M;->c()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iget-object v0, p0, LQ3/h;->A:Lk4/M;

    .line 18
    .line 19
    invoke-virtual {v0}, Lk4/M;->d()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    iput-boolean v0, p0, LQ3/h;->g0:Z

    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    iget-object v1, p0, LQ3/h;->t:Ljava/lang/Object;

    .line 30
    .line 31
    monitor-enter v1

    .line 32
    :try_start_0
    iget-object v0, p0, LQ3/h;->Y:Landroid/net/Uri;

    .line 33
    .line 34
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    const/4 v1, 0x0

    .line 36
    iput-boolean v1, p0, LQ3/h;->g0:Z

    .line 37
    .line 38
    new-instance v1, Lk4/P;

    .line 39
    .line 40
    iget-object v2, p0, LQ3/h;->z:Lk4/m;

    .line 41
    .line 42
    iget-object v3, p0, LQ3/h;->r:Lk4/O;

    .line 43
    .line 44
    const/4 v4, 0x4

    .line 45
    invoke-direct {v1, v2, v0, v4, v3}, Lk4/P;-><init>(Lk4/m;Landroid/net/Uri;ILk4/O;)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, LQ3/h;->s:Lo1/f;

    .line 49
    .line 50
    iget-object v2, p0, LQ3/h;->n:Le1/q;

    .line 51
    .line 52
    invoke-virtual {v2, v4}, Le1/q;->f(I)I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    iget-object v3, p0, LQ3/h;->A:Lk4/M;

    .line 57
    .line 58
    invoke-virtual {v3, v1, v0, v2}, Lk4/M;->f(Lk4/J;Lk4/H;I)J

    .line 59
    .line 60
    .line 61
    new-instance v5, LN3/q;

    .line 62
    .line 63
    iget-object v0, v1, Lk4/P;->b:Lk4/p;

    .line 64
    .line 65
    invoke-direct {v5, v0}, LN3/q;-><init>(Lk4/p;)V

    .line 66
    .line 67
    .line 68
    iget-object v4, p0, LQ3/h;->q:LN3/G;

    .line 69
    .line 70
    iget v6, v1, Lk4/P;->c:I

    .line 71
    .line 72
    const/4 v9, 0x0

    .line 73
    const/4 v10, 0x0

    .line 74
    const/4 v7, -0x1

    .line 75
    const/4 v8, 0x0

    .line 76
    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    invoke-virtual/range {v4 .. v14}, LN3/G;->l(LN3/q;IILj3/M;ILjava/lang/Object;JJ)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :catchall_0
    move-exception v0

    .line 91
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 92
    throw v0
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
