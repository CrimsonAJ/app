.class public final Ll3/D;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll3/q;


# static fields
.field public static final d0:Ljava/lang/Object;

.field public static e0:Ljava/util/concurrent/ExecutorService;

.field public static f0:I


# instance fields
.field public A:I

.field public B:J

.field public C:J

.field public D:J

.field public E:J

.field public F:I

.field public G:Z

.field public H:Z

.field public I:J

.field public J:F

.field public K:[Ll3/j;

.field public L:[Ljava/nio/ByteBuffer;

.field public M:Ljava/nio/ByteBuffer;

.field public N:I

.field public O:Ljava/nio/ByteBuffer;

.field public P:[B

.field public Q:I

.field public R:I

.field public S:Z

.field public T:Z

.field public U:Z

.field public V:Z

.field public W:I

.field public X:Ll3/u;

.field public Y:Ll3/z;

.field public Z:Z

.field public final a:Ll3/g;

.field public a0:J

.field public final b:Lb5/G1;

.field public b0:Z

.field public final c:Z

.field public c0:Z

.field public final d:Ll3/w;

.field public final e:Ll3/N;

.field public final f:[Ll3/j;

.field public final g:[Ll3/j;

.field public final h:LH1/k;

.field public final i:Ll3/t;

.field public final j:Ljava/util/ArrayDeque;

.field public final k:Z

.field public final l:I

.field public m:Lb5/G1;

.field public final n:LF0/h;

.field public final o:LF0/h;

.field public final p:Ll3/E;

.field public q:Lk3/l;

.field public r:Li/G;

.field public s:Ll3/A;

.field public t:Ll3/A;

.field public u:Landroid/media/AudioTrack;

.field public v:Ll3/e;

.field public w:Ll3/B;

.field public x:Ll3/B;

.field public y:Lj3/m0;

.field public z:Ljava/nio/ByteBuffer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ll3/D;->d0:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
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

.method public constructor <init>(Lb5/G1;)V
    .locals 10

    .line 1
    const/4 v0, 0x4

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iget-object v3, p1, Lb5/G1;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, Ll3/g;

    .line 10
    .line 11
    iput-object v3, p0, Ll3/D;->a:Ll3/g;

    .line 12
    .line 13
    iget-object v3, p1, Lb5/G1;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, Lb5/G1;

    .line 16
    .line 17
    iput-object v3, p0, Ll3/D;->b:Lb5/G1;

    .line 18
    .line 19
    sget v4, Ll4/y;->a:I

    .line 20
    .line 21
    iput-boolean v2, p0, Ll3/D;->c:Z

    .line 22
    .line 23
    iput-boolean v2, p0, Ll3/D;->k:Z

    .line 24
    .line 25
    iput v2, p0, Ll3/D;->l:I

    .line 26
    .line 27
    iget-object p1, p1, Lb5/G1;->d:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, Ll3/E;

    .line 30
    .line 31
    iput-object p1, p0, Ll3/D;->p:Ll3/E;

    .line 32
    .line 33
    new-instance p1, LH1/k;

    .line 34
    .line 35
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, Ll3/D;->h:LH1/k;

    .line 39
    .line 40
    invoke-virtual {p1}, LH1/k;->d()Z

    .line 41
    .line 42
    .line 43
    new-instance p1, Ll3/t;

    .line 44
    .line 45
    new-instance v4, Lcom/google/firebase/messaging/u;

    .line 46
    .line 47
    invoke-direct {v4, p0}, Lcom/google/firebase/messaging/u;-><init>(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-direct {p1, v4}, Ll3/t;-><init>(Lcom/google/firebase/messaging/u;)V

    .line 51
    .line 52
    .line 53
    iput-object p1, p0, Ll3/D;->i:Ll3/t;

    .line 54
    .line 55
    new-instance p1, Ll3/w;

    .line 56
    .line 57
    invoke-direct {p1}, Ll3/v;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-object p1, p0, Ll3/D;->d:Ll3/w;

    .line 61
    .line 62
    new-instance v4, Ll3/N;

    .line 63
    .line 64
    invoke-direct {v4}, Ll3/v;-><init>()V

    .line 65
    .line 66
    .line 67
    sget-object v5, Ll4/y;->f:[B

    .line 68
    .line 69
    iput-object v5, v4, Ll3/N;->m:[B

    .line 70
    .line 71
    iput-object v4, p0, Ll3/D;->e:Ll3/N;

    .line 72
    .line 73
    new-instance v5, Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 76
    .line 77
    .line 78
    new-instance v6, Ll3/J;

    .line 79
    .line 80
    invoke-direct {v6}, Ll3/v;-><init>()V

    .line 81
    .line 82
    .line 83
    const/4 v7, 0x3

    .line 84
    new-array v7, v7, [Ll3/v;

    .line 85
    .line 86
    aput-object v6, v7, v2

    .line 87
    .line 88
    aput-object p1, v7, v1

    .line 89
    .line 90
    const/4 p1, 0x2

    .line 91
    aput-object v4, v7, p1

    .line 92
    .line 93
    invoke-static {v5, v7}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    iget-object p1, v3, Lb5/G1;->b:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast p1, [Ll3/j;

    .line 99
    .line 100
    invoke-static {v5, p1}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    new-array p1, v2, [Ll3/j;

    .line 104
    .line 105
    invoke-virtual {v5, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    check-cast p1, [Ll3/j;

    .line 110
    .line 111
    iput-object p1, p0, Ll3/D;->f:[Ll3/j;

    .line 112
    .line 113
    new-instance p1, Ll3/F;

    .line 114
    .line 115
    invoke-direct {p1}, Ll3/v;-><init>()V

    .line 116
    .line 117
    .line 118
    new-array v1, v1, [Ll3/j;

    .line 119
    .line 120
    aput-object p1, v1, v2

    .line 121
    .line 122
    iput-object v1, p0, Ll3/D;->g:[Ll3/j;

    .line 123
    .line 124
    const/high16 p1, 0x3f800000    # 1.0f

    .line 125
    .line 126
    iput p1, p0, Ll3/D;->J:F

    .line 127
    .line 128
    sget-object p1, Ll3/e;->g:Ll3/e;

    .line 129
    .line 130
    iput-object p1, p0, Ll3/D;->v:Ll3/e;

    .line 131
    .line 132
    iput v2, p0, Ll3/D;->W:I

    .line 133
    .line 134
    new-instance p1, Ll3/u;

    .line 135
    .line 136
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 137
    .line 138
    .line 139
    iput-object p1, p0, Ll3/D;->X:Ll3/u;

    .line 140
    .line 141
    new-instance v3, Ll3/B;

    .line 142
    .line 143
    sget-object v4, Lj3/m0;->d:Lj3/m0;

    .line 144
    .line 145
    const-wide/16 v6, 0x0

    .line 146
    .line 147
    const-wide/16 v8, 0x0

    .line 148
    .line 149
    const/4 v5, 0x0

    .line 150
    invoke-direct/range {v3 .. v9}, Ll3/B;-><init>(Lj3/m0;ZJJ)V

    .line 151
    .line 152
    .line 153
    iput-object v3, p0, Ll3/D;->x:Ll3/B;

    .line 154
    .line 155
    iput-object v4, p0, Ll3/D;->y:Lj3/m0;

    .line 156
    .line 157
    const/4 p1, -0x1

    .line 158
    iput p1, p0, Ll3/D;->R:I

    .line 159
    .line 160
    new-array p1, v2, [Ll3/j;

    .line 161
    .line 162
    iput-object p1, p0, Ll3/D;->K:[Ll3/j;

    .line 163
    .line 164
    new-array p1, v2, [Ljava/nio/ByteBuffer;

    .line 165
    .line 166
    iput-object p1, p0, Ll3/D;->L:[Ljava/nio/ByteBuffer;

    .line 167
    .line 168
    new-instance p1, Ljava/util/ArrayDeque;

    .line 169
    .line 170
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 171
    .line 172
    .line 173
    iput-object p1, p0, Ll3/D;->j:Ljava/util/ArrayDeque;

    .line 174
    .line 175
    new-instance p1, LF0/h;

    .line 176
    .line 177
    invoke-direct {p1, v0}, LF0/h;-><init>(I)V

    .line 178
    .line 179
    .line 180
    iput-object p1, p0, Ll3/D;->n:LF0/h;

    .line 181
    .line 182
    new-instance p1, LF0/h;

    .line 183
    .line 184
    invoke-direct {p1, v0}, LF0/h;-><init>(I)V

    .line 185
    .line 186
    .line 187
    iput-object p1, p0, Ll3/D;->o:LF0/h;

    .line 188
    .line 189
    return-void
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
.end method

.method public static e(III)Landroid/media/AudioFormat;
    .locals 1

    .line 1
    new-instance v0, Landroid/media/AudioFormat$Builder;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/media/AudioFormat$Builder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Landroid/media/AudioFormat$Builder;->setSampleRate(I)Landroid/media/AudioFormat$Builder;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0, p1}, Landroid/media/AudioFormat$Builder;->setChannelMask(I)Landroid/media/AudioFormat$Builder;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0, p2}, Landroid/media/AudioFormat$Builder;->setEncoding(I)Landroid/media/AudioFormat$Builder;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0}, Landroid/media/AudioFormat$Builder;->build()Landroid/media/AudioFormat;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
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

.method public static n(Landroid/media/AudioTrack;)Z
    .locals 2

    .line 1
    sget v0, Ll4/y;->a:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, LQ2/f;->v(Landroid/media/AudioTrack;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
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
.method public final a(J)V
    .locals 12

    .line 1
    invoke-virtual {p0}, Ll3/D;->t()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Ll3/D;->b:Lb5/G1;

    .line 6
    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    invoke-virtual {p0}, Ll3/D;->g()Ll3/B;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v0, v0, Ll3/B;->a:Lj3/m0;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget v2, v0, Lj3/m0;->a:F

    .line 19
    .line 20
    iget-object v3, v1, Lb5/G1;->d:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v3, Ll3/M;

    .line 23
    .line 24
    iget v4, v3, Ll3/M;->c:F

    .line 25
    .line 26
    cmpl-float v4, v4, v2

    .line 27
    .line 28
    const/4 v5, 0x1

    .line 29
    if-eqz v4, :cond_0

    .line 30
    .line 31
    iput v2, v3, Ll3/M;->c:F

    .line 32
    .line 33
    iput-boolean v5, v3, Ll3/M;->i:Z

    .line 34
    .line 35
    :cond_0
    iget v2, v3, Ll3/M;->d:F

    .line 36
    .line 37
    iget v4, v0, Lj3/m0;->b:F

    .line 38
    .line 39
    cmpl-float v2, v2, v4

    .line 40
    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    iput v4, v3, Ll3/M;->d:F

    .line 44
    .line 45
    iput-boolean v5, v3, Ll3/M;->i:Z

    .line 46
    .line 47
    :cond_1
    :goto_0
    move-object v3, v0

    .line 48
    goto :goto_1

    .line 49
    :cond_2
    sget-object v0, Lj3/m0;->d:Lj3/m0;

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :goto_1
    invoke-virtual {p0}, Ll3/D;->t()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    const/4 v9, 0x0

    .line 57
    if-eqz v0, :cond_3

    .line 58
    .line 59
    invoke-virtual {p0}, Ll3/D;->g()Ll3/B;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iget-boolean v0, v0, Ll3/B;->b:Z

    .line 64
    .line 65
    iget-object v1, v1, Lb5/G1;->c:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v1, Ll3/K;

    .line 68
    .line 69
    iput-boolean v0, v1, Ll3/K;->m:Z

    .line 70
    .line 71
    move v4, v0

    .line 72
    goto :goto_2

    .line 73
    :cond_3
    move v4, v9

    .line 74
    :goto_2
    iget-object v0, p0, Ll3/D;->j:Ljava/util/ArrayDeque;

    .line 75
    .line 76
    new-instance v2, Ll3/B;

    .line 77
    .line 78
    const-wide/16 v5, 0x0

    .line 79
    .line 80
    invoke-static {v5, v6, p1, p2}, Ljava/lang/Math;->max(JJ)J

    .line 81
    .line 82
    .line 83
    move-result-wide v5

    .line 84
    iget-object p1, p0, Ll3/D;->t:Ll3/A;

    .line 85
    .line 86
    invoke-virtual {p0}, Ll3/D;->i()J

    .line 87
    .line 88
    .line 89
    move-result-wide v7

    .line 90
    const-wide/32 v10, 0xf4240

    .line 91
    .line 92
    .line 93
    mul-long/2addr v7, v10

    .line 94
    iget p1, p1, Ll3/A;->e:I

    .line 95
    .line 96
    int-to-long p1, p1

    .line 97
    div-long/2addr v7, p1

    .line 98
    invoke-direct/range {v2 .. v8}, Ll3/B;-><init>(Lj3/m0;ZJJ)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    iget-object p1, p0, Ll3/D;->t:Ll3/A;

    .line 105
    .line 106
    iget-object p1, p1, Ll3/A;->i:[Ll3/j;

    .line 107
    .line 108
    new-instance p2, Ljava/util/ArrayList;

    .line 109
    .line 110
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 111
    .line 112
    .line 113
    array-length v0, p1

    .line 114
    move v1, v9

    .line 115
    :goto_3
    if-ge v1, v0, :cond_5

    .line 116
    .line 117
    aget-object v2, p1, v1

    .line 118
    .line 119
    invoke-interface {v2}, Ll3/j;->a()Z

    .line 120
    .line 121
    .line 122
    move-result v3

    .line 123
    if-eqz v3, :cond_4

    .line 124
    .line 125
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    goto :goto_4

    .line 129
    :cond_4
    invoke-interface {v2}, Ll3/j;->flush()V

    .line 130
    .line 131
    .line 132
    :goto_4
    add-int/lit8 v1, v1, 0x1

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_5
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    new-array v0, p1, [Ll3/j;

    .line 140
    .line 141
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p2

    .line 145
    check-cast p2, [Ll3/j;

    .line 146
    .line 147
    iput-object p2, p0, Ll3/D;->K:[Ll3/j;

    .line 148
    .line 149
    new-array p1, p1, [Ljava/nio/ByteBuffer;

    .line 150
    .line 151
    iput-object p1, p0, Ll3/D;->L:[Ljava/nio/ByteBuffer;

    .line 152
    .line 153
    :goto_5
    iget-object p1, p0, Ll3/D;->K:[Ll3/j;

    .line 154
    .line 155
    array-length p2, p1

    .line 156
    if-ge v9, p2, :cond_6

    .line 157
    .line 158
    aget-object p1, p1, v9

    .line 159
    .line 160
    invoke-interface {p1}, Ll3/j;->flush()V

    .line 161
    .line 162
    .line 163
    iget-object p2, p0, Ll3/D;->L:[Ljava/nio/ByteBuffer;

    .line 164
    .line 165
    invoke-interface {p1}, Ll3/j;->b()Ljava/nio/ByteBuffer;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    aput-object p1, p2, v9

    .line 170
    .line 171
    add-int/lit8 v9, v9, 0x1

    .line 172
    .line 173
    goto :goto_5

    .line 174
    :cond_6
    iget-object p1, p0, Ll3/D;->r:Li/G;

    .line 175
    .line 176
    if-eqz p1, :cond_7

    .line 177
    .line 178
    iget-object p1, p1, Li/G;->b:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast p1, Ll3/H;

    .line 181
    .line 182
    iget-object p1, p1, Ll3/H;->d1:Ll3/m;

    .line 183
    .line 184
    iget-object p2, p1, Ll3/m;->b:Landroid/os/Handler;

    .line 185
    .line 186
    if-eqz p2, :cond_7

    .line 187
    .line 188
    new-instance v0, Ll3/l;

    .line 189
    .line 190
    invoke-direct {v0, p1, v4}, Ll3/l;-><init>(Ll3/m;Z)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 194
    .line 195
    .line 196
    :cond_7
    return-void
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
.end method

.method public final b(Lj3/M;[I)V
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v3, p1

    .line 4
    .line 5
    iget-object v0, v3, Lj3/M;->l:Ljava/lang/String;

    .line 6
    .line 7
    const-string v2, "audio/raw"

    .line 8
    .line 9
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v2, 0x2

    .line 14
    const/4 v4, 0x1

    .line 15
    const/4 v5, 0x0

    .line 16
    iget v6, v3, Lj3/M;->z:I

    .line 17
    .line 18
    iget v7, v3, Lj3/M;->y:I

    .line 19
    .line 20
    if-eqz v0, :cond_6

    .line 21
    .line 22
    iget v0, v3, Lj3/M;->A:I

    .line 23
    .line 24
    invoke-static {v0}, Ll4/y;->F(I)Z

    .line 25
    .line 26
    .line 27
    move-result v8

    .line 28
    invoke-static {v8}, Ll4/a;->h(Z)V

    .line 29
    .line 30
    .line 31
    invoke-static {v0, v7}, Ll4/y;->x(II)I

    .line 32
    .line 33
    .line 34
    move-result v8

    .line 35
    iget-boolean v9, v1, Ll3/D;->c:Z

    .line 36
    .line 37
    if-eqz v9, :cond_1

    .line 38
    .line 39
    const/high16 v9, 0x20000000

    .line 40
    .line 41
    if-eq v0, v9, :cond_0

    .line 42
    .line 43
    const/high16 v9, 0x30000000

    .line 44
    .line 45
    if-eq v0, v9, :cond_0

    .line 46
    .line 47
    const/4 v9, 0x4

    .line 48
    if-ne v0, v9, :cond_1

    .line 49
    .line 50
    :cond_0
    iget-object v9, v1, Ll3/D;->g:[Ll3/j;

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    iget-object v9, v1, Ll3/D;->f:[Ll3/j;

    .line 54
    .line 55
    :goto_0
    iget v10, v3, Lj3/M;->B:I

    .line 56
    .line 57
    iget-object v11, v1, Ll3/D;->e:Ll3/N;

    .line 58
    .line 59
    iput v10, v11, Ll3/N;->i:I

    .line 60
    .line 61
    iget v10, v3, Lj3/M;->C:I

    .line 62
    .line 63
    iput v10, v11, Ll3/N;->j:I

    .line 64
    .line 65
    sget v10, Ll4/y;->a:I

    .line 66
    .line 67
    const/16 v11, 0x15

    .line 68
    .line 69
    if-ge v10, v11, :cond_2

    .line 70
    .line 71
    const/16 v10, 0x8

    .line 72
    .line 73
    if-ne v7, v10, :cond_2

    .line 74
    .line 75
    if-nez p2, :cond_2

    .line 76
    .line 77
    const/4 v10, 0x6

    .line 78
    new-array v11, v10, [I

    .line 79
    .line 80
    move v12, v5

    .line 81
    :goto_1
    if-ge v12, v10, :cond_3

    .line 82
    .line 83
    aput v12, v11, v12

    .line 84
    .line 85
    add-int/lit8 v12, v12, 0x1

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_2
    move-object/from16 v11, p2

    .line 89
    .line 90
    :cond_3
    iget-object v10, v1, Ll3/D;->d:Ll3/w;

    .line 91
    .line 92
    iput-object v11, v10, Ll3/w;->i:[I

    .line 93
    .line 94
    new-instance v10, Ll3/h;

    .line 95
    .line 96
    invoke-direct {v10, v6, v7, v0}, Ll3/h;-><init>(III)V

    .line 97
    .line 98
    .line 99
    array-length v0, v9

    .line 100
    move v6, v5

    .line 101
    :goto_2
    if-ge v6, v0, :cond_5

    .line 102
    .line 103
    aget-object v7, v9, v6

    .line 104
    .line 105
    :try_start_0
    invoke-interface {v7, v10}, Ll3/j;->f(Ll3/h;)Ll3/h;

    .line 106
    .line 107
    .line 108
    move-result-object v11

    .line 109
    invoke-interface {v7}, Ll3/j;->a()Z

    .line 110
    .line 111
    .line 112
    move-result v7
    :try_end_0
    .catch Ll3/i; {:try_start_0 .. :try_end_0} :catch_0

    .line 113
    if-eqz v7, :cond_4

    .line 114
    .line 115
    move-object v10, v11

    .line 116
    :cond_4
    add-int/lit8 v6, v6, 0x1

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :catch_0
    move-exception v0

    .line 120
    new-instance v2, Ll3/n;

    .line 121
    .line 122
    invoke-direct {v2, v0, v3}, Ll3/n;-><init>(Ll3/i;Lj3/M;)V

    .line 123
    .line 124
    .line 125
    throw v2

    .line 126
    :cond_5
    iget v0, v10, Ll3/h;->c:I

    .line 127
    .line 128
    iget v6, v10, Ll3/h;->b:I

    .line 129
    .line 130
    invoke-static {v6}, Ll4/y;->n(I)I

    .line 131
    .line 132
    .line 133
    move-result v7

    .line 134
    invoke-static {v0, v6}, Ll4/y;->x(II)I

    .line 135
    .line 136
    .line 137
    move-result v6

    .line 138
    iget v10, v10, Ll3/h;->a:I

    .line 139
    .line 140
    move-object v11, v9

    .line 141
    move v9, v0

    .line 142
    move v0, v8

    .line 143
    move v8, v7

    .line 144
    move v7, v10

    .line 145
    move v10, v5

    .line 146
    goto :goto_3

    .line 147
    :cond_6
    new-array v9, v5, [Ll3/j;

    .line 148
    .line 149
    iget-object v0, v1, Ll3/D;->v:Ll3/e;

    .line 150
    .line 151
    invoke-virtual {v1, v3, v0}, Ll3/D;->u(Lj3/M;Ll3/e;)Z

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    const/4 v8, -0x1

    .line 156
    if-eqz v0, :cond_7

    .line 157
    .line 158
    iget-object v0, v3, Lj3/M;->l:Ljava/lang/String;

    .line 159
    .line 160
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    iget-object v10, v3, Lj3/M;->i:Ljava/lang/String;

    .line 164
    .line 165
    invoke-static {v0, v10}, Ll4/n;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    invoke-static {v7}, Ll4/y;->n(I)I

    .line 170
    .line 171
    .line 172
    move-result v7

    .line 173
    move v10, v4

    .line 174
    move-object v11, v9

    .line 175
    move v9, v0

    .line 176
    move v0, v8

    .line 177
    move v8, v7

    .line 178
    move v7, v6

    .line 179
    move v6, v0

    .line 180
    goto :goto_3

    .line 181
    :cond_7
    iget-object v0, v1, Ll3/D;->a:Ll3/g;

    .line 182
    .line 183
    invoke-virtual {v0, v3}, Ll3/g;->a(Lj3/M;)Landroid/util/Pair;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    if-eqz v0, :cond_11

    .line 188
    .line 189
    iget-object v7, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast v7, Ljava/lang/Integer;

    .line 192
    .line 193
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 194
    .line 195
    .line 196
    move-result v7

    .line 197
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast v0, Ljava/lang/Integer;

    .line 200
    .line 201
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    move v10, v2

    .line 206
    move-object v11, v9

    .line 207
    move v9, v7

    .line 208
    move v7, v6

    .line 209
    move v6, v8

    .line 210
    move v8, v0

    .line 211
    move v0, v6

    .line 212
    :goto_3
    const-string v12, ") for: "

    .line 213
    .line 214
    if-eqz v9, :cond_10

    .line 215
    .line 216
    if-eqz v8, :cond_f

    .line 217
    .line 218
    invoke-static {v7, v8, v9}, Landroid/media/AudioTrack;->getMinBufferSize(III)I

    .line 219
    .line 220
    .line 221
    move-result v12

    .line 222
    const/4 v13, -0x2

    .line 223
    if-eq v12, v13, :cond_8

    .line 224
    .line 225
    move v13, v4

    .line 226
    goto :goto_4

    .line 227
    :cond_8
    move v13, v5

    .line 228
    :goto_4
    invoke-static {v13}, Ll4/a;->m(Z)V

    .line 229
    .line 230
    .line 231
    iget-boolean v13, v1, Ll3/D;->k:Z

    .line 232
    .line 233
    if-eqz v13, :cond_9

    .line 234
    .line 235
    const-wide/high16 v13, 0x4020000000000000L    # 8.0

    .line 236
    .line 237
    goto :goto_5

    .line 238
    :cond_9
    const-wide/high16 v13, 0x3ff0000000000000L    # 1.0

    .line 239
    .line 240
    :goto_5
    iget-object v15, v1, Ll3/D;->p:Ll3/E;

    .line 241
    .line 242
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    const-wide/32 v17, 0xf4240

    .line 246
    .line 247
    .line 248
    const v15, 0x3d090

    .line 249
    .line 250
    .line 251
    if-eqz v10, :cond_d

    .line 252
    .line 253
    if-eq v10, v4, :cond_c

    .line 254
    .line 255
    if-ne v10, v2, :cond_b

    .line 256
    .line 257
    const/4 v2, 0x5

    .line 258
    if-ne v9, v2, :cond_a

    .line 259
    .line 260
    const v15, 0x7a120

    .line 261
    .line 262
    .line 263
    :cond_a
    invoke-static {v9}, Ll3/E;->a(I)I

    .line 264
    .line 265
    .line 266
    move-result v2

    .line 267
    move/from16 v16, v4

    .line 268
    .line 269
    int-to-long v4, v15

    .line 270
    int-to-long v2, v2

    .line 271
    mul-long/2addr v4, v2

    .line 272
    div-long v4, v4, v17

    .line 273
    .line 274
    invoke-static {v4, v5}, Lv4/e;->e(J)I

    .line 275
    .line 276
    .line 277
    move-result v2

    .line 278
    goto :goto_6

    .line 279
    :cond_b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 280
    .line 281
    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 282
    .line 283
    .line 284
    throw v0

    .line 285
    :cond_c
    move/from16 v16, v4

    .line 286
    .line 287
    invoke-static {v9}, Ll3/E;->a(I)I

    .line 288
    .line 289
    .line 290
    move-result v2

    .line 291
    const v3, 0x2faf080

    .line 292
    .line 293
    .line 294
    int-to-long v3, v3

    .line 295
    move-wide/from16 v19, v3

    .line 296
    .line 297
    int-to-long v2, v2

    .line 298
    mul-long v3, v19, v2

    .line 299
    .line 300
    div-long v3, v3, v17

    .line 301
    .line 302
    invoke-static {v3, v4}, Lv4/e;->e(J)I

    .line 303
    .line 304
    .line 305
    move-result v2

    .line 306
    goto :goto_6

    .line 307
    :cond_d
    move/from16 v16, v4

    .line 308
    .line 309
    mul-int/lit8 v2, v12, 0x4

    .line 310
    .line 311
    int-to-long v3, v15

    .line 312
    move-wide/from16 v19, v3

    .line 313
    .line 314
    int-to-long v3, v7

    .line 315
    mul-long v19, v19, v3

    .line 316
    .line 317
    move-wide/from16 v21, v3

    .line 318
    .line 319
    int-to-long v3, v6

    .line 320
    mul-long v19, v19, v3

    .line 321
    .line 322
    div-long v19, v19, v17

    .line 323
    .line 324
    invoke-static/range {v19 .. v20}, Lv4/e;->e(J)I

    .line 325
    .line 326
    .line 327
    move-result v5

    .line 328
    const v15, 0xb71b0

    .line 329
    .line 330
    .line 331
    move-wide/from16 v19, v3

    .line 332
    .line 333
    int-to-long v3, v15

    .line 334
    mul-long v3, v3, v21

    .line 335
    .line 336
    mul-long v3, v3, v19

    .line 337
    .line 338
    div-long v3, v3, v17

    .line 339
    .line 340
    invoke-static {v3, v4}, Lv4/e;->e(J)I

    .line 341
    .line 342
    .line 343
    move-result v3

    .line 344
    invoke-static {v2, v5, v3}, Ll4/y;->i(III)I

    .line 345
    .line 346
    .line 347
    move-result v2

    .line 348
    :goto_6
    int-to-double v2, v2

    .line 349
    mul-double/2addr v2, v13

    .line 350
    double-to-int v2, v2

    .line 351
    invoke-static {v12, v2}, Ljava/lang/Math;->max(II)I

    .line 352
    .line 353
    .line 354
    move-result v2

    .line 355
    add-int/2addr v2, v6

    .line 356
    add-int/lit8 v2, v2, -0x1

    .line 357
    .line 358
    div-int/2addr v2, v6

    .line 359
    mul-int/2addr v2, v6

    .line 360
    const/4 v3, 0x0

    .line 361
    iput-boolean v3, v1, Ll3/D;->b0:Z

    .line 362
    .line 363
    move v5, v10

    .line 364
    move v10, v2

    .line 365
    new-instance v2, Ll3/A;

    .line 366
    .line 367
    move-object/from16 v3, p1

    .line 368
    .line 369
    move v4, v0

    .line 370
    invoke-direct/range {v2 .. v11}, Ll3/A;-><init>(Lj3/M;IIIIIII[Ll3/j;)V

    .line 371
    .line 372
    .line 373
    invoke-virtual {v1}, Ll3/D;->m()Z

    .line 374
    .line 375
    .line 376
    move-result v0

    .line 377
    if-eqz v0, :cond_e

    .line 378
    .line 379
    iput-object v2, v1, Ll3/D;->s:Ll3/A;

    .line 380
    .line 381
    return-void

    .line 382
    :cond_e
    iput-object v2, v1, Ll3/D;->t:Ll3/A;

    .line 383
    .line 384
    return-void

    .line 385
    :cond_f
    move v5, v10

    .line 386
    new-instance v0, Ll3/n;

    .line 387
    .line 388
    new-instance v2, Ljava/lang/StringBuilder;

    .line 389
    .line 390
    const-string v4, "Invalid output channel config (mode="

    .line 391
    .line 392
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 393
    .line 394
    .line 395
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 396
    .line 397
    .line 398
    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 399
    .line 400
    .line 401
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 402
    .line 403
    .line 404
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v2

    .line 408
    invoke-direct {v0, v2, v3}, Ll3/n;-><init>(Ljava/lang/String;Lj3/M;)V

    .line 409
    .line 410
    .line 411
    throw v0

    .line 412
    :cond_10
    move v5, v10

    .line 413
    new-instance v0, Ll3/n;

    .line 414
    .line 415
    new-instance v2, Ljava/lang/StringBuilder;

    .line 416
    .line 417
    const-string v4, "Invalid output encoding (mode="

    .line 418
    .line 419
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 420
    .line 421
    .line 422
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 423
    .line 424
    .line 425
    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 426
    .line 427
    .line 428
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 429
    .line 430
    .line 431
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object v2

    .line 435
    invoke-direct {v0, v2, v3}, Ll3/n;-><init>(Ljava/lang/String;Lj3/M;)V

    .line 436
    .line 437
    .line 438
    throw v0

    .line 439
    :cond_11
    new-instance v0, Ll3/n;

    .line 440
    .line 441
    new-instance v2, Ljava/lang/StringBuilder;

    .line 442
    .line 443
    const-string v4, "Unable to configure passthrough for: "

    .line 444
    .line 445
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 446
    .line 447
    .line 448
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 449
    .line 450
    .line 451
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 452
    .line 453
    .line 454
    move-result-object v2

    .line 455
    invoke-direct {v0, v2, v3}, Ll3/n;-><init>(Ljava/lang/String;Lj3/M;)V

    .line 456
    .line 457
    .line 458
    throw v0
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
.end method

.method public final c()Z
    .locals 9

    .line 1
    iget v0, p0, Ll3/D;->R:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, -0x1

    .line 6
    if-ne v0, v3, :cond_0

    .line 7
    .line 8
    iput v2, p0, Ll3/D;->R:I

    .line 9
    .line 10
    :goto_0
    move v0, v1

    .line 11
    goto :goto_1

    .line 12
    :cond_0
    move v0, v2

    .line 13
    :goto_1
    iget v4, p0, Ll3/D;->R:I

    .line 14
    .line 15
    iget-object v5, p0, Ll3/D;->K:[Ll3/j;

    .line 16
    .line 17
    array-length v6, v5

    .line 18
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    if-ge v4, v6, :cond_3

    .line 24
    .line 25
    aget-object v4, v5, v4

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-interface {v4}, Ll3/j;->c()V

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-virtual {p0, v7, v8}, Ll3/D;->p(J)V

    .line 33
    .line 34
    .line 35
    invoke-interface {v4}, Ll3/j;->d()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_2

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_2
    iget v0, p0, Ll3/D;->R:I

    .line 43
    .line 44
    add-int/2addr v0, v1

    .line 45
    iput v0, p0, Ll3/D;->R:I

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_3
    iget-object v0, p0, Ll3/D;->O:Ljava/nio/ByteBuffer;

    .line 49
    .line 50
    if-eqz v0, :cond_4

    .line 51
    .line 52
    invoke-virtual {p0, v0, v7, v8}, Ll3/D;->v(Ljava/nio/ByteBuffer;J)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Ll3/D;->O:Ljava/nio/ByteBuffer;

    .line 56
    .line 57
    if-eqz v0, :cond_4

    .line 58
    .line 59
    :goto_2
    return v2

    .line 60
    :cond_4
    iput v3, p0, Ll3/D;->R:I

    .line 61
    .line 62
    return v1
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

.method public final d()V
    .locals 11

    .line 1
    invoke-virtual {p0}, Ll3/D;->m()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_6

    .line 7
    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    iput-wide v2, p0, Ll3/D;->B:J

    .line 11
    .line 12
    iput-wide v2, p0, Ll3/D;->C:J

    .line 13
    .line 14
    iput-wide v2, p0, Ll3/D;->D:J

    .line 15
    .line 16
    iput-wide v2, p0, Ll3/D;->E:J

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput-boolean v0, p0, Ll3/D;->c0:Z

    .line 20
    .line 21
    iput v0, p0, Ll3/D;->F:I

    .line 22
    .line 23
    new-instance v4, Ll3/B;

    .line 24
    .line 25
    invoke-virtual {p0}, Ll3/D;->g()Ll3/B;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    iget-object v5, v5, Ll3/B;->a:Lj3/m0;

    .line 30
    .line 31
    invoke-virtual {p0}, Ll3/D;->g()Ll3/B;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    iget-boolean v6, v6, Ll3/B;->b:Z

    .line 36
    .line 37
    const-wide/16 v9, 0x0

    .line 38
    .line 39
    const-wide/16 v7, 0x0

    .line 40
    .line 41
    invoke-direct/range {v4 .. v10}, Ll3/B;-><init>(Lj3/m0;ZJJ)V

    .line 42
    .line 43
    .line 44
    iput-object v4, p0, Ll3/D;->x:Ll3/B;

    .line 45
    .line 46
    iput-wide v2, p0, Ll3/D;->I:J

    .line 47
    .line 48
    iput-object v1, p0, Ll3/D;->w:Ll3/B;

    .line 49
    .line 50
    iget-object v4, p0, Ll3/D;->j:Ljava/util/ArrayDeque;

    .line 51
    .line 52
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->clear()V

    .line 53
    .line 54
    .line 55
    iput-object v1, p0, Ll3/D;->M:Ljava/nio/ByteBuffer;

    .line 56
    .line 57
    iput v0, p0, Ll3/D;->N:I

    .line 58
    .line 59
    iput-object v1, p0, Ll3/D;->O:Ljava/nio/ByteBuffer;

    .line 60
    .line 61
    iput-boolean v0, p0, Ll3/D;->T:Z

    .line 62
    .line 63
    iput-boolean v0, p0, Ll3/D;->S:Z

    .line 64
    .line 65
    const/4 v4, -0x1

    .line 66
    iput v4, p0, Ll3/D;->R:I

    .line 67
    .line 68
    iput-object v1, p0, Ll3/D;->z:Ljava/nio/ByteBuffer;

    .line 69
    .line 70
    iput v0, p0, Ll3/D;->A:I

    .line 71
    .line 72
    iget-object v4, p0, Ll3/D;->e:Ll3/N;

    .line 73
    .line 74
    iput-wide v2, v4, Ll3/N;->o:J

    .line 75
    .line 76
    move v4, v0

    .line 77
    :goto_0
    iget-object v5, p0, Ll3/D;->K:[Ll3/j;

    .line 78
    .line 79
    array-length v6, v5

    .line 80
    if-ge v4, v6, :cond_0

    .line 81
    .line 82
    aget-object v5, v5, v4

    .line 83
    .line 84
    invoke-interface {v5}, Ll3/j;->flush()V

    .line 85
    .line 86
    .line 87
    iget-object v6, p0, Ll3/D;->L:[Ljava/nio/ByteBuffer;

    .line 88
    .line 89
    invoke-interface {v5}, Ll3/j;->b()Ljava/nio/ByteBuffer;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    aput-object v5, v6, v4

    .line 94
    .line 95
    add-int/lit8 v4, v4, 0x1

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_0
    iget-object v4, p0, Ll3/D;->i:Ll3/t;

    .line 99
    .line 100
    iget-object v4, v4, Ll3/t;->c:Landroid/media/AudioTrack;

    .line 101
    .line 102
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v4}, Landroid/media/AudioTrack;->getPlayState()I

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    const/4 v5, 0x3

    .line 110
    if-ne v4, v5, :cond_1

    .line 111
    .line 112
    iget-object v4, p0, Ll3/D;->u:Landroid/media/AudioTrack;

    .line 113
    .line 114
    invoke-virtual {v4}, Landroid/media/AudioTrack;->pause()V

    .line 115
    .line 116
    .line 117
    :cond_1
    iget-object v4, p0, Ll3/D;->u:Landroid/media/AudioTrack;

    .line 118
    .line 119
    invoke-static {v4}, Ll3/D;->n(Landroid/media/AudioTrack;)Z

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    if-eqz v4, :cond_2

    .line 124
    .line 125
    iget-object v4, p0, Ll3/D;->m:Lb5/G1;

    .line 126
    .line 127
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    iget-object v5, p0, Ll3/D;->u:Landroid/media/AudioTrack;

    .line 131
    .line 132
    iget-object v6, v4, Lb5/G1;->c:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v6, Ll3/C;

    .line 135
    .line 136
    invoke-static {v5, v6}, LQ2/f;->m(Landroid/media/AudioTrack;Ll3/C;)V

    .line 137
    .line 138
    .line 139
    iget-object v4, v4, Lb5/G1;->b:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v4, Landroid/os/Handler;

    .line 142
    .line 143
    invoke-virtual {v4, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    :cond_2
    sget v4, Ll4/y;->a:I

    .line 147
    .line 148
    const/16 v5, 0x15

    .line 149
    .line 150
    if-ge v4, v5, :cond_3

    .line 151
    .line 152
    iget-boolean v4, p0, Ll3/D;->V:Z

    .line 153
    .line 154
    if-nez v4, :cond_3

    .line 155
    .line 156
    iput v0, p0, Ll3/D;->W:I

    .line 157
    .line 158
    :cond_3
    iget-object v4, p0, Ll3/D;->s:Ll3/A;

    .line 159
    .line 160
    if-eqz v4, :cond_4

    .line 161
    .line 162
    iput-object v4, p0, Ll3/D;->t:Ll3/A;

    .line 163
    .line 164
    iput-object v1, p0, Ll3/D;->s:Ll3/A;

    .line 165
    .line 166
    :cond_4
    iget-object v4, p0, Ll3/D;->i:Ll3/t;

    .line 167
    .line 168
    iput-wide v2, v4, Ll3/t;->l:J

    .line 169
    .line 170
    iput v0, v4, Ll3/t;->w:I

    .line 171
    .line 172
    iput v0, v4, Ll3/t;->v:I

    .line 173
    .line 174
    iput-wide v2, v4, Ll3/t;->m:J

    .line 175
    .line 176
    iput-wide v2, v4, Ll3/t;->C:J

    .line 177
    .line 178
    iput-wide v2, v4, Ll3/t;->F:J

    .line 179
    .line 180
    iput-boolean v0, v4, Ll3/t;->k:Z

    .line 181
    .line 182
    iput-object v1, v4, Ll3/t;->c:Landroid/media/AudioTrack;

    .line 183
    .line 184
    iput-object v1, v4, Ll3/t;->f:Ll3/s;

    .line 185
    .line 186
    iget-object v0, p0, Ll3/D;->u:Landroid/media/AudioTrack;

    .line 187
    .line 188
    iget-object v2, p0, Ll3/D;->h:LH1/k;

    .line 189
    .line 190
    invoke-virtual {v2}, LH1/k;->c()V

    .line 191
    .line 192
    .line 193
    sget-object v3, Ll3/D;->d0:Ljava/lang/Object;

    .line 194
    .line 195
    monitor-enter v3

    .line 196
    :try_start_0
    sget-object v4, Ll3/D;->e0:Ljava/util/concurrent/ExecutorService;

    .line 197
    .line 198
    if-nez v4, :cond_5

    .line 199
    .line 200
    const-string v4, "ExoPlayer:AudioTrackReleaseThread"

    .line 201
    .line 202
    new-instance v5, Ld0/a;

    .line 203
    .line 204
    const/4 v6, 0x1

    .line 205
    invoke-direct {v5, v4, v6}, Ld0/a;-><init>(Ljava/lang/String;I)V

    .line 206
    .line 207
    .line 208
    invoke-static {v5}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 209
    .line 210
    .line 211
    move-result-object v4

    .line 212
    sput-object v4, Ll3/D;->e0:Ljava/util/concurrent/ExecutorService;

    .line 213
    .line 214
    goto :goto_1

    .line 215
    :catchall_0
    move-exception v0

    .line 216
    goto :goto_2

    .line 217
    :cond_5
    :goto_1
    sget v4, Ll3/D;->f0:I

    .line 218
    .line 219
    add-int/lit8 v4, v4, 0x1

    .line 220
    .line 221
    sput v4, Ll3/D;->f0:I

    .line 222
    .line 223
    sget-object v4, Ll3/D;->e0:Ljava/util/concurrent/ExecutorService;

    .line 224
    .line 225
    new-instance v5, LA6/r;

    .line 226
    .line 227
    const/16 v6, 0x12

    .line 228
    .line 229
    invoke-direct {v5, v0, v6, v2}, LA6/r;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    invoke-interface {v4, v5}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 233
    .line 234
    .line 235
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 236
    iput-object v1, p0, Ll3/D;->u:Landroid/media/AudioTrack;

    .line 237
    .line 238
    goto :goto_3

    .line 239
    :goto_2
    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 240
    throw v0

    .line 241
    :cond_6
    :goto_3
    iget-object v0, p0, Ll3/D;->o:LF0/h;

    .line 242
    .line 243
    iput-object v1, v0, LF0/h;->c:Ljava/lang/Object;

    .line 244
    .line 245
    iget-object v0, p0, Ll3/D;->n:LF0/h;

    .line 246
    .line 247
    iput-object v1, v0, LF0/h;->c:Ljava/lang/Object;

    .line 248
    .line 249
    return-void
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

.method public final f(Lj3/M;)I
    .locals 3

    .line 1
    iget-object v0, p1, Lj3/M;->l:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "audio/raw"

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x2

    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    iget p1, p1, Lj3/M;->A:I

    .line 14
    .line 15
    invoke-static {p1}, Ll4/y;->F(I)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    const-string v0, "Invalid PCM encoding: "

    .line 22
    .line 23
    const-string v2, "DefaultAudioSink"

    .line 24
    .line 25
    invoke-static {v0, p1, v2}, Lcom/google/android/gms/internal/measurement/k1;->v(Ljava/lang/String;ILjava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return v1

    .line 29
    :cond_0
    if-eq p1, v2, :cond_4

    .line 30
    .line 31
    iget-boolean v0, p0, Ll3/D;->c:Z

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    const/4 v0, 0x4

    .line 36
    if-ne p1, v0, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const/4 p1, 0x1

    .line 40
    return p1

    .line 41
    :cond_2
    iget-boolean v0, p0, Ll3/D;->b0:Z

    .line 42
    .line 43
    if-nez v0, :cond_3

    .line 44
    .line 45
    iget-object v0, p0, Ll3/D;->v:Ll3/e;

    .line 46
    .line 47
    invoke-virtual {p0, p1, v0}, Ll3/D;->u(Lj3/M;Ll3/e;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_3
    iget-object v0, p0, Ll3/D;->a:Ll3/g;

    .line 55
    .line 56
    invoke-virtual {v0, p1}, Ll3/g;->a(Lj3/M;)Landroid/util/Pair;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    if-eqz p1, :cond_5

    .line 61
    .line 62
    :cond_4
    :goto_0
    return v2

    .line 63
    :cond_5
    return v1
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

.method public final g()Ll3/B;
    .locals 2

    .line 1
    iget-object v0, p0, Ll3/D;->w:Ll3/B;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-object v0, p0, Ll3/D;->j:Ljava/util/ArrayDeque;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->getLast()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Ll3/B;

    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_1
    iget-object v0, p0, Ll3/D;->x:Ll3/B;

    .line 22
    .line 23
    return-object v0
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

.method public final h()J
    .locals 5

    .line 1
    iget-object v0, p0, Ll3/D;->t:Ll3/A;

    .line 2
    .line 3
    iget v1, v0, Ll3/A;->c:I

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    iget-wide v1, p0, Ll3/D;->B:J

    .line 8
    .line 9
    iget v0, v0, Ll3/A;->b:I

    .line 10
    .line 11
    int-to-long v3, v0

    .line 12
    div-long/2addr v1, v3

    .line 13
    return-wide v1

    .line 14
    :cond_0
    iget-wide v0, p0, Ll3/D;->C:J

    .line 15
    .line 16
    return-wide v0
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

.method public final i()J
    .locals 5

    .line 1
    iget-object v0, p0, Ll3/D;->t:Ll3/A;

    .line 2
    .line 3
    iget v1, v0, Ll3/A;->c:I

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    iget-wide v1, p0, Ll3/D;->D:J

    .line 8
    .line 9
    iget v0, v0, Ll3/A;->d:I

    .line 10
    .line 11
    int-to-long v3, v0

    .line 12
    div-long/2addr v1, v3

    .line 13
    return-wide v1

    .line 14
    :cond_0
    iget-wide v0, p0, Ll3/D;->E:J

    .line 15
    .line 16
    return-wide v0
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

.method public final j(Ljava/nio/ByteBuffer;JI)Z
    .locals 26

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-wide/from16 v2, p2

    .line 6
    .line 7
    move/from16 v4, p4

    .line 8
    .line 9
    iget-object v5, v1, Ll3/D;->M:Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    const/4 v6, 0x1

    .line 12
    const/4 v7, 0x0

    .line 13
    if-eqz v5, :cond_1

    .line 14
    .line 15
    if-ne v0, v5, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v5, v7

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    :goto_0
    move v5, v6

    .line 21
    :goto_1
    invoke-static {v5}, Ll4/a;->h(Z)V

    .line 22
    .line 23
    .line 24
    iget-object v5, v1, Ll3/D;->s:Ll3/A;

    .line 25
    .line 26
    const/4 v8, 0x3

    .line 27
    const/4 v9, 0x0

    .line 28
    if-eqz v5, :cond_7

    .line 29
    .line 30
    invoke-virtual {v1}, Ll3/D;->c()Z

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-nez v5, :cond_2

    .line 35
    .line 36
    :goto_2
    move v15, v7

    .line 37
    goto/16 :goto_16

    .line 38
    .line 39
    :cond_2
    iget-object v5, v1, Ll3/D;->s:Ll3/A;

    .line 40
    .line 41
    iget-object v10, v1, Ll3/D;->t:Ll3/A;

    .line 42
    .line 43
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    iget v11, v10, Ll3/A;->c:I

    .line 47
    .line 48
    iget v12, v5, Ll3/A;->c:I

    .line 49
    .line 50
    if-ne v11, v12, :cond_4

    .line 51
    .line 52
    iget v11, v10, Ll3/A;->g:I

    .line 53
    .line 54
    iget v12, v5, Ll3/A;->g:I

    .line 55
    .line 56
    if-ne v11, v12, :cond_4

    .line 57
    .line 58
    iget v11, v10, Ll3/A;->e:I

    .line 59
    .line 60
    iget v12, v5, Ll3/A;->e:I

    .line 61
    .line 62
    if-ne v11, v12, :cond_4

    .line 63
    .line 64
    iget v11, v10, Ll3/A;->f:I

    .line 65
    .line 66
    iget v12, v5, Ll3/A;->f:I

    .line 67
    .line 68
    if-ne v11, v12, :cond_4

    .line 69
    .line 70
    iget v10, v10, Ll3/A;->d:I

    .line 71
    .line 72
    iget v5, v5, Ll3/A;->d:I

    .line 73
    .line 74
    if-ne v10, v5, :cond_4

    .line 75
    .line 76
    iget-object v5, v1, Ll3/D;->s:Ll3/A;

    .line 77
    .line 78
    iput-object v5, v1, Ll3/D;->t:Ll3/A;

    .line 79
    .line 80
    iput-object v9, v1, Ll3/D;->s:Ll3/A;

    .line 81
    .line 82
    iget-object v5, v1, Ll3/D;->u:Landroid/media/AudioTrack;

    .line 83
    .line 84
    invoke-static {v5}, Ll3/D;->n(Landroid/media/AudioTrack;)Z

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    if-eqz v5, :cond_6

    .line 89
    .line 90
    iget v5, v1, Ll3/D;->l:I

    .line 91
    .line 92
    if-eq v5, v8, :cond_6

    .line 93
    .line 94
    iget-object v5, v1, Ll3/D;->u:Landroid/media/AudioTrack;

    .line 95
    .line 96
    invoke-virtual {v5}, Landroid/media/AudioTrack;->getPlayState()I

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    if-ne v5, v8, :cond_3

    .line 101
    .line 102
    iget-object v5, v1, Ll3/D;->u:Landroid/media/AudioTrack;

    .line 103
    .line 104
    invoke-static {v5}, LQ2/f;->k(Landroid/media/AudioTrack;)V

    .line 105
    .line 106
    .line 107
    :cond_3
    iget-object v5, v1, Ll3/D;->u:Landroid/media/AudioTrack;

    .line 108
    .line 109
    iget-object v10, v1, Ll3/D;->t:Ll3/A;

    .line 110
    .line 111
    iget-object v10, v10, Ll3/A;->a:Lj3/M;

    .line 112
    .line 113
    iget v11, v10, Lj3/M;->B:I

    .line 114
    .line 115
    iget v10, v10, Lj3/M;->C:I

    .line 116
    .line 117
    invoke-static {v5, v11, v10}, LQ2/f;->l(Landroid/media/AudioTrack;II)V

    .line 118
    .line 119
    .line 120
    iput-boolean v6, v1, Ll3/D;->c0:Z

    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_4
    invoke-virtual {v1}, Ll3/D;->o()V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v1}, Ll3/D;->k()Z

    .line 127
    .line 128
    .line 129
    move-result v5

    .line 130
    if-eqz v5, :cond_5

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_5
    invoke-virtual {v1}, Ll3/D;->d()V

    .line 134
    .line 135
    .line 136
    :cond_6
    :goto_3
    invoke-virtual {v1, v2, v3}, Ll3/D;->a(J)V

    .line 137
    .line 138
    .line 139
    :cond_7
    invoke-virtual {v1}, Ll3/D;->m()Z

    .line 140
    .line 141
    .line 142
    move-result v5

    .line 143
    iget-object v10, v1, Ll3/D;->n:LF0/h;

    .line 144
    .line 145
    if-nez v5, :cond_9

    .line 146
    .line 147
    :try_start_0
    invoke-virtual {v1}, Ll3/D;->l()Z

    .line 148
    .line 149
    .line 150
    move-result v5
    :try_end_0
    .catch Ll3/o; {:try_start_0 .. :try_end_0} :catch_0

    .line 151
    if-nez v5, :cond_9

    .line 152
    .line 153
    goto :goto_2

    .line 154
    :catch_0
    move-exception v0

    .line 155
    iget-boolean v2, v0, Ll3/o;->b:Z

    .line 156
    .line 157
    if-nez v2, :cond_8

    .line 158
    .line 159
    invoke-virtual {v10, v0}, LF0/h;->N(Ljava/lang/Exception;)V

    .line 160
    .line 161
    .line 162
    return v7

    .line 163
    :cond_8
    throw v0

    .line 164
    :cond_9
    iput-object v9, v10, LF0/h;->c:Ljava/lang/Object;

    .line 165
    .line 166
    iget-boolean v5, v1, Ll3/D;->H:Z

    .line 167
    .line 168
    iget-object v10, v1, Ll3/D;->i:Ll3/t;

    .line 169
    .line 170
    const-wide/16 v11, 0x0

    .line 171
    .line 172
    if-eqz v5, :cond_b

    .line 173
    .line 174
    invoke-static {v11, v12, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 175
    .line 176
    .line 177
    move-result-wide v13

    .line 178
    iput-wide v13, v1, Ll3/D;->I:J

    .line 179
    .line 180
    iput-boolean v7, v1, Ll3/D;->G:Z

    .line 181
    .line 182
    iput-boolean v7, v1, Ll3/D;->H:Z

    .line 183
    .line 184
    iget-boolean v5, v1, Ll3/D;->k:Z

    .line 185
    .line 186
    if-eqz v5, :cond_a

    .line 187
    .line 188
    sget v5, Ll4/y;->a:I

    .line 189
    .line 190
    const/16 v13, 0x17

    .line 191
    .line 192
    if-lt v5, v13, :cond_a

    .line 193
    .line 194
    iget-object v5, v1, Ll3/D;->y:Lj3/m0;

    .line 195
    .line 196
    invoke-virtual {v1, v5}, Ll3/D;->s(Lj3/m0;)V

    .line 197
    .line 198
    .line 199
    :cond_a
    invoke-virtual {v1, v2, v3}, Ll3/D;->a(J)V

    .line 200
    .line 201
    .line 202
    iget-boolean v5, v1, Ll3/D;->U:Z

    .line 203
    .line 204
    if-eqz v5, :cond_b

    .line 205
    .line 206
    iput-boolean v6, v1, Ll3/D;->U:Z

    .line 207
    .line 208
    invoke-virtual {v1}, Ll3/D;->m()Z

    .line 209
    .line 210
    .line 211
    move-result v5

    .line 212
    if-eqz v5, :cond_b

    .line 213
    .line 214
    iget-object v5, v10, Ll3/t;->f:Ll3/s;

    .line 215
    .line 216
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v5}, Ll3/s;->a()V

    .line 220
    .line 221
    .line 222
    iget-object v5, v1, Ll3/D;->u:Landroid/media/AudioTrack;

    .line 223
    .line 224
    invoke-virtual {v5}, Landroid/media/AudioTrack;->play()V

    .line 225
    .line 226
    .line 227
    :cond_b
    invoke-virtual {v1}, Ll3/D;->i()J

    .line 228
    .line 229
    .line 230
    move-result-wide v13

    .line 231
    iget-object v5, v10, Ll3/t;->c:Landroid/media/AudioTrack;

    .line 232
    .line 233
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v5}, Landroid/media/AudioTrack;->getPlayState()I

    .line 237
    .line 238
    .line 239
    move-result v5

    .line 240
    iget-boolean v15, v10, Ll3/t;->h:Z

    .line 241
    .line 242
    move-wide/from16 v16, v11

    .line 243
    .line 244
    const/4 v11, 0x2

    .line 245
    if-eqz v15, :cond_d

    .line 246
    .line 247
    if-ne v5, v11, :cond_c

    .line 248
    .line 249
    iput-boolean v7, v10, Ll3/t;->p:Z

    .line 250
    .line 251
    return v7

    .line 252
    :cond_c
    if-ne v5, v6, :cond_d

    .line 253
    .line 254
    invoke-virtual {v10}, Ll3/t;->a()J

    .line 255
    .line 256
    .line 257
    move-result-wide v18

    .line 258
    cmp-long v12, v18, v16

    .line 259
    .line 260
    if-nez v12, :cond_d

    .line 261
    .line 262
    goto/16 :goto_2

    .line 263
    .line 264
    :cond_d
    iget-boolean v12, v10, Ll3/t;->p:Z

    .line 265
    .line 266
    invoke-virtual {v10, v13, v14}, Ll3/t;->b(J)Z

    .line 267
    .line 268
    .line 269
    move-result v13

    .line 270
    iput-boolean v13, v10, Ll3/t;->p:Z

    .line 271
    .line 272
    if-eqz v12, :cond_e

    .line 273
    .line 274
    if-nez v13, :cond_e

    .line 275
    .line 276
    if-eq v5, v6, :cond_e

    .line 277
    .line 278
    iget v5, v10, Ll3/t;->e:I

    .line 279
    .line 280
    iget-wide v12, v10, Ll3/t;->i:J

    .line 281
    .line 282
    invoke-static {v12, v13}, Ll4/y;->T(J)J

    .line 283
    .line 284
    .line 285
    move-result-wide v21

    .line 286
    iget-object v12, v10, Ll3/t;->a:Lcom/google/firebase/messaging/u;

    .line 287
    .line 288
    iget-object v12, v12, Lcom/google/firebase/messaging/u;->a:Ljava/lang/Object;

    .line 289
    .line 290
    check-cast v12, Ll3/D;

    .line 291
    .line 292
    iget-object v13, v12, Ll3/D;->r:Li/G;

    .line 293
    .line 294
    if-eqz v13, :cond_e

    .line 295
    .line 296
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 297
    .line 298
    .line 299
    move-result-wide v13

    .line 300
    move/from16 v25, v6

    .line 301
    .line 302
    iget-wide v6, v12, Ll3/D;->a0:J

    .line 303
    .line 304
    sub-long v23, v13, v6

    .line 305
    .line 306
    iget-object v6, v12, Ll3/D;->r:Li/G;

    .line 307
    .line 308
    iget-object v6, v6, Li/G;->b:Ljava/lang/Object;

    .line 309
    .line 310
    check-cast v6, Ll3/H;

    .line 311
    .line 312
    iget-object v6, v6, Ll3/H;->d1:Ll3/m;

    .line 313
    .line 314
    iget-object v7, v6, Ll3/m;->b:Landroid/os/Handler;

    .line 315
    .line 316
    if-eqz v7, :cond_f

    .line 317
    .line 318
    new-instance v18, Ll3/k;

    .line 319
    .line 320
    move/from16 v20, v5

    .line 321
    .line 322
    move-object/from16 v19, v6

    .line 323
    .line 324
    invoke-direct/range {v18 .. v24}, Ll3/k;-><init>(Ll3/m;IJJ)V

    .line 325
    .line 326
    .line 327
    move-object/from16 v5, v18

    .line 328
    .line 329
    invoke-virtual {v7, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 330
    .line 331
    .line 332
    goto :goto_4

    .line 333
    :cond_e
    move/from16 v25, v6

    .line 334
    .line 335
    :cond_f
    :goto_4
    iget-object v5, v1, Ll3/D;->M:Ljava/nio/ByteBuffer;

    .line 336
    .line 337
    if-nez v5, :cond_27

    .line 338
    .line 339
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    .line 340
    .line 341
    .line 342
    move-result-object v5

    .line 343
    sget-object v6, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 344
    .line 345
    if-ne v5, v6, :cond_10

    .line 346
    .line 347
    move/from16 v5, v25

    .line 348
    .line 349
    goto :goto_5

    .line 350
    :cond_10
    const/4 v5, 0x0

    .line 351
    :goto_5
    invoke-static {v5}, Ll4/a;->h(Z)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 355
    .line 356
    .line 357
    move-result v5

    .line 358
    if-nez v5, :cond_11

    .line 359
    .line 360
    goto/16 :goto_12

    .line 361
    .line 362
    :cond_11
    iget-object v5, v1, Ll3/D;->t:Ll3/A;

    .line 363
    .line 364
    iget v6, v5, Ll3/A;->c:I

    .line 365
    .line 366
    if-eqz v6, :cond_1f

    .line 367
    .line 368
    iget v6, v1, Ll3/D;->F:I

    .line 369
    .line 370
    if-nez v6, :cond_1f

    .line 371
    .line 372
    iget v5, v5, Ll3/A;->g:I

    .line 373
    .line 374
    const/4 v6, -0x2

    .line 375
    const/16 v7, 0xa

    .line 376
    .line 377
    const/16 v12, 0x400

    .line 378
    .line 379
    const/16 v13, 0x10

    .line 380
    .line 381
    const/4 v14, -0x1

    .line 382
    packed-switch v5, :pswitch_data_0

    .line 383
    .line 384
    .line 385
    :pswitch_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 386
    .line 387
    const-string v2, "Unexpected audio encoding: "

    .line 388
    .line 389
    invoke-static {v5, v2}, Lcom/google/android/gms/internal/measurement/k1;->j(ILjava/lang/String;)Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object v2

    .line 393
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 394
    .line 395
    .line 396
    throw v0

    .line 397
    :pswitch_1
    new-array v5, v13, [B

    .line 398
    .line 399
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 400
    .line 401
    .line 402
    move-result v6

    .line 403
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 404
    .line 405
    .line 406
    invoke-virtual {v0, v6}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 407
    .line 408
    .line 409
    new-instance v6, LZ3/f;

    .line 410
    .line 411
    invoke-direct {v6, v13, v5}, LZ3/f;-><init>(I[B)V

    .line 412
    .line 413
    .line 414
    invoke-static {v6}, Ll3/a;->h(LZ3/f;)LO4/d;

    .line 415
    .line 416
    .line 417
    move-result-object v5

    .line 418
    iget v5, v5, LO4/d;->c:I

    .line 419
    .line 420
    goto/16 :goto_11

    .line 421
    .line 422
    :pswitch_2
    move v5, v12

    .line 423
    goto/16 :goto_11

    .line 424
    .line 425
    :pswitch_3
    const/16 v5, 0x200

    .line 426
    .line 427
    goto/16 :goto_11

    .line 428
    .line 429
    :pswitch_4
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 430
    .line 431
    .line 432
    move-result v5

    .line 433
    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    .line 434
    .line 435
    .line 436
    move-result v8

    .line 437
    sub-int/2addr v8, v7

    .line 438
    move v7, v5

    .line 439
    :goto_6
    if-gt v7, v8, :cond_14

    .line 440
    .line 441
    add-int/lit8 v11, v7, 0x4

    .line 442
    .line 443
    sget v12, Ll4/y;->a:I

    .line 444
    .line 445
    invoke-virtual {v0, v11}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 446
    .line 447
    .line 448
    move-result v11

    .line 449
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    .line 450
    .line 451
    .line 452
    move-result-object v12

    .line 453
    move/from16 v18, v13

    .line 454
    .line 455
    sget-object v13, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 456
    .line 457
    if-ne v12, v13, :cond_12

    .line 458
    .line 459
    goto :goto_7

    .line 460
    :cond_12
    invoke-static {v11}, Ljava/lang/Integer;->reverseBytes(I)I

    .line 461
    .line 462
    .line 463
    move-result v11

    .line 464
    :goto_7
    and-int/2addr v11, v6

    .line 465
    const v12, -0x78d9046

    .line 466
    .line 467
    .line 468
    if-ne v11, v12, :cond_13

    .line 469
    .line 470
    sub-int/2addr v7, v5

    .line 471
    goto :goto_8

    .line 472
    :cond_13
    add-int/lit8 v7, v7, 0x1

    .line 473
    .line 474
    move/from16 v13, v18

    .line 475
    .line 476
    goto :goto_6

    .line 477
    :cond_14
    move/from16 v18, v13

    .line 478
    .line 479
    move v7, v14

    .line 480
    :goto_8
    if-ne v7, v14, :cond_15

    .line 481
    .line 482
    const/4 v5, 0x0

    .line 483
    goto/16 :goto_11

    .line 484
    .line 485
    :cond_15
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 486
    .line 487
    .line 488
    move-result v5

    .line 489
    add-int/2addr v5, v7

    .line 490
    add-int/lit8 v5, v5, 0x7

    .line 491
    .line 492
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 493
    .line 494
    .line 495
    move-result v5

    .line 496
    and-int/lit16 v5, v5, 0xff

    .line 497
    .line 498
    const/16 v6, 0xbb

    .line 499
    .line 500
    if-ne v5, v6, :cond_16

    .line 501
    .line 502
    move/from16 v5, v25

    .line 503
    .line 504
    goto :goto_9

    .line 505
    :cond_16
    const/4 v5, 0x0

    .line 506
    :goto_9
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 507
    .line 508
    .line 509
    move-result v6

    .line 510
    add-int/2addr v6, v7

    .line 511
    if-eqz v5, :cond_17

    .line 512
    .line 513
    const/16 v5, 0x9

    .line 514
    .line 515
    goto :goto_a

    .line 516
    :cond_17
    const/16 v5, 0x8

    .line 517
    .line 518
    :goto_a
    add-int/2addr v6, v5

    .line 519
    invoke-virtual {v0, v6}, Ljava/nio/ByteBuffer;->get(I)B

    .line 520
    .line 521
    .line 522
    move-result v5

    .line 523
    shr-int/lit8 v5, v5, 0x4

    .line 524
    .line 525
    and-int/lit8 v5, v5, 0x7

    .line 526
    .line 527
    const/16 v6, 0x28

    .line 528
    .line 529
    shl-int v5, v6, v5

    .line 530
    .line 531
    mul-int/lit8 v5, v5, 0x10

    .line 532
    .line 533
    goto/16 :goto_11

    .line 534
    .line 535
    :pswitch_5
    const/16 v5, 0x800

    .line 536
    .line 537
    goto/16 :goto_11

    .line 538
    .line 539
    :pswitch_6
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 540
    .line 541
    .line 542
    move-result v5

    .line 543
    sget v6, Ll4/y;->a:I

    .line 544
    .line 545
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 546
    .line 547
    .line 548
    move-result v5

    .line 549
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    .line 550
    .line 551
    .line 552
    move-result-object v6

    .line 553
    sget-object v7, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 554
    .line 555
    if-ne v6, v7, :cond_18

    .line 556
    .line 557
    goto :goto_b

    .line 558
    :cond_18
    invoke-static {v5}, Ljava/lang/Integer;->reverseBytes(I)I

    .line 559
    .line 560
    .line 561
    move-result v5

    .line 562
    :goto_b
    invoke-static {v5}, Ll3/a;->j(I)I

    .line 563
    .line 564
    .line 565
    move-result v5

    .line 566
    if-eq v5, v14, :cond_19

    .line 567
    .line 568
    goto/16 :goto_11

    .line 569
    .line 570
    :cond_19
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 571
    .line 572
    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 573
    .line 574
    .line 575
    throw v0

    .line 576
    :pswitch_7
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 577
    .line 578
    .line 579
    move-result v5

    .line 580
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 581
    .line 582
    .line 583
    move-result v7

    .line 584
    if-eq v7, v6, :cond_1c

    .line 585
    .line 586
    if-eq v7, v14, :cond_1b

    .line 587
    .line 588
    const/16 v6, 0x1f

    .line 589
    .line 590
    if-eq v7, v6, :cond_1a

    .line 591
    .line 592
    add-int/lit8 v6, v5, 0x4

    .line 593
    .line 594
    invoke-virtual {v0, v6}, Ljava/nio/ByteBuffer;->get(I)B

    .line 595
    .line 596
    .line 597
    move-result v6

    .line 598
    and-int/lit8 v6, v6, 0x1

    .line 599
    .line 600
    shl-int/lit8 v6, v6, 0x6

    .line 601
    .line 602
    add-int/lit8 v5, v5, 0x5

    .line 603
    .line 604
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 605
    .line 606
    .line 607
    move-result v5

    .line 608
    :goto_c
    and-int/lit16 v5, v5, 0xfc

    .line 609
    .line 610
    :goto_d
    shr-int/2addr v5, v11

    .line 611
    or-int/2addr v5, v6

    .line 612
    goto :goto_f

    .line 613
    :cond_1a
    add-int/lit8 v6, v5, 0x5

    .line 614
    .line 615
    invoke-virtual {v0, v6}, Ljava/nio/ByteBuffer;->get(I)B

    .line 616
    .line 617
    .line 618
    move-result v6

    .line 619
    and-int/lit8 v6, v6, 0x7

    .line 620
    .line 621
    shl-int/lit8 v6, v6, 0x4

    .line 622
    .line 623
    add-int/lit8 v5, v5, 0x6

    .line 624
    .line 625
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 626
    .line 627
    .line 628
    move-result v5

    .line 629
    :goto_e
    and-int/lit8 v5, v5, 0x3c

    .line 630
    .line 631
    goto :goto_d

    .line 632
    :cond_1b
    add-int/lit8 v6, v5, 0x4

    .line 633
    .line 634
    invoke-virtual {v0, v6}, Ljava/nio/ByteBuffer;->get(I)B

    .line 635
    .line 636
    .line 637
    move-result v6

    .line 638
    and-int/lit8 v6, v6, 0x7

    .line 639
    .line 640
    shl-int/lit8 v6, v6, 0x4

    .line 641
    .line 642
    add-int/lit8 v5, v5, 0x7

    .line 643
    .line 644
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 645
    .line 646
    .line 647
    move-result v5

    .line 648
    goto :goto_e

    .line 649
    :cond_1c
    add-int/lit8 v6, v5, 0x5

    .line 650
    .line 651
    invoke-virtual {v0, v6}, Ljava/nio/ByteBuffer;->get(I)B

    .line 652
    .line 653
    .line 654
    move-result v6

    .line 655
    and-int/lit8 v6, v6, 0x1

    .line 656
    .line 657
    shl-int/lit8 v6, v6, 0x6

    .line 658
    .line 659
    add-int/lit8 v5, v5, 0x4

    .line 660
    .line 661
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 662
    .line 663
    .line 664
    move-result v5

    .line 665
    goto :goto_c

    .line 666
    :goto_f
    add-int/lit8 v5, v5, 0x1

    .line 667
    .line 668
    mul-int/lit8 v5, v5, 0x20

    .line 669
    .line 670
    goto :goto_11

    .line 671
    :pswitch_8
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 672
    .line 673
    .line 674
    move-result v5

    .line 675
    add-int/lit8 v5, v5, 0x5

    .line 676
    .line 677
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 678
    .line 679
    .line 680
    move-result v5

    .line 681
    and-int/lit16 v5, v5, 0xf8

    .line 682
    .line 683
    shr-int/2addr v5, v8

    .line 684
    if-le v5, v7, :cond_1e

    .line 685
    .line 686
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 687
    .line 688
    .line 689
    move-result v5

    .line 690
    add-int/lit8 v5, v5, 0x4

    .line 691
    .line 692
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 693
    .line 694
    .line 695
    move-result v5

    .line 696
    and-int/lit16 v5, v5, 0xc0

    .line 697
    .line 698
    shr-int/lit8 v5, v5, 0x6

    .line 699
    .line 700
    if-ne v5, v8, :cond_1d

    .line 701
    .line 702
    goto :goto_10

    .line 703
    :cond_1d
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 704
    .line 705
    .line 706
    move-result v5

    .line 707
    add-int/lit8 v5, v5, 0x4

    .line 708
    .line 709
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 710
    .line 711
    .line 712
    move-result v5

    .line 713
    and-int/lit8 v5, v5, 0x30

    .line 714
    .line 715
    shr-int/lit8 v8, v5, 0x4

    .line 716
    .line 717
    :goto_10
    sget-object v5, Ll3/a;->c:[I

    .line 718
    .line 719
    aget v5, v5, v8

    .line 720
    .line 721
    mul-int/lit16 v5, v5, 0x100

    .line 722
    .line 723
    goto :goto_11

    .line 724
    :cond_1e
    const/16 v5, 0x600

    .line 725
    .line 726
    :goto_11
    iput v5, v1, Ll3/D;->F:I

    .line 727
    .line 728
    if-nez v5, :cond_1f

    .line 729
    .line 730
    :goto_12
    return v25

    .line 731
    :cond_1f
    iget-object v5, v1, Ll3/D;->w:Ll3/B;

    .line 732
    .line 733
    if-eqz v5, :cond_22

    .line 734
    .line 735
    invoke-virtual {v1}, Ll3/D;->c()Z

    .line 736
    .line 737
    .line 738
    move-result v5

    .line 739
    if-nez v5, :cond_21

    .line 740
    .line 741
    :cond_20
    :goto_13
    const/4 v15, 0x0

    .line 742
    goto/16 :goto_16

    .line 743
    .line 744
    :cond_21
    invoke-virtual {v1, v2, v3}, Ll3/D;->a(J)V

    .line 745
    .line 746
    .line 747
    iput-object v9, v1, Ll3/D;->w:Ll3/B;

    .line 748
    .line 749
    :cond_22
    iget-wide v5, v1, Ll3/D;->I:J

    .line 750
    .line 751
    iget-object v7, v1, Ll3/D;->t:Ll3/A;

    .line 752
    .line 753
    invoke-virtual {v1}, Ll3/D;->h()J

    .line 754
    .line 755
    .line 756
    move-result-wide v11

    .line 757
    iget-object v8, v1, Ll3/D;->e:Ll3/N;

    .line 758
    .line 759
    iget-wide v13, v8, Ll3/N;->o:J

    .line 760
    .line 761
    sub-long/2addr v11, v13

    .line 762
    const-wide/32 v13, 0xf4240

    .line 763
    .line 764
    .line 765
    mul-long/2addr v11, v13

    .line 766
    iget-object v7, v7, Ll3/A;->a:Lj3/M;

    .line 767
    .line 768
    iget v7, v7, Lj3/M;->z:I

    .line 769
    .line 770
    int-to-long v7, v7

    .line 771
    div-long/2addr v11, v7

    .line 772
    add-long/2addr v11, v5

    .line 773
    iget-boolean v5, v1, Ll3/D;->G:Z

    .line 774
    .line 775
    if-nez v5, :cond_23

    .line 776
    .line 777
    sub-long v5, v11, v2

    .line 778
    .line 779
    invoke-static {v5, v6}, Ljava/lang/Math;->abs(J)J

    .line 780
    .line 781
    .line 782
    move-result-wide v5

    .line 783
    const-wide/32 v7, 0x30d40

    .line 784
    .line 785
    .line 786
    cmp-long v5, v5, v7

    .line 787
    .line 788
    if-lez v5, :cond_23

    .line 789
    .line 790
    iget-object v5, v1, Ll3/D;->r:Li/G;

    .line 791
    .line 792
    new-instance v6, LA4/p;

    .line 793
    .line 794
    new-instance v7, Ljava/lang/StringBuilder;

    .line 795
    .line 796
    const-string v8, "Unexpected audio track timestamp discontinuity: expected "

    .line 797
    .line 798
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 799
    .line 800
    .line 801
    invoke-virtual {v7, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 802
    .line 803
    .line 804
    const-string v8, ", got "

    .line 805
    .line 806
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 807
    .line 808
    .line 809
    invoke-virtual {v7, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 810
    .line 811
    .line 812
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 813
    .line 814
    .line 815
    move-result-object v7

    .line 816
    invoke-direct {v6, v7}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 817
    .line 818
    .line 819
    invoke-virtual {v5, v6}, Li/G;->q(Ljava/lang/Exception;)V

    .line 820
    .line 821
    .line 822
    move/from16 v5, v25

    .line 823
    .line 824
    iput-boolean v5, v1, Ll3/D;->G:Z

    .line 825
    .line 826
    :cond_23
    iget-boolean v5, v1, Ll3/D;->G:Z

    .line 827
    .line 828
    if-eqz v5, :cond_25

    .line 829
    .line 830
    invoke-virtual {v1}, Ll3/D;->c()Z

    .line 831
    .line 832
    .line 833
    move-result v5

    .line 834
    if-nez v5, :cond_24

    .line 835
    .line 836
    goto :goto_13

    .line 837
    :cond_24
    sub-long v5, v2, v11

    .line 838
    .line 839
    iget-wide v7, v1, Ll3/D;->I:J

    .line 840
    .line 841
    add-long/2addr v7, v5

    .line 842
    iput-wide v7, v1, Ll3/D;->I:J

    .line 843
    .line 844
    const/4 v15, 0x0

    .line 845
    iput-boolean v15, v1, Ll3/D;->G:Z

    .line 846
    .line 847
    invoke-virtual {v1, v2, v3}, Ll3/D;->a(J)V

    .line 848
    .line 849
    .line 850
    iget-object v7, v1, Ll3/D;->r:Li/G;

    .line 851
    .line 852
    if-eqz v7, :cond_25

    .line 853
    .line 854
    cmp-long v5, v5, v16

    .line 855
    .line 856
    if-eqz v5, :cond_25

    .line 857
    .line 858
    iget-object v5, v7, Li/G;->b:Ljava/lang/Object;

    .line 859
    .line 860
    check-cast v5, Ll3/H;

    .line 861
    .line 862
    const/4 v6, 0x1

    .line 863
    iput-boolean v6, v5, Ll3/H;->k1:Z

    .line 864
    .line 865
    :cond_25
    iget-object v5, v1, Ll3/D;->t:Ll3/A;

    .line 866
    .line 867
    iget v5, v5, Ll3/A;->c:I

    .line 868
    .line 869
    if-nez v5, :cond_26

    .line 870
    .line 871
    iget-wide v5, v1, Ll3/D;->B:J

    .line 872
    .line 873
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 874
    .line 875
    .line 876
    move-result v7

    .line 877
    int-to-long v7, v7

    .line 878
    add-long/2addr v5, v7

    .line 879
    iput-wide v5, v1, Ll3/D;->B:J

    .line 880
    .line 881
    goto :goto_14

    .line 882
    :cond_26
    iget-wide v5, v1, Ll3/D;->C:J

    .line 883
    .line 884
    iget v7, v1, Ll3/D;->F:I

    .line 885
    .line 886
    int-to-long v7, v7

    .line 887
    int-to-long v11, v4

    .line 888
    mul-long/2addr v7, v11

    .line 889
    add-long/2addr v7, v5

    .line 890
    iput-wide v7, v1, Ll3/D;->C:J

    .line 891
    .line 892
    :goto_14
    iput-object v0, v1, Ll3/D;->M:Ljava/nio/ByteBuffer;

    .line 893
    .line 894
    iput v4, v1, Ll3/D;->N:I

    .line 895
    .line 896
    :cond_27
    invoke-virtual {v1, v2, v3}, Ll3/D;->p(J)V

    .line 897
    .line 898
    .line 899
    iget-object v0, v1, Ll3/D;->M:Ljava/nio/ByteBuffer;

    .line 900
    .line 901
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 902
    .line 903
    .line 904
    move-result v0

    .line 905
    if-nez v0, :cond_28

    .line 906
    .line 907
    iput-object v9, v1, Ll3/D;->M:Ljava/nio/ByteBuffer;

    .line 908
    .line 909
    const/4 v15, 0x0

    .line 910
    iput v15, v1, Ll3/D;->N:I

    .line 911
    .line 912
    :goto_15
    const/16 v25, 0x1

    .line 913
    .line 914
    return v25

    .line 915
    :cond_28
    invoke-virtual {v1}, Ll3/D;->i()J

    .line 916
    .line 917
    .line 918
    move-result-wide v2

    .line 919
    iget-wide v4, v10, Ll3/t;->y:J

    .line 920
    .line 921
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    cmp-long v0, v4, v6

    .line 927
    .line 928
    if-eqz v0, :cond_20

    .line 929
    .line 930
    cmp-long v0, v2, v16

    .line 931
    .line 932
    if-lez v0, :cond_20

    .line 933
    .line 934
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 935
    .line 936
    .line 937
    move-result-wide v2

    .line 938
    iget-wide v4, v10, Ll3/t;->y:J

    .line 939
    .line 940
    sub-long/2addr v2, v4

    .line 941
    const-wide/16 v4, 0xc8

    .line 942
    .line 943
    cmp-long v0, v2, v4

    .line 944
    .line 945
    if-ltz v0, :cond_20

    .line 946
    .line 947
    const-string v0, "DefaultAudioSink"

    .line 948
    .line 949
    const-string v2, "Resetting stalled audio track"

    .line 950
    .line 951
    invoke-static {v0, v2}, Ll4/a;->P(Ljava/lang/String;Ljava/lang/String;)V

    .line 952
    .line 953
    .line 954
    invoke-virtual {v1}, Ll3/D;->d()V

    .line 955
    .line 956
    .line 957
    goto :goto_15

    .line 958
    :goto_16
    return v15

    .line 959
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_8
        :pswitch_8
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_2
        :pswitch_5
        :pswitch_5
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_8
    .end packed-switch
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
.end method

.method public final k()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Ll3/D;->m()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Ll3/D;->i:Ll3/t;

    .line 8
    .line 9
    invoke-virtual {p0}, Ll3/D;->i()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    invoke-virtual {v0, v1, v2}, Ll3/t;->b(J)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    return v0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    return v0
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

.method public final l()Z
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v2, v1, Ll3/D;->h:LH1/k;

    .line 4
    .line 5
    monitor-enter v2

    .line 6
    :try_start_0
    iget-boolean v0, v2, LH1/k;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    monitor-exit v2

    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return v2

    .line 13
    :cond_0
    const/4 v3, 0x1

    .line 14
    :try_start_1
    iget-object v0, v1, Ll3/D;->t:Ll3/A;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catch Ll3/o; {:try_start_1 .. :try_end_1} :catch_1

    .line 17
    .line 18
    .line 19
    :try_start_2
    iget-boolean v4, v1, Ll3/D;->Z:Z

    .line 20
    .line 21
    iget-object v5, v1, Ll3/D;->v:Ll3/e;

    .line 22
    .line 23
    iget v6, v1, Ll3/D;->W:I

    .line 24
    .line 25
    invoke-virtual {v0, v4, v5, v6}, Ll3/A;->a(ZLl3/e;I)Landroid/media/AudioTrack;

    .line 26
    .line 27
    .line 28
    move-result-object v0
    :try_end_2
    .catch Ll3/o; {:try_start_2 .. :try_end_2} :catch_0

    .line 29
    goto :goto_2

    .line 30
    :catch_0
    move-exception v0

    .line 31
    :try_start_3
    iget-object v4, v1, Ll3/D;->r:Li/G;

    .line 32
    .line 33
    if-eqz v4, :cond_1

    .line 34
    .line 35
    invoke-virtual {v4, v0}, Li/G;->q(Ljava/lang/Exception;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    throw v0
    :try_end_3
    .catch Ll3/o; {:try_start_3 .. :try_end_3} :catch_1

    .line 39
    :goto_0
    move-object v4, v0

    .line 40
    goto :goto_1

    .line 41
    :catch_1
    move-exception v0

    .line 42
    goto :goto_0

    .line 43
    :goto_1
    iget-object v0, v1, Ll3/D;->t:Ll3/A;

    .line 44
    .line 45
    iget v5, v0, Ll3/A;->h:I

    .line 46
    .line 47
    const v6, 0xf4240

    .line 48
    .line 49
    .line 50
    if-le v5, v6, :cond_d

    .line 51
    .line 52
    new-instance v7, Ll3/A;

    .line 53
    .line 54
    iget-object v5, v0, Ll3/A;->i:[Ll3/j;

    .line 55
    .line 56
    iget-object v8, v0, Ll3/A;->a:Lj3/M;

    .line 57
    .line 58
    iget v9, v0, Ll3/A;->b:I

    .line 59
    .line 60
    iget v10, v0, Ll3/A;->c:I

    .line 61
    .line 62
    iget v11, v0, Ll3/A;->d:I

    .line 63
    .line 64
    iget v12, v0, Ll3/A;->e:I

    .line 65
    .line 66
    iget v13, v0, Ll3/A;->f:I

    .line 67
    .line 68
    iget v14, v0, Ll3/A;->g:I

    .line 69
    .line 70
    const v15, 0xf4240

    .line 71
    .line 72
    .line 73
    move-object/from16 v16, v5

    .line 74
    .line 75
    invoke-direct/range {v7 .. v16}, Ll3/A;-><init>(Lj3/M;IIIIIII[Ll3/j;)V

    .line 76
    .line 77
    .line 78
    :try_start_4
    iget-boolean v0, v1, Ll3/D;->Z:Z

    .line 79
    .line 80
    iget-object v5, v1, Ll3/D;->v:Ll3/e;

    .line 81
    .line 82
    iget v6, v1, Ll3/D;->W:I

    .line 83
    .line 84
    invoke-virtual {v7, v0, v5, v6}, Ll3/A;->a(ZLl3/e;I)Landroid/media/AudioTrack;

    .line 85
    .line 86
    .line 87
    move-result-object v0
    :try_end_4
    .catch Ll3/o; {:try_start_4 .. :try_end_4} :catch_3

    .line 88
    :try_start_5
    iput-object v7, v1, Ll3/D;->t:Ll3/A;
    :try_end_5
    .catch Ll3/o; {:try_start_5 .. :try_end_5} :catch_2

    .line 89
    .line 90
    :goto_2
    iput-object v0, v1, Ll3/D;->u:Landroid/media/AudioTrack;

    .line 91
    .line 92
    invoke-static {v0}, Ll3/D;->n(Landroid/media/AudioTrack;)Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-eqz v0, :cond_3

    .line 97
    .line 98
    iget-object v0, v1, Ll3/D;->u:Landroid/media/AudioTrack;

    .line 99
    .line 100
    iget-object v4, v1, Ll3/D;->m:Lb5/G1;

    .line 101
    .line 102
    if-nez v4, :cond_2

    .line 103
    .line 104
    new-instance v4, Lb5/G1;

    .line 105
    .line 106
    invoke-direct {v4, v1}, Lb5/G1;-><init>(Ll3/D;)V

    .line 107
    .line 108
    .line 109
    iput-object v4, v1, Ll3/D;->m:Lb5/G1;

    .line 110
    .line 111
    :cond_2
    iget-object v4, v1, Ll3/D;->m:Lb5/G1;

    .line 112
    .line 113
    iget-object v5, v4, Lb5/G1;->b:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v5, Landroid/os/Handler;

    .line 116
    .line 117
    invoke-static {v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    new-instance v6, Lt0/g;

    .line 121
    .line 122
    invoke-direct {v6, v5}, Lt0/g;-><init>(Landroid/os/Handler;)V

    .line 123
    .line 124
    .line 125
    iget-object v4, v4, Lb5/G1;->c:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v4, Ll3/C;

    .line 128
    .line 129
    invoke-static {v0, v6, v4}, LQ2/f;->n(Landroid/media/AudioTrack;Lt0/g;Ll3/C;)V

    .line 130
    .line 131
    .line 132
    iget v0, v1, Ll3/D;->l:I

    .line 133
    .line 134
    const/4 v4, 0x3

    .line 135
    if-eq v0, v4, :cond_3

    .line 136
    .line 137
    iget-object v0, v1, Ll3/D;->u:Landroid/media/AudioTrack;

    .line 138
    .line 139
    iget-object v4, v1, Ll3/D;->t:Ll3/A;

    .line 140
    .line 141
    iget-object v4, v4, Ll3/A;->a:Lj3/M;

    .line 142
    .line 143
    iget v5, v4, Lj3/M;->B:I

    .line 144
    .line 145
    iget v4, v4, Lj3/M;->C:I

    .line 146
    .line 147
    invoke-static {v0, v5, v4}, LQ2/f;->l(Landroid/media/AudioTrack;II)V

    .line 148
    .line 149
    .line 150
    :cond_3
    sget v0, Ll4/y;->a:I

    .line 151
    .line 152
    const/16 v4, 0x1f

    .line 153
    .line 154
    if-lt v0, v4, :cond_4

    .line 155
    .line 156
    iget-object v4, v1, Ll3/D;->q:Lk3/l;

    .line 157
    .line 158
    if-eqz v4, :cond_4

    .line 159
    .line 160
    iget-object v5, v1, Ll3/D;->u:Landroid/media/AudioTrack;

    .line 161
    .line 162
    invoke-static {v5, v4}, Ll3/y;->a(Landroid/media/AudioTrack;Lk3/l;)V

    .line 163
    .line 164
    .line 165
    :cond_4
    iget-object v4, v1, Ll3/D;->u:Landroid/media/AudioTrack;

    .line 166
    .line 167
    invoke-virtual {v4}, Landroid/media/AudioTrack;->getAudioSessionId()I

    .line 168
    .line 169
    .line 170
    move-result v4

    .line 171
    iput v4, v1, Ll3/D;->W:I

    .line 172
    .line 173
    iget-object v4, v1, Ll3/D;->u:Landroid/media/AudioTrack;

    .line 174
    .line 175
    iget-object v5, v1, Ll3/D;->t:Ll3/A;

    .line 176
    .line 177
    iget v6, v5, Ll3/A;->c:I

    .line 178
    .line 179
    const/4 v7, 0x2

    .line 180
    if-ne v6, v7, :cond_5

    .line 181
    .line 182
    move v6, v3

    .line 183
    goto :goto_3

    .line 184
    :cond_5
    move v6, v2

    .line 185
    :goto_3
    iget v7, v5, Ll3/A;->g:I

    .line 186
    .line 187
    iget v8, v5, Ll3/A;->d:I

    .line 188
    .line 189
    iget v5, v5, Ll3/A;->h:I

    .line 190
    .line 191
    iget-object v9, v1, Ll3/D;->i:Ll3/t;

    .line 192
    .line 193
    iput-object v4, v9, Ll3/t;->c:Landroid/media/AudioTrack;

    .line 194
    .line 195
    iput v8, v9, Ll3/t;->d:I

    .line 196
    .line 197
    iput v5, v9, Ll3/t;->e:I

    .line 198
    .line 199
    new-instance v10, Ll3/s;

    .line 200
    .line 201
    invoke-direct {v10, v4}, Ll3/s;-><init>(Landroid/media/AudioTrack;)V

    .line 202
    .line 203
    .line 204
    iput-object v10, v9, Ll3/t;->f:Ll3/s;

    .line 205
    .line 206
    invoke-virtual {v4}, Landroid/media/AudioTrack;->getSampleRate()I

    .line 207
    .line 208
    .line 209
    move-result v4

    .line 210
    iput v4, v9, Ll3/t;->g:I

    .line 211
    .line 212
    const/16 v4, 0x17

    .line 213
    .line 214
    if-eqz v6, :cond_7

    .line 215
    .line 216
    if-ge v0, v4, :cond_7

    .line 217
    .line 218
    const/4 v6, 0x5

    .line 219
    if-eq v7, v6, :cond_6

    .line 220
    .line 221
    const/4 v6, 0x6

    .line 222
    if-ne v7, v6, :cond_7

    .line 223
    .line 224
    :cond_6
    move v6, v3

    .line 225
    goto :goto_4

    .line 226
    :cond_7
    move v6, v2

    .line 227
    :goto_4
    iput-boolean v6, v9, Ll3/t;->h:Z

    .line 228
    .line 229
    invoke-static {v7}, Ll4/y;->F(I)Z

    .line 230
    .line 231
    .line 232
    move-result v6

    .line 233
    iput-boolean v6, v9, Ll3/t;->q:Z

    .line 234
    .line 235
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    if-eqz v6, :cond_8

    .line 241
    .line 242
    div-int/2addr v5, v8

    .line 243
    int-to-long v5, v5

    .line 244
    const-wide/32 v7, 0xf4240

    .line 245
    .line 246
    .line 247
    mul-long/2addr v5, v7

    .line 248
    iget v7, v9, Ll3/t;->g:I

    .line 249
    .line 250
    int-to-long v7, v7

    .line 251
    div-long/2addr v5, v7

    .line 252
    goto :goto_5

    .line 253
    :cond_8
    move-wide v5, v10

    .line 254
    :goto_5
    iput-wide v5, v9, Ll3/t;->i:J

    .line 255
    .line 256
    const-wide/16 v5, 0x0

    .line 257
    .line 258
    iput-wide v5, v9, Ll3/t;->s:J

    .line 259
    .line 260
    iput-wide v5, v9, Ll3/t;->t:J

    .line 261
    .line 262
    iput-wide v5, v9, Ll3/t;->u:J

    .line 263
    .line 264
    iput-boolean v2, v9, Ll3/t;->p:Z

    .line 265
    .line 266
    iput-wide v10, v9, Ll3/t;->x:J

    .line 267
    .line 268
    iput-wide v10, v9, Ll3/t;->y:J

    .line 269
    .line 270
    iput-wide v5, v9, Ll3/t;->r:J

    .line 271
    .line 272
    iput-wide v5, v9, Ll3/t;->o:J

    .line 273
    .line 274
    const/high16 v2, 0x3f800000    # 1.0f

    .line 275
    .line 276
    iput v2, v9, Ll3/t;->j:F

    .line 277
    .line 278
    invoke-virtual {v1}, Ll3/D;->m()Z

    .line 279
    .line 280
    .line 281
    move-result v2

    .line 282
    if-nez v2, :cond_9

    .line 283
    .line 284
    goto :goto_6

    .line 285
    :cond_9
    const/16 v2, 0x15

    .line 286
    .line 287
    if-lt v0, v2, :cond_a

    .line 288
    .line 289
    iget-object v2, v1, Ll3/D;->u:Landroid/media/AudioTrack;

    .line 290
    .line 291
    iget v5, v1, Ll3/D;->J:F

    .line 292
    .line 293
    invoke-virtual {v2, v5}, Landroid/media/AudioTrack;->setVolume(F)I

    .line 294
    .line 295
    .line 296
    goto :goto_6

    .line 297
    :cond_a
    iget-object v2, v1, Ll3/D;->u:Landroid/media/AudioTrack;

    .line 298
    .line 299
    iget v5, v1, Ll3/D;->J:F

    .line 300
    .line 301
    invoke-virtual {v2, v5, v5}, Landroid/media/AudioTrack;->setStereoVolume(FF)I

    .line 302
    .line 303
    .line 304
    :goto_6
    iget-object v2, v1, Ll3/D;->X:Ll3/u;

    .line 305
    .line 306
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 307
    .line 308
    .line 309
    iget-object v2, v1, Ll3/D;->Y:Ll3/z;

    .line 310
    .line 311
    if-eqz v2, :cond_b

    .line 312
    .line 313
    if-lt v0, v4, :cond_b

    .line 314
    .line 315
    iget-object v0, v1, Ll3/D;->u:Landroid/media/AudioTrack;

    .line 316
    .line 317
    invoke-static {v0, v2}, Ll3/x;->a(Landroid/media/AudioTrack;Ll3/z;)V

    .line 318
    .line 319
    .line 320
    :cond_b
    iput-boolean v3, v1, Ll3/D;->H:Z

    .line 321
    .line 322
    return v3

    .line 323
    :catch_2
    move-exception v0

    .line 324
    goto :goto_7

    .line 325
    :catch_3
    move-exception v0

    .line 326
    :try_start_6
    iget-object v2, v1, Ll3/D;->r:Li/G;

    .line 327
    .line 328
    if-eqz v2, :cond_c

    .line 329
    .line 330
    invoke-virtual {v2, v0}, Li/G;->q(Ljava/lang/Exception;)V

    .line 331
    .line 332
    .line 333
    :cond_c
    throw v0
    :try_end_6
    .catch Ll3/o; {:try_start_6 .. :try_end_6} :catch_2

    .line 334
    :goto_7
    invoke-virtual {v4, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 335
    .line 336
    .line 337
    :cond_d
    iget-object v0, v1, Ll3/D;->t:Ll3/A;

    .line 338
    .line 339
    iget v0, v0, Ll3/A;->c:I

    .line 340
    .line 341
    if-ne v0, v3, :cond_e

    .line 342
    .line 343
    iput-boolean v3, v1, Ll3/D;->b0:Z

    .line 344
    .line 345
    :cond_e
    throw v4

    .line 346
    :catchall_0
    move-exception v0

    .line 347
    :try_start_7
    monitor-exit v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 348
    throw v0
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

.method public final m()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ll3/D;->u:Landroid/media/AudioTrack;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
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

.method public final o()V
    .locals 7

    .line 1
    iget-boolean v0, p0, Ll3/D;->T:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Ll3/D;->T:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Ll3/D;->i()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    iget-object v2, p0, Ll3/D;->i:Ll3/t;

    .line 13
    .line 14
    invoke-virtual {v2}, Ll3/t;->a()J

    .line 15
    .line 16
    .line 17
    move-result-wide v3

    .line 18
    iput-wide v3, v2, Ll3/t;->z:J

    .line 19
    .line 20
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 21
    .line 22
    .line 23
    move-result-wide v3

    .line 24
    const-wide/16 v5, 0x3e8

    .line 25
    .line 26
    mul-long/2addr v3, v5

    .line 27
    iput-wide v3, v2, Ll3/t;->x:J

    .line 28
    .line 29
    iput-wide v0, v2, Ll3/t;->A:J

    .line 30
    .line 31
    iget-object v0, p0, Ll3/D;->u:Landroid/media/AudioTrack;

    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/media/AudioTrack;->stop()V

    .line 34
    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    iput v0, p0, Ll3/D;->A:I

    .line 38
    .line 39
    :cond_0
    return-void
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

.method public final p(J)V
    .locals 5

    .line 1
    iget-object v0, p0, Ll3/D;->K:[Ll3/j;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    move v1, v0

    .line 5
    :goto_0
    if-ltz v1, :cond_6

    .line 6
    .line 7
    if-lez v1, :cond_0

    .line 8
    .line 9
    iget-object v2, p0, Ll3/D;->L:[Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    add-int/lit8 v3, v1, -0x1

    .line 12
    .line 13
    aget-object v2, v2, v3

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    iget-object v2, p0, Ll3/D;->M:Ljava/nio/ByteBuffer;

    .line 17
    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    sget-object v2, Ll3/j;->a:Ljava/nio/ByteBuffer;

    .line 22
    .line 23
    :goto_1
    if-ne v1, v0, :cond_2

    .line 24
    .line 25
    invoke-virtual {p0, v2, p1, p2}, Ll3/D;->v(Ljava/nio/ByteBuffer;J)V

    .line 26
    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_2
    iget-object v3, p0, Ll3/D;->K:[Ll3/j;

    .line 30
    .line 31
    aget-object v3, v3, v1

    .line 32
    .line 33
    iget v4, p0, Ll3/D;->R:I

    .line 34
    .line 35
    if-le v1, v4, :cond_3

    .line 36
    .line 37
    invoke-interface {v3, v2}, Ll3/j;->e(Ljava/nio/ByteBuffer;)V

    .line 38
    .line 39
    .line 40
    :cond_3
    invoke-interface {v3}, Ll3/j;->b()Ljava/nio/ByteBuffer;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    iget-object v4, p0, Ll3/D;->L:[Ljava/nio/ByteBuffer;

    .line 45
    .line 46
    aput-object v3, v4, v1

    .line 47
    .line 48
    invoke-virtual {v3}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_4

    .line 53
    .line 54
    add-int/lit8 v1, v1, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_4
    :goto_2
    invoke-virtual {v2}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-eqz v2, :cond_5

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_5
    add-int/lit8 v1, v1, -0x1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_6
    :goto_3
    return-void
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

.method public final q()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ll3/D;->d()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ll3/D;->f:[Ll3/j;

    .line 5
    .line 6
    array-length v1, v0

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    :goto_0
    if-ge v3, v1, :cond_0

    .line 10
    .line 11
    aget-object v4, v0, v3

    .line 12
    .line 13
    invoke-interface {v4}, Ll3/j;->reset()V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v3, v3, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v0, p0, Ll3/D;->g:[Ll3/j;

    .line 20
    .line 21
    array-length v1, v0

    .line 22
    move v3, v2

    .line 23
    :goto_1
    if-ge v3, v1, :cond_1

    .line 24
    .line 25
    aget-object v4, v0, v3

    .line 26
    .line 27
    invoke-interface {v4}, Ll3/j;->reset()V

    .line 28
    .line 29
    .line 30
    add-int/lit8 v3, v3, 0x1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    iput-boolean v2, p0, Ll3/D;->U:Z

    .line 34
    .line 35
    iput-boolean v2, p0, Ll3/D;->b0:Z

    .line 36
    .line 37
    return-void
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

.method public final r(Lj3/m0;Z)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Ll3/D;->g()Ll3/B;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, Ll3/B;->a:Lj3/m0;

    .line 6
    .line 7
    invoke-virtual {p1, v1}, Lj3/m0;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    iget-boolean v0, v0, Ll3/B;->b:Z

    .line 14
    .line 15
    if-eq p2, v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    return-void

    .line 19
    :cond_1
    :goto_0
    new-instance v1, Ll3/B;

    .line 20
    .line 21
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    move-object v2, p1

    .line 32
    move v3, p2

    .line 33
    invoke-direct/range {v1 .. v7}, Ll3/B;-><init>(Lj3/m0;ZJJ)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Ll3/D;->m()Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_2

    .line 41
    .line 42
    iput-object v1, p0, Ll3/D;->w:Ll3/B;

    .line 43
    .line 44
    return-void

    .line 45
    :cond_2
    iput-object v1, p0, Ll3/D;->x:Ll3/B;

    .line 46
    .line 47
    return-void
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
.end method

.method public final s(Lj3/m0;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ll3/D;->m()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Landroid/media/PlaybackParams;

    .line 8
    .line 9
    invoke-direct {v0}, Landroid/media/PlaybackParams;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/media/PlaybackParams;->allowDefaults()Landroid/media/PlaybackParams;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget v1, p1, Lj3/m0;->a:F

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/media/PlaybackParams;->setSpeed(F)Landroid/media/PlaybackParams;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget p1, p1, Lj3/m0;->b:F

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Landroid/media/PlaybackParams;->setPitch(F)Landroid/media/PlaybackParams;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const/4 v0, 0x2

    .line 29
    invoke-virtual {p1, v0}, Landroid/media/PlaybackParams;->setAudioFallbackMode(I)Landroid/media/PlaybackParams;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    :try_start_0
    iget-object v0, p0, Ll3/D;->u:Landroid/media/AudioTrack;

    .line 34
    .line 35
    invoke-virtual {v0, p1}, Landroid/media/AudioTrack;->setPlaybackParams(Landroid/media/PlaybackParams;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catch_0
    move-exception p1

    .line 40
    const-string v0, "DefaultAudioSink"

    .line 41
    .line 42
    const-string v1, "Failed to set playback params"

    .line 43
    .line 44
    invoke-static {v0, v1, p1}, Ll4/a;->Q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 45
    .line 46
    .line 47
    :goto_0
    new-instance p1, Lj3/m0;

    .line 48
    .line 49
    iget-object v0, p0, Ll3/D;->u:Landroid/media/AudioTrack;

    .line 50
    .line 51
    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlaybackParams()Landroid/media/PlaybackParams;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, Landroid/media/PlaybackParams;->getSpeed()F

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    iget-object v1, p0, Ll3/D;->u:Landroid/media/AudioTrack;

    .line 60
    .line 61
    invoke-virtual {v1}, Landroid/media/AudioTrack;->getPlaybackParams()Landroid/media/PlaybackParams;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {v1}, Landroid/media/PlaybackParams;->getPitch()F

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    invoke-direct {p1, v0, v1}, Lj3/m0;-><init>(FF)V

    .line 70
    .line 71
    .line 72
    iget v0, p1, Lj3/m0;->a:F

    .line 73
    .line 74
    iget-object v1, p0, Ll3/D;->i:Ll3/t;

    .line 75
    .line 76
    iput v0, v1, Ll3/t;->j:F

    .line 77
    .line 78
    iget-object v0, v1, Ll3/t;->f:Ll3/s;

    .line 79
    .line 80
    if-eqz v0, :cond_0

    .line 81
    .line 82
    invoke-virtual {v0}, Ll3/s;->a()V

    .line 83
    .line 84
    .line 85
    :cond_0
    iput-object p1, p0, Ll3/D;->y:Lj3/m0;

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
.end method

.method public final t()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Ll3/D;->Z:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Ll3/D;->t:Ll3/A;

    .line 6
    .line 7
    iget-object v0, v0, Ll3/A;->a:Lj3/M;

    .line 8
    .line 9
    iget-object v0, v0, Lj3/M;->l:Ljava/lang/String;

    .line 10
    .line 11
    const-string v1, "audio/raw"

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Ll3/D;->t:Ll3/A;

    .line 20
    .line 21
    iget-object v0, v0, Ll3/A;->a:Lj3/M;

    .line 22
    .line 23
    iget v0, v0, Lj3/M;->A:I

    .line 24
    .line 25
    iget-boolean v1, p0, Ll3/D;->c:Z

    .line 26
    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    sget v1, Ll4/y;->a:I

    .line 30
    .line 31
    const/high16 v1, 0x20000000

    .line 32
    .line 33
    if-eq v0, v1, :cond_1

    .line 34
    .line 35
    const/high16 v1, 0x30000000

    .line 36
    .line 37
    if-eq v0, v1, :cond_1

    .line 38
    .line 39
    const/4 v1, 0x4

    .line 40
    if-ne v0, v1, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const/4 v0, 0x1

    .line 44
    return v0

    .line 45
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 46
    return v0
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

.method public final u(Lj3/M;Ll3/e;)Z
    .locals 7

    .line 1
    sget v0, Ll4/y;->a:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-lt v0, v1, :cond_c

    .line 7
    .line 8
    iget v1, p0, Ll3/D;->l:I

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    goto/16 :goto_5

    .line 13
    .line 14
    :cond_0
    iget-object v3, p1, Lj3/M;->l:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-object v4, p1, Lj3/M;->i:Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {v3, v4}, Ll4/n;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-nez v3, :cond_1

    .line 26
    .line 27
    goto/16 :goto_5

    .line 28
    .line 29
    :cond_1
    iget v4, p1, Lj3/M;->y:I

    .line 30
    .line 31
    invoke-static {v4}, Ll4/y;->n(I)I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-nez v4, :cond_2

    .line 36
    .line 37
    goto/16 :goto_5

    .line 38
    .line 39
    :cond_2
    iget v5, p1, Lj3/M;->z:I

    .line 40
    .line 41
    invoke-static {v5, v4, v3}, Ll3/D;->e(III)Landroid/media/AudioFormat;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {p2}, Ll3/e;->a()Lf5/o;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    iget-object p2, p2, Lf5/o;->b:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p2, Landroid/media/AudioAttributes;

    .line 52
    .line 53
    const/16 v4, 0x1f

    .line 54
    .line 55
    const/4 v5, 0x2

    .line 56
    const/4 v6, 0x1

    .line 57
    if-lt v0, v4, :cond_3

    .line 58
    .line 59
    invoke-static {v3, p2}, Lk3/i;->a(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;)I

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    goto :goto_0

    .line 64
    :cond_3
    invoke-static {v3, p2}, LQ2/f;->A(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;)Z

    .line 65
    .line 66
    .line 67
    move-result p2

    .line 68
    if-nez p2, :cond_4

    .line 69
    .line 70
    move p2, v2

    .line 71
    goto :goto_0

    .line 72
    :cond_4
    const/16 p2, 0x1e

    .line 73
    .line 74
    if-ne v0, p2, :cond_5

    .line 75
    .line 76
    sget-object p2, Ll4/y;->d:Ljava/lang/String;

    .line 77
    .line 78
    const-string v0, "Pixel"

    .line 79
    .line 80
    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 81
    .line 82
    .line 83
    move-result p2

    .line 84
    if-eqz p2, :cond_5

    .line 85
    .line 86
    move p2, v5

    .line 87
    goto :goto_0

    .line 88
    :cond_5
    move p2, v6

    .line 89
    :goto_0
    if-eqz p2, :cond_c

    .line 90
    .line 91
    if-eq p2, v6, :cond_7

    .line 92
    .line 93
    if-ne p2, v5, :cond_6

    .line 94
    .line 95
    goto :goto_4

    .line 96
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 97
    .line 98
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 99
    .line 100
    .line 101
    throw p1

    .line 102
    :cond_7
    iget p2, p1, Lj3/M;->B:I

    .line 103
    .line 104
    if-nez p2, :cond_9

    .line 105
    .line 106
    iget p1, p1, Lj3/M;->C:I

    .line 107
    .line 108
    if-eqz p1, :cond_8

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_8
    move p1, v2

    .line 112
    goto :goto_2

    .line 113
    :cond_9
    :goto_1
    move p1, v6

    .line 114
    :goto_2
    if-ne v1, v6, :cond_a

    .line 115
    .line 116
    move p2, v6

    .line 117
    goto :goto_3

    .line 118
    :cond_a
    move p2, v2

    .line 119
    :goto_3
    if-eqz p1, :cond_b

    .line 120
    .line 121
    if-nez p2, :cond_c

    .line 122
    .line 123
    :cond_b
    :goto_4
    return v6

    .line 124
    :cond_c
    :goto_5
    return v2
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

.method public final v(Ljava/nio/ByteBuffer;J)V
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_8

    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Ll3/D;->O:Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    const/16 v1, 0x15

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    const/4 v3, 0x0

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    if-ne v0, p1, :cond_1

    .line 18
    .line 19
    move v0, v2

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    move v0, v3

    .line 22
    :goto_0
    invoke-static {v0}, Ll4/a;->h(Z)V

    .line 23
    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_2
    iput-object p1, p0, Ll3/D;->O:Ljava/nio/ByteBuffer;

    .line 27
    .line 28
    sget v0, Ll4/y;->a:I

    .line 29
    .line 30
    if-ge v0, v1, :cond_5

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-object v4, p0, Ll3/D;->P:[B

    .line 37
    .line 38
    if-eqz v4, :cond_3

    .line 39
    .line 40
    array-length v4, v4

    .line 41
    if-ge v4, v0, :cond_4

    .line 42
    .line 43
    :cond_3
    new-array v4, v0, [B

    .line 44
    .line 45
    iput-object v4, p0, Ll3/D;->P:[B

    .line 46
    .line 47
    :cond_4
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    iget-object v5, p0, Ll3/D;->P:[B

    .line 52
    .line 53
    invoke-virtual {p1, v5, v3, v0}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 57
    .line 58
    .line 59
    iput v3, p0, Ll3/D;->Q:I

    .line 60
    .line 61
    :cond_5
    :goto_1
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 62
    .line 63
    .line 64
    move-result v8

    .line 65
    sget v0, Ll4/y;->a:I

    .line 66
    .line 67
    if-ge v0, v1, :cond_8

    .line 68
    .line 69
    iget-wide p2, p0, Ll3/D;->D:J

    .line 70
    .line 71
    iget-object v1, p0, Ll3/D;->i:Ll3/t;

    .line 72
    .line 73
    invoke-virtual {v1}, Ll3/t;->a()J

    .line 74
    .line 75
    .line 76
    move-result-wide v4

    .line 77
    iget v6, v1, Ll3/t;->d:I

    .line 78
    .line 79
    int-to-long v6, v6

    .line 80
    mul-long/2addr v4, v6

    .line 81
    sub-long/2addr p2, v4

    .line 82
    long-to-int p2, p2

    .line 83
    iget p3, v1, Ll3/t;->e:I

    .line 84
    .line 85
    sub-int/2addr p3, p2

    .line 86
    if-lez p3, :cond_6

    .line 87
    .line 88
    invoke-static {v8, p3}, Ljava/lang/Math;->min(II)I

    .line 89
    .line 90
    .line 91
    move-result p2

    .line 92
    iget-object p3, p0, Ll3/D;->u:Landroid/media/AudioTrack;

    .line 93
    .line 94
    iget-object v1, p0, Ll3/D;->P:[B

    .line 95
    .line 96
    iget v4, p0, Ll3/D;->Q:I

    .line 97
    .line 98
    invoke-virtual {p3, v1, v4, p2}, Landroid/media/AudioTrack;->write([BII)I

    .line 99
    .line 100
    .line 101
    move-result p2

    .line 102
    if-lez p2, :cond_7

    .line 103
    .line 104
    iget p3, p0, Ll3/D;->Q:I

    .line 105
    .line 106
    add-int/2addr p3, p2

    .line 107
    iput p3, p0, Ll3/D;->Q:I

    .line 108
    .line 109
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 110
    .line 111
    .line 112
    move-result p3

    .line 113
    add-int/2addr p3, p2

    .line 114
    invoke-virtual {p1, p3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 115
    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_6
    move p2, v3

    .line 119
    :cond_7
    :goto_2
    move-object v7, p1

    .line 120
    goto/16 :goto_5

    .line 121
    .line 122
    :cond_8
    iget-boolean v1, p0, Ll3/D;->Z:Z

    .line 123
    .line 124
    if-eqz v1, :cond_10

    .line 125
    .line 126
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    cmp-long v1, p2, v4

    .line 132
    .line 133
    if-eqz v1, :cond_9

    .line 134
    .line 135
    move v1, v2

    .line 136
    goto :goto_3

    .line 137
    :cond_9
    move v1, v3

    .line 138
    :goto_3
    invoke-static {v1}, Ll4/a;->m(Z)V

    .line 139
    .line 140
    .line 141
    iget-object v6, p0, Ll3/D;->u:Landroid/media/AudioTrack;

    .line 142
    .line 143
    const/16 v1, 0x1a

    .line 144
    .line 145
    const-wide/16 v4, 0x3e8

    .line 146
    .line 147
    if-lt v0, v1, :cond_a

    .line 148
    .line 149
    const/4 v9, 0x1

    .line 150
    mul-long v10, p2, v4

    .line 151
    .line 152
    move-object v7, p1

    .line 153
    invoke-virtual/range {v6 .. v11}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;IIJ)I

    .line 154
    .line 155
    .line 156
    move-result p1

    .line 157
    :goto_4
    move p2, p1

    .line 158
    goto :goto_5

    .line 159
    :cond_a
    move-object v7, p1

    .line 160
    iget-object p1, p0, Ll3/D;->z:Ljava/nio/ByteBuffer;

    .line 161
    .line 162
    if-nez p1, :cond_b

    .line 163
    .line 164
    const/16 p1, 0x10

    .line 165
    .line 166
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    iput-object p1, p0, Ll3/D;->z:Ljava/nio/ByteBuffer;

    .line 171
    .line 172
    sget-object v1, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 173
    .line 174
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 175
    .line 176
    .line 177
    iget-object p1, p0, Ll3/D;->z:Ljava/nio/ByteBuffer;

    .line 178
    .line 179
    const v1, 0x55550001

    .line 180
    .line 181
    .line 182
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 183
    .line 184
    .line 185
    :cond_b
    iget p1, p0, Ll3/D;->A:I

    .line 186
    .line 187
    if-nez p1, :cond_c

    .line 188
    .line 189
    iget-object p1, p0, Ll3/D;->z:Ljava/nio/ByteBuffer;

    .line 190
    .line 191
    const/4 v1, 0x4

    .line 192
    invoke-virtual {p1, v1, v8}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 193
    .line 194
    .line 195
    iget-object p1, p0, Ll3/D;->z:Ljava/nio/ByteBuffer;

    .line 196
    .line 197
    const/16 v1, 0x8

    .line 198
    .line 199
    mul-long/2addr p2, v4

    .line 200
    invoke-virtual {p1, v1, p2, p3}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 201
    .line 202
    .line 203
    iget-object p1, p0, Ll3/D;->z:Ljava/nio/ByteBuffer;

    .line 204
    .line 205
    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 206
    .line 207
    .line 208
    iput v8, p0, Ll3/D;->A:I

    .line 209
    .line 210
    :cond_c
    iget-object p1, p0, Ll3/D;->z:Ljava/nio/ByteBuffer;

    .line 211
    .line 212
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 213
    .line 214
    .line 215
    move-result p1

    .line 216
    if-lez p1, :cond_e

    .line 217
    .line 218
    iget-object p2, p0, Ll3/D;->z:Ljava/nio/ByteBuffer;

    .line 219
    .line 220
    invoke-virtual {v6, p2, p1, v2}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;II)I

    .line 221
    .line 222
    .line 223
    move-result p2

    .line 224
    if-gez p2, :cond_d

    .line 225
    .line 226
    iput v3, p0, Ll3/D;->A:I

    .line 227
    .line 228
    goto :goto_5

    .line 229
    :cond_d
    if-ge p2, p1, :cond_e

    .line 230
    .line 231
    move p2, v3

    .line 232
    goto :goto_5

    .line 233
    :cond_e
    invoke-virtual {v6, v7, v8, v2}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;II)I

    .line 234
    .line 235
    .line 236
    move-result p1

    .line 237
    if-gez p1, :cond_f

    .line 238
    .line 239
    iput v3, p0, Ll3/D;->A:I

    .line 240
    .line 241
    goto :goto_4

    .line 242
    :cond_f
    iget p2, p0, Ll3/D;->A:I

    .line 243
    .line 244
    sub-int/2addr p2, p1

    .line 245
    iput p2, p0, Ll3/D;->A:I

    .line 246
    .line 247
    goto :goto_4

    .line 248
    :cond_10
    move-object v7, p1

    .line 249
    iget-object p1, p0, Ll3/D;->u:Landroid/media/AudioTrack;

    .line 250
    .line 251
    invoke-virtual {p1, v7, v8, v2}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;II)I

    .line 252
    .line 253
    .line 254
    move-result p2

    .line 255
    :goto_5
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 256
    .line 257
    .line 258
    move-result-wide v4

    .line 259
    iput-wide v4, p0, Ll3/D;->a0:J

    .line 260
    .line 261
    iget-object p1, p0, Ll3/D;->o:LF0/h;

    .line 262
    .line 263
    const-wide/16 v4, 0x0

    .line 264
    .line 265
    if-gez p2, :cond_16

    .line 266
    .line 267
    const/16 p3, 0x18

    .line 268
    .line 269
    if-lt v0, p3, :cond_11

    .line 270
    .line 271
    const/4 p3, -0x6

    .line 272
    if-eq p2, p3, :cond_12

    .line 273
    .line 274
    :cond_11
    const/16 p3, -0x20

    .line 275
    .line 276
    if-ne p2, p3, :cond_13

    .line 277
    .line 278
    :cond_12
    iget-wide v0, p0, Ll3/D;->E:J

    .line 279
    .line 280
    cmp-long p3, v0, v4

    .line 281
    .line 282
    if-lez p3, :cond_13

    .line 283
    .line 284
    goto :goto_6

    .line 285
    :cond_13
    move v2, v3

    .line 286
    :goto_6
    new-instance p3, Ll3/p;

    .line 287
    .line 288
    iget-object v0, p0, Ll3/D;->t:Ll3/A;

    .line 289
    .line 290
    iget-object v0, v0, Ll3/A;->a:Lj3/M;

    .line 291
    .line 292
    invoke-direct {p3, p2, v0, v2}, Ll3/p;-><init>(ILj3/M;Z)V

    .line 293
    .line 294
    .line 295
    iget-object p2, p0, Ll3/D;->r:Li/G;

    .line 296
    .line 297
    if-eqz p2, :cond_14

    .line 298
    .line 299
    invoke-virtual {p2, p3}, Li/G;->q(Ljava/lang/Exception;)V

    .line 300
    .line 301
    .line 302
    :cond_14
    iget-boolean p2, p3, Ll3/p;->b:Z

    .line 303
    .line 304
    if-nez p2, :cond_15

    .line 305
    .line 306
    invoke-virtual {p1, p3}, LF0/h;->N(Ljava/lang/Exception;)V

    .line 307
    .line 308
    .line 309
    return-void

    .line 310
    :cond_15
    throw p3

    .line 311
    :cond_16
    const/4 p3, 0x0

    .line 312
    iput-object p3, p1, LF0/h;->c:Ljava/lang/Object;

    .line 313
    .line 314
    iget-object p1, p0, Ll3/D;->u:Landroid/media/AudioTrack;

    .line 315
    .line 316
    invoke-static {p1}, Ll3/D;->n(Landroid/media/AudioTrack;)Z

    .line 317
    .line 318
    .line 319
    move-result p1

    .line 320
    if-eqz p1, :cond_18

    .line 321
    .line 322
    iget-wide v0, p0, Ll3/D;->E:J

    .line 323
    .line 324
    cmp-long p1, v0, v4

    .line 325
    .line 326
    if-lez p1, :cond_17

    .line 327
    .line 328
    iput-boolean v3, p0, Ll3/D;->c0:Z

    .line 329
    .line 330
    :cond_17
    iget-boolean p1, p0, Ll3/D;->U:Z

    .line 331
    .line 332
    if-eqz p1, :cond_18

    .line 333
    .line 334
    iget-object p1, p0, Ll3/D;->r:Li/G;

    .line 335
    .line 336
    if-eqz p1, :cond_18

    .line 337
    .line 338
    if-ge p2, v8, :cond_18

    .line 339
    .line 340
    iget-boolean v0, p0, Ll3/D;->c0:Z

    .line 341
    .line 342
    if-nez v0, :cond_18

    .line 343
    .line 344
    iget-object p1, p1, Li/G;->b:Ljava/lang/Object;

    .line 345
    .line 346
    check-cast p1, Ll3/H;

    .line 347
    .line 348
    iget-object p1, p1, Ll3/H;->m1:Lj3/E;

    .line 349
    .line 350
    if-eqz p1, :cond_18

    .line 351
    .line 352
    iget-object p1, p1, Lj3/E;->a:Lj3/J;

    .line 353
    .line 354
    iput-boolean v2, p1, Lj3/J;->Z:Z

    .line 355
    .line 356
    :cond_18
    iget-object p1, p0, Ll3/D;->t:Ll3/A;

    .line 357
    .line 358
    iget p1, p1, Ll3/A;->c:I

    .line 359
    .line 360
    if-nez p1, :cond_19

    .line 361
    .line 362
    iget-wide v0, p0, Ll3/D;->D:J

    .line 363
    .line 364
    int-to-long v4, p2

    .line 365
    add-long/2addr v0, v4

    .line 366
    iput-wide v0, p0, Ll3/D;->D:J

    .line 367
    .line 368
    :cond_19
    if-ne p2, v8, :cond_1c

    .line 369
    .line 370
    if-eqz p1, :cond_1b

    .line 371
    .line 372
    iget-object p1, p0, Ll3/D;->M:Ljava/nio/ByteBuffer;

    .line 373
    .line 374
    if-ne v7, p1, :cond_1a

    .line 375
    .line 376
    goto :goto_7

    .line 377
    :cond_1a
    move v2, v3

    .line 378
    :goto_7
    invoke-static {v2}, Ll4/a;->m(Z)V

    .line 379
    .line 380
    .line 381
    iget-wide p1, p0, Ll3/D;->E:J

    .line 382
    .line 383
    iget v0, p0, Ll3/D;->F:I

    .line 384
    .line 385
    int-to-long v0, v0

    .line 386
    iget v2, p0, Ll3/D;->N:I

    .line 387
    .line 388
    int-to-long v2, v2

    .line 389
    mul-long/2addr v0, v2

    .line 390
    add-long/2addr v0, p1

    .line 391
    iput-wide v0, p0, Ll3/D;->E:J

    .line 392
    .line 393
    :cond_1b
    iput-object p3, p0, Ll3/D;->O:Ljava/nio/ByteBuffer;

    .line 394
    .line 395
    :cond_1c
    :goto_8
    return-void
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
.end method
