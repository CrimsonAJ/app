.class public abstract LC3/t;
.super Lj3/d;
.source "SourceFile"


# static fields
.field public static final b1:[B


# instance fields
.field public A:Lj3/M;

.field public A0:J

.field public B:Ln3/i;

.field public B0:I

.field public C:Ln3/i;

.field public C0:I

.field public D:Landroid/media/MediaCrypto;

.field public D0:Ljava/nio/ByteBuffer;

.field public E0:Z

.field public F0:Z

.field public G0:Z

.field public H0:Z

.field public I0:Z

.field public J0:Z

.field public K0:I

.field public L0:I

.field public M0:I

.field public N0:Z

.field public O0:Z

.field public P0:Z

.field public Q0:J

.field public R0:J

.field public S0:Z

.field public T0:Z

.field public U0:Z

.field public V0:Z

.field public W0:Lj3/m;

.field public X:Z

.field public X0:Lm3/d;

.field public final Y:J

.field public Y0:J

.field public Z:F

.field public Z0:J

.field public a1:I

.field public f0:F

.field public g0:LC3/m;

.field public h0:Lj3/M;

.field public i0:Landroid/media/MediaFormat;

.field public j0:Z

.field public k0:F

.field public l0:Ljava/util/ArrayDeque;

.field public final m:LC3/l;

.field public m0:LC3/s;

.field public final n:LC3/u;

.field public n0:LC3/p;

.field public final o:F

.field public o0:I

.field public final p:Lm3/f;

.field public p0:Z

.field public final q:Lm3/f;

.field public q0:Z

.field public final r:Lm3/f;

.field public r0:Z

.field public final s:LC3/i;

.field public s0:Z

.field public final t:LK5/p;

.field public t0:Z

.field public final u:Ljava/util/ArrayList;

.field public u0:Z

.field public final v:Landroid/media/MediaCodec$BufferInfo;

.field public v0:Z

.field public final w:[J

.field public w0:Z

.field public final x:[J

.field public x0:Z

.field public final y:[J

.field public y0:Z

.field public z:Lj3/M;

.field public z0:LC3/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x26

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LC3/t;->b1:[B

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 1
        0x0t
        0x0t
        0x1t
        0x67t
        0x42t
        -0x40t
        0xbt
        -0x26t
        0x25t
        -0x70t
        0x0t
        0x0t
        0x1t
        0x68t
        -0x32t
        0xft
        0x13t
        0x20t
        0x0t
        0x0t
        0x1t
        0x65t
        -0x78t
        -0x7ct
        0xdt
        -0x32t
        0x71t
        0x18t
        -0x60t
        0x0t
        0x2ft
        -0x41t
        0x1ct
        0x31t
        -0x3dt
        0x27t
        0x5dt
        0x78t
    .end array-data
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

.method public constructor <init>(ILC3/l;F)V
    .locals 3

    .line 1
    sget-object v0, LC3/u;->b:LC3/u;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lj3/d;-><init>(I)V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, LC3/t;->m:LC3/l;

    .line 7
    .line 8
    iput-object v0, p0, LC3/t;->n:LC3/u;

    .line 9
    .line 10
    iput p3, p0, LC3/t;->o:F

    .line 11
    .line 12
    new-instance p1, Lm3/f;

    .line 13
    .line 14
    const/4 p2, 0x0

    .line 15
    invoke-direct {p1, p2}, Lm3/f;-><init>(I)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, LC3/t;->p:Lm3/f;

    .line 19
    .line 20
    new-instance p1, Lm3/f;

    .line 21
    .line 22
    invoke-direct {p1, p2}, Lm3/f;-><init>(I)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, LC3/t;->q:Lm3/f;

    .line 26
    .line 27
    new-instance p1, Lm3/f;

    .line 28
    .line 29
    const/4 p3, 0x2

    .line 30
    invoke-direct {p1, p3}, Lm3/f;-><init>(I)V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, LC3/t;->r:Lm3/f;

    .line 34
    .line 35
    new-instance p1, LC3/i;

    .line 36
    .line 37
    invoke-direct {p1, p3}, Lm3/f;-><init>(I)V

    .line 38
    .line 39
    .line 40
    const/16 p3, 0x20

    .line 41
    .line 42
    iput p3, p1, LC3/i;->k:I

    .line 43
    .line 44
    iput-object p1, p0, LC3/t;->s:LC3/i;

    .line 45
    .line 46
    new-instance p3, LK5/p;

    .line 47
    .line 48
    invoke-direct {p3}, LK5/p;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object p3, p0, LC3/t;->t:LK5/p;

    .line 52
    .line 53
    new-instance p3, Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object p3, p0, LC3/t;->u:Ljava/util/ArrayList;

    .line 59
    .line 60
    new-instance p3, Landroid/media/MediaCodec$BufferInfo;

    .line 61
    .line 62
    invoke-direct {p3}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object p3, p0, LC3/t;->v:Landroid/media/MediaCodec$BufferInfo;

    .line 66
    .line 67
    const/high16 p3, 0x3f800000    # 1.0f

    .line 68
    .line 69
    iput p3, p0, LC3/t;->Z:F

    .line 70
    .line 71
    iput p3, p0, LC3/t;->f0:F

    .line 72
    .line 73
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    iput-wide v0, p0, LC3/t;->Y:J

    .line 79
    .line 80
    const/16 p3, 0xa

    .line 81
    .line 82
    new-array v2, p3, [J

    .line 83
    .line 84
    iput-object v2, p0, LC3/t;->w:[J

    .line 85
    .line 86
    new-array v2, p3, [J

    .line 87
    .line 88
    iput-object v2, p0, LC3/t;->x:[J

    .line 89
    .line 90
    new-array p3, p3, [J

    .line 91
    .line 92
    iput-object p3, p0, LC3/t;->y:[J

    .line 93
    .line 94
    iput-wide v0, p0, LC3/t;->Y0:J

    .line 95
    .line 96
    invoke-virtual {p0, v0, v1}, LC3/t;->i0(J)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, p2}, Lm3/f;->t(I)V

    .line 100
    .line 101
    .line 102
    iget-object p1, p1, Lm3/f;->d:Ljava/nio/ByteBuffer;

    .line 103
    .line 104
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 105
    .line 106
    .line 107
    move-result-object p3

    .line 108
    invoke-virtual {p1, p3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 109
    .line 110
    .line 111
    const/high16 p1, -0x40800000    # -1.0f

    .line 112
    .line 113
    iput p1, p0, LC3/t;->k0:F

    .line 114
    .line 115
    iput p2, p0, LC3/t;->o0:I

    .line 116
    .line 117
    iput p2, p0, LC3/t;->K0:I

    .line 118
    .line 119
    const/4 p1, -0x1

    .line 120
    iput p1, p0, LC3/t;->B0:I

    .line 121
    .line 122
    iput p1, p0, LC3/t;->C0:I

    .line 123
    .line 124
    iput-wide v0, p0, LC3/t;->A0:J

    .line 125
    .line 126
    iput-wide v0, p0, LC3/t;->Q0:J

    .line 127
    .line 128
    iput-wide v0, p0, LC3/t;->R0:J

    .line 129
    .line 130
    iput p2, p0, LC3/t;->L0:I

    .line 131
    .line 132
    iput p2, p0, LC3/t;->M0:I

    .line 133
    .line 134
    return-void
    .line 135
    .line 136
.end method


# virtual methods
.method public A(Ljava/lang/IllegalStateException;LC3/p;)LC3/n;
    .locals 1

    .line 1
    new-instance v0, LC3/n;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, LC3/n;-><init>(Ljava/lang/IllegalStateException;LC3/p;)V

    .line 4
    .line 5
    .line 6
    return-object v0
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

.method public final B()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, LC3/t;->I0:Z

    .line 3
    .line 4
    iget-object v1, p0, LC3/t;->s:LC3/i;

    .line 5
    .line 6
    invoke-virtual {v1}, LC3/i;->r()V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, LC3/t;->r:Lm3/f;

    .line 10
    .line 11
    invoke-virtual {v1}, Lm3/f;->r()V

    .line 12
    .line 13
    .line 14
    iput-boolean v0, p0, LC3/t;->H0:Z

    .line 15
    .line 16
    iput-boolean v0, p0, LC3/t;->G0:Z

    .line 17
    .line 18
    return-void
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

.method public final C()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, LC3/t;->N0:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    iput v1, p0, LC3/t;->L0:I

    .line 7
    .line 8
    iget-boolean v0, p0, LC3/t;->q0:Z

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    iget-boolean v0, p0, LC3/t;->s0:Z

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x2

    .line 18
    iput v0, p0, LC3/t;->M0:I

    .line 19
    .line 20
    return v1

    .line 21
    :cond_1
    :goto_0
    const/4 v0, 0x3

    .line 22
    iput v0, p0, LC3/t;->M0:I

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    return v0

    .line 26
    :cond_2
    invoke-virtual {p0}, LC3/t;->n0()V

    .line 27
    .line 28
    .line 29
    return v1
    .line 30
    .line 31
    .line 32
.end method

.method public final D(JJ)Z
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, LC3/t;->C0:I

    .line 4
    .line 5
    const/4 v15, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-ltz v1, :cond_0

    .line 8
    .line 9
    move v1, v2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v1, v15

    .line 12
    :goto_0
    iget-object v3, v0, LC3/t;->v:Landroid/media/MediaCodec$BufferInfo;

    .line 13
    .line 14
    if-nez v1, :cond_f

    .line 15
    .line 16
    iget-boolean v1, v0, LC3/t;->t0:Z

    .line 17
    .line 18
    if-eqz v1, :cond_2

    .line 19
    .line 20
    iget-boolean v1, v0, LC3/t;->O0:Z

    .line 21
    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    :try_start_0
    iget-object v1, v0, LC3/t;->g0:LC3/m;

    .line 25
    .line 26
    invoke-interface {v1, v3}, LC3/m;->d(Landroid/media/MediaCodec$BufferInfo;)I

    .line 27
    .line 28
    .line 29
    move-result v1
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    goto :goto_1

    .line 31
    :catch_0
    invoke-virtual {v0}, LC3/t;->a0()V

    .line 32
    .line 33
    .line 34
    iget-boolean v1, v0, LC3/t;->T0:Z

    .line 35
    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    invoke-virtual {v0}, LC3/t;->d0()V

    .line 39
    .line 40
    .line 41
    :cond_1
    move/from16 v17, v15

    .line 42
    .line 43
    goto/16 :goto_7

    .line 44
    .line 45
    :cond_2
    iget-object v1, v0, LC3/t;->g0:LC3/m;

    .line 46
    .line 47
    invoke-interface {v1, v3}, LC3/m;->d(Landroid/media/MediaCodec$BufferInfo;)I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    :goto_1
    if-gez v1, :cond_7

    .line 52
    .line 53
    const/4 v3, -0x2

    .line 54
    if-ne v1, v3, :cond_5

    .line 55
    .line 56
    iput-boolean v2, v0, LC3/t;->P0:Z

    .line 57
    .line 58
    iget-object v1, v0, LC3/t;->g0:LC3/m;

    .line 59
    .line 60
    invoke-interface {v1}, LC3/m;->n()Landroid/media/MediaFormat;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    iget v3, v0, LC3/t;->o0:I

    .line 65
    .line 66
    if-eqz v3, :cond_3

    .line 67
    .line 68
    const-string v3, "width"

    .line 69
    .line 70
    invoke-virtual {v1, v3}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    const/16 v4, 0x20

    .line 75
    .line 76
    if-ne v3, v4, :cond_3

    .line 77
    .line 78
    const-string v3, "height"

    .line 79
    .line 80
    invoke-virtual {v1, v3}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-ne v3, v4, :cond_3

    .line 85
    .line 86
    iput-boolean v2, v0, LC3/t;->x0:Z

    .line 87
    .line 88
    return v2

    .line 89
    :cond_3
    iget-boolean v3, v0, LC3/t;->v0:Z

    .line 90
    .line 91
    if-eqz v3, :cond_4

    .line 92
    .line 93
    const-string v3, "channel-count"

    .line 94
    .line 95
    invoke-virtual {v1, v3, v2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 96
    .line 97
    .line 98
    :cond_4
    iput-object v1, v0, LC3/t;->i0:Landroid/media/MediaFormat;

    .line 99
    .line 100
    iput-boolean v2, v0, LC3/t;->j0:Z

    .line 101
    .line 102
    return v2

    .line 103
    :cond_5
    iget-boolean v1, v0, LC3/t;->y0:Z

    .line 104
    .line 105
    if-eqz v1, :cond_1

    .line 106
    .line 107
    iget-boolean v1, v0, LC3/t;->S0:Z

    .line 108
    .line 109
    if-nez v1, :cond_6

    .line 110
    .line 111
    iget v1, v0, LC3/t;->L0:I

    .line 112
    .line 113
    const/4 v2, 0x2

    .line 114
    if-ne v1, v2, :cond_1

    .line 115
    .line 116
    :cond_6
    invoke-virtual {v0}, LC3/t;->a0()V

    .line 117
    .line 118
    .line 119
    return v15

    .line 120
    :cond_7
    iget-boolean v4, v0, LC3/t;->x0:Z

    .line 121
    .line 122
    if-eqz v4, :cond_8

    .line 123
    .line 124
    iput-boolean v15, v0, LC3/t;->x0:Z

    .line 125
    .line 126
    iget-object v3, v0, LC3/t;->g0:LC3/m;

    .line 127
    .line 128
    invoke-interface {v3, v1, v15}, LC3/m;->h(IZ)V

    .line 129
    .line 130
    .line 131
    return v2

    .line 132
    :cond_8
    iget v4, v3, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 133
    .line 134
    if-nez v4, :cond_9

    .line 135
    .line 136
    iget v4, v3, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 137
    .line 138
    and-int/lit8 v4, v4, 0x4

    .line 139
    .line 140
    if-eqz v4, :cond_9

    .line 141
    .line 142
    invoke-virtual {v0}, LC3/t;->a0()V

    .line 143
    .line 144
    .line 145
    return v15

    .line 146
    :cond_9
    iput v1, v0, LC3/t;->C0:I

    .line 147
    .line 148
    iget-object v4, v0, LC3/t;->g0:LC3/m;

    .line 149
    .line 150
    invoke-interface {v4, v1}, LC3/m;->u(I)Ljava/nio/ByteBuffer;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    iput-object v1, v0, LC3/t;->D0:Ljava/nio/ByteBuffer;

    .line 155
    .line 156
    if-eqz v1, :cond_a

    .line 157
    .line 158
    iget v4, v3, Landroid/media/MediaCodec$BufferInfo;->offset:I

    .line 159
    .line 160
    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 161
    .line 162
    .line 163
    iget-object v1, v0, LC3/t;->D0:Ljava/nio/ByteBuffer;

    .line 164
    .line 165
    iget v4, v3, Landroid/media/MediaCodec$BufferInfo;->offset:I

    .line 166
    .line 167
    iget v5, v3, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 168
    .line 169
    add-int/2addr v4, v5

    .line 170
    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 171
    .line 172
    .line 173
    :cond_a
    iget-boolean v1, v0, LC3/t;->u0:Z

    .line 174
    .line 175
    if-eqz v1, :cond_b

    .line 176
    .line 177
    iget-wide v4, v3, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 178
    .line 179
    const-wide/16 v6, 0x0

    .line 180
    .line 181
    cmp-long v1, v4, v6

    .line 182
    .line 183
    if-nez v1, :cond_b

    .line 184
    .line 185
    iget v1, v3, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 186
    .line 187
    and-int/lit8 v1, v1, 0x4

    .line 188
    .line 189
    if-eqz v1, :cond_b

    .line 190
    .line 191
    iget-wide v4, v0, LC3/t;->Q0:J

    .line 192
    .line 193
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    cmp-long v1, v4, v6

    .line 199
    .line 200
    if-eqz v1, :cond_b

    .line 201
    .line 202
    iput-wide v4, v3, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 203
    .line 204
    :cond_b
    iget-wide v4, v3, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 205
    .line 206
    iget-object v1, v0, LC3/t;->u:Ljava/util/ArrayList;

    .line 207
    .line 208
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 209
    .line 210
    .line 211
    move-result v6

    .line 212
    move v7, v15

    .line 213
    :goto_2
    if-ge v7, v6, :cond_d

    .line 214
    .line 215
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v8

    .line 219
    check-cast v8, Ljava/lang/Long;

    .line 220
    .line 221
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 222
    .line 223
    .line 224
    move-result-wide v8

    .line 225
    cmp-long v8, v8, v4

    .line 226
    .line 227
    if-nez v8, :cond_c

    .line 228
    .line 229
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move v1, v2

    .line 233
    goto :goto_3

    .line 234
    :cond_c
    add-int/lit8 v7, v7, 0x1

    .line 235
    .line 236
    goto :goto_2

    .line 237
    :cond_d
    move v1, v15

    .line 238
    :goto_3
    iput-boolean v1, v0, LC3/t;->E0:Z

    .line 239
    .line 240
    iget-wide v4, v0, LC3/t;->R0:J

    .line 241
    .line 242
    iget-wide v6, v3, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 243
    .line 244
    cmp-long v1, v4, v6

    .line 245
    .line 246
    if-nez v1, :cond_e

    .line 247
    .line 248
    move v1, v2

    .line 249
    goto :goto_4

    .line 250
    :cond_e
    move v1, v15

    .line 251
    :goto_4
    iput-boolean v1, v0, LC3/t;->F0:Z

    .line 252
    .line 253
    invoke-virtual {v0, v6, v7}, LC3/t;->o0(J)V

    .line 254
    .line 255
    .line 256
    :cond_f
    iget-boolean v1, v0, LC3/t;->t0:Z

    .line 257
    .line 258
    if-eqz v1, :cond_10

    .line 259
    .line 260
    iget-boolean v1, v0, LC3/t;->O0:Z

    .line 261
    .line 262
    if-eqz v1, :cond_10

    .line 263
    .line 264
    :try_start_1
    iget-object v5, v0, LC3/t;->g0:LC3/m;

    .line 265
    .line 266
    iget-object v6, v0, LC3/t;->D0:Ljava/nio/ByteBuffer;

    .line 267
    .line 268
    iget v7, v0, LC3/t;->C0:I

    .line 269
    .line 270
    iget v8, v3, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 271
    .line 272
    iget-wide v10, v3, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 273
    .line 274
    iget-boolean v12, v0, LC3/t;->E0:Z

    .line 275
    .line 276
    iget-boolean v13, v0, LC3/t;->F0:Z

    .line 277
    .line 278
    iget-object v14, v0, LC3/t;->A:Lj3/M;
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    .line 279
    .line 280
    const/4 v9, 0x1

    .line 281
    move/from16 v16, v2

    .line 282
    .line 283
    move/from16 v17, v15

    .line 284
    .line 285
    move-wide/from16 v1, p1

    .line 286
    .line 287
    move-object v15, v3

    .line 288
    move-wide/from16 v3, p3

    .line 289
    .line 290
    :try_start_2
    invoke-virtual/range {v0 .. v14}, LC3/t;->b0(JJLC3/m;Ljava/nio/ByteBuffer;IIIJZZLj3/M;)Z

    .line 291
    .line 292
    .line 293
    move-result v1
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_2

    .line 294
    goto :goto_5

    .line 295
    :catch_1
    move/from16 v17, v15

    .line 296
    .line 297
    :catch_2
    invoke-virtual {v0}, LC3/t;->a0()V

    .line 298
    .line 299
    .line 300
    iget-boolean v1, v0, LC3/t;->T0:Z

    .line 301
    .line 302
    if-eqz v1, :cond_13

    .line 303
    .line 304
    invoke-virtual {v0}, LC3/t;->d0()V

    .line 305
    .line 306
    .line 307
    goto :goto_7

    .line 308
    :cond_10
    move/from16 v16, v2

    .line 309
    .line 310
    move/from16 v17, v15

    .line 311
    .line 312
    move-object v15, v3

    .line 313
    iget-object v5, v0, LC3/t;->g0:LC3/m;

    .line 314
    .line 315
    iget-object v6, v0, LC3/t;->D0:Ljava/nio/ByteBuffer;

    .line 316
    .line 317
    iget v7, v0, LC3/t;->C0:I

    .line 318
    .line 319
    iget v8, v15, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 320
    .line 321
    iget-wide v10, v15, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 322
    .line 323
    iget-boolean v12, v0, LC3/t;->E0:Z

    .line 324
    .line 325
    iget-boolean v13, v0, LC3/t;->F0:Z

    .line 326
    .line 327
    iget-object v14, v0, LC3/t;->A:Lj3/M;

    .line 328
    .line 329
    const/4 v9, 0x1

    .line 330
    move-wide/from16 v1, p1

    .line 331
    .line 332
    move-wide/from16 v3, p3

    .line 333
    .line 334
    invoke-virtual/range {v0 .. v14}, LC3/t;->b0(JJLC3/m;Ljava/nio/ByteBuffer;IIIJZZLj3/M;)Z

    .line 335
    .line 336
    .line 337
    move-result v1

    .line 338
    :goto_5
    if-eqz v1, :cond_13

    .line 339
    .line 340
    iget-wide v1, v15, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 341
    .line 342
    invoke-virtual {v0, v1, v2}, LC3/t;->X(J)V

    .line 343
    .line 344
    .line 345
    iget v1, v15, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 346
    .line 347
    and-int/lit8 v1, v1, 0x4

    .line 348
    .line 349
    if-eqz v1, :cond_11

    .line 350
    .line 351
    move/from16 v2, v16

    .line 352
    .line 353
    goto :goto_6

    .line 354
    :cond_11
    move/from16 v2, v17

    .line 355
    .line 356
    :goto_6
    const/4 v1, -0x1

    .line 357
    iput v1, v0, LC3/t;->C0:I

    .line 358
    .line 359
    const/4 v1, 0x0

    .line 360
    iput-object v1, v0, LC3/t;->D0:Ljava/nio/ByteBuffer;

    .line 361
    .line 362
    if-nez v2, :cond_12

    .line 363
    .line 364
    return v16

    .line 365
    :cond_12
    invoke-virtual {v0}, LC3/t;->a0()V

    .line 366
    .line 367
    .line 368
    :cond_13
    :goto_7
    return v17
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
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

.method public final E()Z
    .locals 27

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, LC3/t;->g0:LC3/m;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget v3, v1, LC3/t;->L0:I

    .line 9
    .line 10
    const/4 v4, 0x2

    .line 11
    if-eq v3, v4, :cond_0

    .line 12
    .line 13
    iget-boolean v3, v1, LC3/t;->S0:Z

    .line 14
    .line 15
    if-eqz v3, :cond_1

    .line 16
    .line 17
    :cond_0
    :goto_0
    move v4, v2

    .line 18
    goto/16 :goto_c

    .line 19
    .line 20
    :cond_1
    iget v3, v1, LC3/t;->B0:I

    .line 21
    .line 22
    iget-object v5, v1, LC3/t;->q:Lm3/f;

    .line 23
    .line 24
    if-gez v3, :cond_3

    .line 25
    .line 26
    invoke-interface {v0}, LC3/m;->v()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iput v0, v1, LC3/t;->B0:I

    .line 31
    .line 32
    if-gez v0, :cond_2

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    iget-object v3, v1, LC3/t;->g0:LC3/m;

    .line 36
    .line 37
    invoke-interface {v3, v0}, LC3/m;->o(I)Ljava/nio/ByteBuffer;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iput-object v0, v5, Lm3/f;->d:Ljava/nio/ByteBuffer;

    .line 42
    .line 43
    invoke-virtual {v5}, Lm3/f;->r()V

    .line 44
    .line 45
    .line 46
    :cond_3
    iget v0, v1, LC3/t;->L0:I

    .line 47
    .line 48
    const/4 v3, 0x0

    .line 49
    const/4 v6, -0x1

    .line 50
    const/4 v7, 0x1

    .line 51
    if-ne v0, v7, :cond_5

    .line 52
    .line 53
    iget-boolean v0, v1, LC3/t;->y0:Z

    .line 54
    .line 55
    if-eqz v0, :cond_4

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_4
    iput-boolean v7, v1, LC3/t;->O0:Z

    .line 59
    .line 60
    iget-object v8, v1, LC3/t;->g0:LC3/m;

    .line 61
    .line 62
    iget v9, v1, LC3/t;->B0:I

    .line 63
    .line 64
    const/4 v13, 0x4

    .line 65
    const/4 v10, 0x0

    .line 66
    const-wide/16 v11, 0x0

    .line 67
    .line 68
    invoke-interface/range {v8 .. v13}, LC3/m;->w(IIJI)V

    .line 69
    .line 70
    .line 71
    iput v6, v1, LC3/t;->B0:I

    .line 72
    .line 73
    iput-object v3, v5, Lm3/f;->d:Ljava/nio/ByteBuffer;

    .line 74
    .line 75
    :goto_1
    iput v4, v1, LC3/t;->L0:I

    .line 76
    .line 77
    return v2

    .line 78
    :cond_5
    iget-boolean v0, v1, LC3/t;->w0:Z

    .line 79
    .line 80
    if-eqz v0, :cond_6

    .line 81
    .line 82
    iput-boolean v2, v1, LC3/t;->w0:Z

    .line 83
    .line 84
    iget-object v0, v5, Lm3/f;->d:Ljava/nio/ByteBuffer;

    .line 85
    .line 86
    sget-object v2, LC3/t;->b1:[B

    .line 87
    .line 88
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 89
    .line 90
    .line 91
    iget-object v8, v1, LC3/t;->g0:LC3/m;

    .line 92
    .line 93
    iget v9, v1, LC3/t;->B0:I

    .line 94
    .line 95
    const/4 v13, 0x0

    .line 96
    const/16 v10, 0x26

    .line 97
    .line 98
    const-wide/16 v11, 0x0

    .line 99
    .line 100
    invoke-interface/range {v8 .. v13}, LC3/m;->w(IIJI)V

    .line 101
    .line 102
    .line 103
    iput v6, v1, LC3/t;->B0:I

    .line 104
    .line 105
    iput-object v3, v5, Lm3/f;->d:Ljava/nio/ByteBuffer;

    .line 106
    .line 107
    iput-boolean v7, v1, LC3/t;->N0:Z

    .line 108
    .line 109
    return v7

    .line 110
    :cond_6
    iget v0, v1, LC3/t;->K0:I

    .line 111
    .line 112
    if-ne v0, v7, :cond_8

    .line 113
    .line 114
    move v0, v2

    .line 115
    :goto_2
    iget-object v8, v1, LC3/t;->h0:Lj3/M;

    .line 116
    .line 117
    iget-object v8, v8, Lj3/M;->n:Ljava/util/List;

    .line 118
    .line 119
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 120
    .line 121
    .line 122
    move-result v8

    .line 123
    if-ge v0, v8, :cond_7

    .line 124
    .line 125
    iget-object v8, v1, LC3/t;->h0:Lj3/M;

    .line 126
    .line 127
    iget-object v8, v8, Lj3/M;->n:Ljava/util/List;

    .line 128
    .line 129
    invoke-interface {v8, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v8

    .line 133
    check-cast v8, [B

    .line 134
    .line 135
    iget-object v9, v5, Lm3/f;->d:Ljava/nio/ByteBuffer;

    .line 136
    .line 137
    invoke-virtual {v9, v8}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 138
    .line 139
    .line 140
    add-int/lit8 v0, v0, 0x1

    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_7
    iput v4, v1, LC3/t;->K0:I

    .line 144
    .line 145
    :cond_8
    iget-object v0, v5, Lm3/f;->d:Ljava/nio/ByteBuffer;

    .line 146
    .line 147
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    iget-object v8, v1, Lj3/d;->b:LO0/c;

    .line 152
    .line 153
    invoke-virtual {v8}, LO0/c;->j()V

    .line 154
    .line 155
    .line 156
    :try_start_0
    invoke-virtual {v1, v8, v5, v2}, Lj3/d;->r(LO0/c;Lm3/f;I)I

    .line 157
    .line 158
    .line 159
    move-result v9
    :try_end_0
    .catch Lm3/e; {:try_start_0 .. :try_end_0} :catch_2

    .line 160
    invoke-virtual {v1}, Lj3/d;->h()Z

    .line 161
    .line 162
    .line 163
    move-result v10

    .line 164
    if-eqz v10, :cond_9

    .line 165
    .line 166
    iget-wide v10, v1, LC3/t;->Q0:J

    .line 167
    .line 168
    iput-wide v10, v1, LC3/t;->R0:J

    .line 169
    .line 170
    :cond_9
    const/4 v10, -0x3

    .line 171
    if-ne v9, v10, :cond_a

    .line 172
    .line 173
    goto/16 :goto_0

    .line 174
    .line 175
    :cond_a
    const/4 v10, -0x5

    .line 176
    if-ne v9, v10, :cond_c

    .line 177
    .line 178
    iget v0, v1, LC3/t;->K0:I

    .line 179
    .line 180
    if-ne v0, v4, :cond_b

    .line 181
    .line 182
    invoke-virtual {v5}, Lm3/f;->r()V

    .line 183
    .line 184
    .line 185
    iput v7, v1, LC3/t;->K0:I

    .line 186
    .line 187
    :cond_b
    invoke-virtual {v1, v8}, LC3/t;->U(LO0/c;)Lm3/h;

    .line 188
    .line 189
    .line 190
    return v7

    .line 191
    :cond_c
    const/4 v8, 0x4

    .line 192
    invoke-virtual {v5, v8}, LQ0/b;->e(I)Z

    .line 193
    .line 194
    .line 195
    move-result v9

    .line 196
    if-eqz v9, :cond_10

    .line 197
    .line 198
    iget v0, v1, LC3/t;->K0:I

    .line 199
    .line 200
    if-ne v0, v4, :cond_d

    .line 201
    .line 202
    invoke-virtual {v5}, Lm3/f;->r()V

    .line 203
    .line 204
    .line 205
    iput v7, v1, LC3/t;->K0:I

    .line 206
    .line 207
    :cond_d
    iput-boolean v7, v1, LC3/t;->S0:Z

    .line 208
    .line 209
    iget-boolean v0, v1, LC3/t;->N0:Z

    .line 210
    .line 211
    if-nez v0, :cond_e

    .line 212
    .line 213
    invoke-virtual {v1}, LC3/t;->a0()V

    .line 214
    .line 215
    .line 216
    return v2

    .line 217
    :cond_e
    :try_start_1
    iget-boolean v0, v1, LC3/t;->y0:Z

    .line 218
    .line 219
    if-eqz v0, :cond_f

    .line 220
    .line 221
    goto/16 :goto_0

    .line 222
    .line 223
    :cond_f
    iput-boolean v7, v1, LC3/t;->O0:Z

    .line 224
    .line 225
    iget-object v8, v1, LC3/t;->g0:LC3/m;

    .line 226
    .line 227
    iget v9, v1, LC3/t;->B0:I

    .line 228
    .line 229
    const/4 v13, 0x4

    .line 230
    const/4 v10, 0x0

    .line 231
    const-wide/16 v11, 0x0

    .line 232
    .line 233
    invoke-interface/range {v8 .. v13}, LC3/m;->w(IIJI)V

    .line 234
    .line 235
    .line 236
    iput v6, v1, LC3/t;->B0:I

    .line 237
    .line 238
    iput-object v3, v5, Lm3/f;->d:Ljava/nio/ByteBuffer;
    :try_end_1
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_1 .. :try_end_1} :catch_0

    .line 239
    .line 240
    return v2

    .line 241
    :catch_0
    move-exception v0

    .line 242
    iget-object v3, v1, LC3/t;->z:Lj3/M;

    .line 243
    .line 244
    invoke-virtual {v0}, Landroid/media/MediaCodec$CryptoException;->getErrorCode()I

    .line 245
    .line 246
    .line 247
    move-result v4

    .line 248
    invoke-static {v4}, Ll4/y;->s(I)I

    .line 249
    .line 250
    .line 251
    move-result v4

    .line 252
    invoke-virtual {v1, v0, v3, v2, v4}, Lj3/d;->e(Ljava/lang/Exception;Lj3/M;ZI)Lj3/m;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    throw v0

    .line 257
    :cond_10
    iget-boolean v9, v1, LC3/t;->N0:Z

    .line 258
    .line 259
    if-nez v9, :cond_11

    .line 260
    .line 261
    invoke-virtual {v5, v7}, LQ0/b;->e(I)Z

    .line 262
    .line 263
    .line 264
    move-result v9

    .line 265
    if-nez v9, :cond_11

    .line 266
    .line 267
    invoke-virtual {v5}, Lm3/f;->r()V

    .line 268
    .line 269
    .line 270
    iget v0, v1, LC3/t;->K0:I

    .line 271
    .line 272
    if-ne v0, v4, :cond_19

    .line 273
    .line 274
    iput v7, v1, LC3/t;->K0:I

    .line 275
    .line 276
    return v7

    .line 277
    :cond_11
    const/high16 v4, 0x40000000    # 2.0f

    .line 278
    .line 279
    invoke-virtual {v5, v4}, LQ0/b;->e(I)Z

    .line 280
    .line 281
    .line 282
    move-result v4

    .line 283
    iget-object v9, v5, Lm3/f;->c:Lm3/b;

    .line 284
    .line 285
    if-eqz v4, :cond_14

    .line 286
    .line 287
    if-nez v0, :cond_12

    .line 288
    .line 289
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    goto :goto_3

    .line 293
    :cond_12
    iget-object v10, v9, Lm3/b;->d:[I

    .line 294
    .line 295
    if-nez v10, :cond_13

    .line 296
    .line 297
    new-array v10, v7, [I

    .line 298
    .line 299
    iput-object v10, v9, Lm3/b;->d:[I

    .line 300
    .line 301
    iget-object v11, v9, Lm3/b;->i:Landroid/media/MediaCodec$CryptoInfo;

    .line 302
    .line 303
    iput-object v10, v11, Landroid/media/MediaCodec$CryptoInfo;->numBytesOfClearData:[I

    .line 304
    .line 305
    :cond_13
    iget-object v10, v9, Lm3/b;->d:[I

    .line 306
    .line 307
    aget v11, v10, v2

    .line 308
    .line 309
    add-int/2addr v11, v0

    .line 310
    aput v11, v10, v2

    .line 311
    .line 312
    :cond_14
    :goto_3
    iget-boolean v0, v1, LC3/t;->p0:Z

    .line 313
    .line 314
    if-eqz v0, :cond_1b

    .line 315
    .line 316
    if-nez v4, :cond_1b

    .line 317
    .line 318
    iget-object v0, v5, Lm3/f;->d:Ljava/nio/ByteBuffer;

    .line 319
    .line 320
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 321
    .line 322
    .line 323
    move-result v10

    .line 324
    move v11, v2

    .line 325
    move v12, v11

    .line 326
    :goto_4
    add-int/lit8 v13, v11, 0x1

    .line 327
    .line 328
    if-ge v13, v10, :cond_18

    .line 329
    .line 330
    invoke-virtual {v0, v11}, Ljava/nio/ByteBuffer;->get(I)B

    .line 331
    .line 332
    .line 333
    move-result v14

    .line 334
    and-int/lit16 v14, v14, 0xff

    .line 335
    .line 336
    const/4 v15, 0x3

    .line 337
    if-ne v12, v15, :cond_15

    .line 338
    .line 339
    if-ne v14, v7, :cond_16

    .line 340
    .line 341
    invoke-virtual {v0, v13}, Ljava/nio/ByteBuffer;->get(I)B

    .line 342
    .line 343
    .line 344
    move-result v16

    .line 345
    move/from16 v17, v15

    .line 346
    .line 347
    and-int/lit8 v15, v16, 0x1f

    .line 348
    .line 349
    const/4 v3, 0x7

    .line 350
    if-ne v15, v3, :cond_16

    .line 351
    .line 352
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    .line 353
    .line 354
    .line 355
    move-result-object v3

    .line 356
    add-int/lit8 v11, v11, -0x3

    .line 357
    .line 358
    invoke-virtual {v3, v11}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 359
    .line 360
    .line 361
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 362
    .line 363
    .line 364
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 365
    .line 366
    .line 367
    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 368
    .line 369
    .line 370
    goto :goto_5

    .line 371
    :cond_15
    if-nez v14, :cond_16

    .line 372
    .line 373
    add-int/lit8 v12, v12, 0x1

    .line 374
    .line 375
    :cond_16
    if-eqz v14, :cond_17

    .line 376
    .line 377
    move v12, v2

    .line 378
    :cond_17
    move v11, v13

    .line 379
    const/4 v3, 0x0

    .line 380
    goto :goto_4

    .line 381
    :cond_18
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 382
    .line 383
    .line 384
    :goto_5
    iget-object v0, v5, Lm3/f;->d:Ljava/nio/ByteBuffer;

    .line 385
    .line 386
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 387
    .line 388
    .line 389
    move-result v0

    .line 390
    if-nez v0, :cond_1a

    .line 391
    .line 392
    :cond_19
    return v7

    .line 393
    :cond_1a
    iput-boolean v2, v1, LC3/t;->p0:Z

    .line 394
    .line 395
    :cond_1b
    iget-wide v10, v5, Lm3/f;->f:J

    .line 396
    .line 397
    iget-object v0, v1, LC3/t;->z0:LC3/j;

    .line 398
    .line 399
    if-eqz v0, :cond_20

    .line 400
    .line 401
    iget-object v3, v1, LC3/t;->z:Lj3/M;

    .line 402
    .line 403
    iget-wide v12, v0, LC3/j;->b:J

    .line 404
    .line 405
    const-wide/16 v14, 0x0

    .line 406
    .line 407
    cmp-long v12, v12, v14

    .line 408
    .line 409
    if-nez v12, :cond_1c

    .line 410
    .line 411
    iput-wide v10, v0, LC3/j;->a:J

    .line 412
    .line 413
    :cond_1c
    iget-boolean v12, v0, LC3/j;->c:Z

    .line 414
    .line 415
    const-wide/32 v17, 0xf4240

    .line 416
    .line 417
    .line 418
    const-wide/16 v19, 0x211

    .line 419
    .line 420
    if-eqz v12, :cond_1d

    .line 421
    .line 422
    goto :goto_7

    .line 423
    :cond_1d
    iget-object v10, v5, Lm3/f;->d:Ljava/nio/ByteBuffer;

    .line 424
    .line 425
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 426
    .line 427
    .line 428
    move v11, v2

    .line 429
    move v12, v11

    .line 430
    :goto_6
    if-ge v11, v8, :cond_1e

    .line 431
    .line 432
    shl-int/lit8 v12, v12, 0x8

    .line 433
    .line 434
    invoke-virtual {v10, v11}, Ljava/nio/ByteBuffer;->get(I)B

    .line 435
    .line 436
    .line 437
    move-result v13

    .line 438
    and-int/lit16 v13, v13, 0xff

    .line 439
    .line 440
    or-int/2addr v12, v13

    .line 441
    add-int/lit8 v11, v11, 0x1

    .line 442
    .line 443
    goto :goto_6

    .line 444
    :cond_1e
    invoke-static {v12}, Ll3/a;->j(I)I

    .line 445
    .line 446
    .line 447
    move-result v8

    .line 448
    if-ne v8, v6, :cond_1f

    .line 449
    .line 450
    iput-boolean v7, v0, LC3/j;->c:Z

    .line 451
    .line 452
    iput-wide v14, v0, LC3/j;->b:J

    .line 453
    .line 454
    iget-wide v10, v5, Lm3/f;->f:J

    .line 455
    .line 456
    iput-wide v10, v0, LC3/j;->a:J

    .line 457
    .line 458
    const-string v0, "C2Mp3TimestampTracker"

    .line 459
    .line 460
    const-string v3, "MPEG audio header is invalid."

    .line 461
    .line 462
    invoke-static {v0, v3}, Ll4/a;->P(Ljava/lang/String;Ljava/lang/String;)V

    .line 463
    .line 464
    .line 465
    iget-wide v10, v5, Lm3/f;->f:J

    .line 466
    .line 467
    goto :goto_7

    .line 468
    :cond_1f
    iget v3, v3, Lj3/M;->z:I

    .line 469
    .line 470
    int-to-long v10, v3

    .line 471
    iget-wide v12, v0, LC3/j;->a:J

    .line 472
    .line 473
    iget-wide v6, v0, LC3/j;->b:J

    .line 474
    .line 475
    sub-long v6, v6, v19

    .line 476
    .line 477
    mul-long v6, v6, v17

    .line 478
    .line 479
    div-long/2addr v6, v10

    .line 480
    invoke-static {v14, v15, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 481
    .line 482
    .line 483
    move-result-wide v6

    .line 484
    add-long v10, v6, v12

    .line 485
    .line 486
    iget-wide v6, v0, LC3/j;->b:J

    .line 487
    .line 488
    int-to-long v12, v8

    .line 489
    add-long/2addr v6, v12

    .line 490
    iput-wide v6, v0, LC3/j;->b:J

    .line 491
    .line 492
    :goto_7
    iget-wide v6, v1, LC3/t;->Q0:J

    .line 493
    .line 494
    iget-object v0, v1, LC3/t;->z0:LC3/j;

    .line 495
    .line 496
    iget-object v8, v1, LC3/t;->z:Lj3/M;

    .line 497
    .line 498
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 499
    .line 500
    .line 501
    iget v8, v8, Lj3/M;->z:I

    .line 502
    .line 503
    int-to-long v12, v8

    .line 504
    move v8, v4

    .line 505
    iget-wide v3, v0, LC3/j;->a:J

    .line 506
    .line 507
    move-wide/from16 v21, v3

    .line 508
    .line 509
    iget-wide v2, v0, LC3/j;->b:J

    .line 510
    .line 511
    sub-long v2, v2, v19

    .line 512
    .line 513
    mul-long v2, v2, v17

    .line 514
    .line 515
    div-long/2addr v2, v12

    .line 516
    invoke-static {v14, v15, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 517
    .line 518
    .line 519
    move-result-wide v2

    .line 520
    add-long v2, v2, v21

    .line 521
    .line 522
    invoke-static {v6, v7, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 523
    .line 524
    .line 525
    move-result-wide v2

    .line 526
    iput-wide v2, v1, LC3/t;->Q0:J

    .line 527
    .line 528
    goto :goto_8

    .line 529
    :cond_20
    move v8, v4

    .line 530
    :goto_8
    const/high16 v0, -0x80000000

    .line 531
    .line 532
    invoke-virtual {v5, v0}, LQ0/b;->e(I)Z

    .line 533
    .line 534
    .line 535
    move-result v0

    .line 536
    if-eqz v0, :cond_21

    .line 537
    .line 538
    iget-object v0, v1, LC3/t;->u:Ljava/util/ArrayList;

    .line 539
    .line 540
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 541
    .line 542
    .line 543
    move-result-object v2

    .line 544
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 545
    .line 546
    .line 547
    :cond_21
    iget-boolean v0, v1, LC3/t;->U0:Z

    .line 548
    .line 549
    if-eqz v0, :cond_22

    .line 550
    .line 551
    iget-object v0, v1, LC3/t;->t:LK5/p;

    .line 552
    .line 553
    iget-object v2, v1, LC3/t;->z:Lj3/M;

    .line 554
    .line 555
    invoke-virtual {v0, v10, v11, v2}, LK5/p;->a(JLjava/lang/Object;)V

    .line 556
    .line 557
    .line 558
    const/4 v2, 0x0

    .line 559
    iput-boolean v2, v1, LC3/t;->U0:Z

    .line 560
    .line 561
    :cond_22
    iget-wide v2, v1, LC3/t;->Q0:J

    .line 562
    .line 563
    invoke-static {v2, v3, v10, v11}, Ljava/lang/Math;->max(JJ)J

    .line 564
    .line 565
    .line 566
    move-result-wide v2

    .line 567
    iput-wide v2, v1, LC3/t;->Q0:J

    .line 568
    .line 569
    invoke-virtual {v5}, Lm3/f;->u()V

    .line 570
    .line 571
    .line 572
    const/high16 v0, 0x10000000

    .line 573
    .line 574
    invoke-virtual {v5, v0}, LQ0/b;->e(I)Z

    .line 575
    .line 576
    .line 577
    move-result v0

    .line 578
    if-eqz v0, :cond_23

    .line 579
    .line 580
    invoke-virtual {v1, v5}, LC3/t;->N(Lm3/f;)V

    .line 581
    .line 582
    .line 583
    :cond_23
    invoke-virtual {v1, v5}, LC3/t;->Z(Lm3/f;)V

    .line 584
    .line 585
    .line 586
    if-eqz v8, :cond_24

    .line 587
    .line 588
    :try_start_2
    iget-object v0, v1, LC3/t;->g0:LC3/m;

    .line 589
    .line 590
    iget v2, v1, LC3/t;->B0:I

    .line 591
    .line 592
    invoke-interface {v0, v2, v9, v10, v11}, LC3/m;->r(ILm3/b;J)V

    .line 593
    .line 594
    .line 595
    :goto_9
    const/4 v0, -0x1

    .line 596
    goto :goto_a

    .line 597
    :catch_1
    move-exception v0

    .line 598
    goto :goto_b

    .line 599
    :cond_24
    iget-object v0, v1, LC3/t;->g0:LC3/m;

    .line 600
    .line 601
    iget v2, v1, LC3/t;->B0:I

    .line 602
    .line 603
    iget-object v3, v5, Lm3/f;->d:Ljava/nio/ByteBuffer;

    .line 604
    .line 605
    invoke-virtual {v3}, Ljava/nio/Buffer;->limit()I

    .line 606
    .line 607
    .line 608
    move-result v23

    .line 609
    const/16 v26, 0x0

    .line 610
    .line 611
    move-object/from16 v21, v0

    .line 612
    .line 613
    move/from16 v22, v2

    .line 614
    .line 615
    move-wide/from16 v24, v10

    .line 616
    .line 617
    invoke-interface/range {v21 .. v26}, LC3/m;->w(IIJI)V
    :try_end_2
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_2 .. :try_end_2} :catch_1

    .line 618
    .line 619
    .line 620
    goto :goto_9

    .line 621
    :goto_a
    iput v0, v1, LC3/t;->B0:I

    .line 622
    .line 623
    const/4 v0, 0x0

    .line 624
    iput-object v0, v5, Lm3/f;->d:Ljava/nio/ByteBuffer;

    .line 625
    .line 626
    const/4 v3, 0x1

    .line 627
    iput-boolean v3, v1, LC3/t;->N0:Z

    .line 628
    .line 629
    const/4 v2, 0x0

    .line 630
    iput v2, v1, LC3/t;->K0:I

    .line 631
    .line 632
    iget-object v0, v1, LC3/t;->X0:Lm3/d;

    .line 633
    .line 634
    iget v2, v0, Lm3/d;->c:I

    .line 635
    .line 636
    add-int/2addr v2, v3

    .line 637
    iput v2, v0, Lm3/d;->c:I

    .line 638
    .line 639
    return v3

    .line 640
    :goto_b
    iget-object v2, v1, LC3/t;->z:Lj3/M;

    .line 641
    .line 642
    invoke-virtual {v0}, Landroid/media/MediaCodec$CryptoException;->getErrorCode()I

    .line 643
    .line 644
    .line 645
    move-result v3

    .line 646
    invoke-static {v3}, Ll4/y;->s(I)I

    .line 647
    .line 648
    .line 649
    move-result v3

    .line 650
    const/4 v4, 0x0

    .line 651
    invoke-virtual {v1, v0, v2, v4, v3}, Lj3/d;->e(Ljava/lang/Exception;Lj3/M;ZI)Lj3/m;

    .line 652
    .line 653
    .line 654
    move-result-object v0

    .line 655
    throw v0

    .line 656
    :catch_2
    move-exception v0

    .line 657
    move v4, v2

    .line 658
    invoke-virtual {v1, v0}, LC3/t;->R(Ljava/lang/Exception;)V

    .line 659
    .line 660
    .line 661
    invoke-virtual {v1, v4}, LC3/t;->c0(I)Z

    .line 662
    .line 663
    .line 664
    invoke-virtual {v1}, LC3/t;->F()V

    .line 665
    .line 666
    .line 667
    const/4 v3, 0x1

    .line 668
    return v3

    .line 669
    :goto_c
    return v4
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
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
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
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
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
.end method

.method public final F()V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, LC3/t;->g0:LC3/m;

    .line 2
    .line 3
    invoke-interface {v0}, LC3/m;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LC3/t;->f0()V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :catchall_0
    move-exception v0

    .line 11
    invoke-virtual {p0}, LC3/t;->f0()V

    .line 12
    .line 13
    .line 14
    throw v0
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

.method public final G()Z
    .locals 5

    .line 1
    iget-object v0, p0, LC3/t;->g0:LC3/m;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget v0, p0, LC3/t;->M0:I

    .line 8
    .line 9
    const/4 v2, 0x3

    .line 10
    const/4 v3, 0x1

    .line 11
    if-eq v0, v2, :cond_5

    .line 12
    .line 13
    iget-boolean v2, p0, LC3/t;->q0:Z

    .line 14
    .line 15
    if-nez v2, :cond_5

    .line 16
    .line 17
    iget-boolean v2, p0, LC3/t;->r0:Z

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    iget-boolean v2, p0, LC3/t;->P0:Z

    .line 22
    .line 23
    if-eqz v2, :cond_5

    .line 24
    .line 25
    :cond_1
    iget-boolean v2, p0, LC3/t;->s0:Z

    .line 26
    .line 27
    if-eqz v2, :cond_2

    .line 28
    .line 29
    iget-boolean v2, p0, LC3/t;->O0:Z

    .line 30
    .line 31
    if-eqz v2, :cond_2

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_2
    const/4 v2, 0x2

    .line 35
    if-ne v0, v2, :cond_4

    .line 36
    .line 37
    sget v0, Ll4/y;->a:I

    .line 38
    .line 39
    const/16 v2, 0x17

    .line 40
    .line 41
    if-lt v0, v2, :cond_3

    .line 42
    .line 43
    move v4, v3

    .line 44
    goto :goto_0

    .line 45
    :cond_3
    move v4, v1

    .line 46
    :goto_0
    invoke-static {v4}, Ll4/a;->m(Z)V

    .line 47
    .line 48
    .line 49
    if-lt v0, v2, :cond_4

    .line 50
    .line 51
    :try_start_0
    invoke-virtual {p0}, LC3/t;->n0()V
    :try_end_0
    .catch Lj3/m; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :catch_0
    move-exception v0

    .line 56
    const-string v1, "MediaCodecRenderer"

    .line 57
    .line 58
    const-string v2, "Failed to update the DRM session, releasing the codec instead."

    .line 59
    .line 60
    invoke-static {v1, v2, v0}, Ll4/a;->Q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, LC3/t;->d0()V

    .line 64
    .line 65
    .line 66
    return v3

    .line 67
    :cond_4
    :goto_1
    invoke-virtual {p0}, LC3/t;->F()V

    .line 68
    .line 69
    .line 70
    return v1

    .line 71
    :cond_5
    :goto_2
    invoke-virtual {p0}, LC3/t;->d0()V

    .line 72
    .line 73
    .line 74
    return v3
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

.method public final H(Z)Ljava/util/List;
    .locals 3

    .line 1
    iget-object v0, p0, LC3/t;->z:Lj3/M;

    .line 2
    .line 3
    iget-object v1, p0, LC3/t;->n:LC3/u;

    .line 4
    .line 5
    invoke-virtual {p0, v1, v0, p1}, LC3/t;->K(LC3/u;Lj3/M;Z)Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    iget-object p1, p0, LC3/t;->z:Lj3/M;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-virtual {p0, v1, p1, v0}, LC3/t;->K(LC3/u;Lj3/M;Z)Ljava/util/ArrayList;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    new-instance v0, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v1, "Drm session requires secure decoder for "

    .line 33
    .line 34
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, LC3/t;->z:Lj3/M;

    .line 38
    .line 39
    iget-object v1, v1, Lj3/M;->l:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v1, ", but no secure decoder available. Trying to proceed with "

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v1, "."

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    const-string v1, "MediaCodecRenderer"

    .line 62
    .line 63
    invoke-static {v1, v0}, Ll4/a;->P(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    :cond_0
    return-object p1

    .line 67
    :cond_1
    return-object v0
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

.method public I()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
    .line 3
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

.method public abstract J(F[Lj3/M;)F
.end method

.method public abstract K(LC3/u;Lj3/M;Z)Ljava/util/ArrayList;
.end method

.method public final L(Ln3/i;)Ln3/w;
    .locals 3

    .line 1
    invoke-interface {p1}, Ln3/i;->g()Lm3/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    instance-of v0, p1, Ln3/w;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 13
    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v2, "Expecting FrameworkCryptoConfig but found: "

    .line 17
    .line 18
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, LC3/t;->z:Lj3/M;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    const/16 v2, 0x1771

    .line 35
    .line 36
    invoke-virtual {p0, v0, p1, v1, v2}, Lj3/d;->e(Ljava/lang/Exception;Lj3/M;ZI)Lj3/m;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    throw p1

    .line 41
    :cond_1
    :goto_0
    check-cast p1, Ln3/w;

    .line 42
    .line 43
    return-object p1
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
.end method

.method public abstract M(LC3/p;Lj3/M;Landroid/media/MediaCrypto;F)LC3/k;
.end method

.method public N(Lm3/f;)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public final O(LC3/p;Landroid/media/MediaCrypto;)V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const-string v2, "createCodec:"

    .line 6
    .line 7
    iget-object v4, v0, LC3/p;->a:Ljava/lang/String;

    .line 8
    .line 9
    sget v3, Ll4/y;->a:I

    .line 10
    .line 11
    const/high16 v5, -0x40800000    # -1.0f

    .line 12
    .line 13
    const/16 v6, 0x17

    .line 14
    .line 15
    if-ge v3, v6, :cond_0

    .line 16
    .line 17
    move v7, v5

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget v7, v1, LC3/t;->f0:F

    .line 20
    .line 21
    iget-object v8, v1, Lj3/d;->h:[Lj3/M;

    .line 22
    .line 23
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v7, v8}, LC3/t;->J(F[Lj3/M;)F

    .line 27
    .line 28
    .line 29
    move-result v7

    .line 30
    :goto_0
    iget v8, v1, LC3/t;->o:F

    .line 31
    .line 32
    cmpg-float v8, v7, v8

    .line 33
    .line 34
    if-gtz v8, :cond_1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move v5, v7

    .line 38
    :goto_1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 39
    .line 40
    .line 41
    move-result-wide v7

    .line 42
    iget-object v9, v1, LC3/t;->z:Lj3/M;

    .line 43
    .line 44
    move-object/from16 v10, p2

    .line 45
    .line 46
    invoke-virtual {v1, v0, v9, v10, v5}, LC3/t;->M(LC3/p;Lj3/M;Landroid/media/MediaCrypto;F)LC3/k;

    .line 47
    .line 48
    .line 49
    move-result-object v9

    .line 50
    const/16 v10, 0x1f

    .line 51
    .line 52
    if-lt v3, v10, :cond_2

    .line 53
    .line 54
    iget-object v10, v1, Lj3/d;->e:Lk3/l;

    .line 55
    .line 56
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-static {v9, v10}, LC3/r;->a(LC3/k;Lk3/l;)V

    .line 60
    .line 61
    .line 62
    :cond_2
    :try_start_0
    new-instance v10, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    invoke-direct {v10, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-static {v2}, Ll4/a;->c(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    iget-object v2, v1, LC3/t;->m:LC3/l;

    .line 78
    .line 79
    invoke-interface {v2, v9}, LC3/l;->p(LC3/k;)LC3/m;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    iput-object v2, v1, LC3/t;->g0:LC3/m;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 84
    .line 85
    invoke-static {}, Ll4/a;->v()V

    .line 86
    .line 87
    .line 88
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 89
    .line 90
    .line 91
    move-result-wide v9

    .line 92
    iput-object v0, v1, LC3/t;->n0:LC3/p;

    .line 93
    .line 94
    iput v5, v1, LC3/t;->k0:F

    .line 95
    .line 96
    iget-object v2, v1, LC3/t;->z:Lj3/M;

    .line 97
    .line 98
    iput-object v2, v1, LC3/t;->h0:Lj3/M;

    .line 99
    .line 100
    const-string v5, "OMX.Exynos.avc.dec.secure"

    .line 101
    .line 102
    const/16 v11, 0x19

    .line 103
    .line 104
    const/4 v13, 0x1

    .line 105
    if-gt v3, v11, :cond_4

    .line 106
    .line 107
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v14

    .line 111
    if-eqz v14, :cond_4

    .line 112
    .line 113
    sget-object v14, Ll4/y;->d:Ljava/lang/String;

    .line 114
    .line 115
    const-string v15, "SM-T585"

    .line 116
    .line 117
    invoke-virtual {v14, v15}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 118
    .line 119
    .line 120
    move-result v15

    .line 121
    if-nez v15, :cond_3

    .line 122
    .line 123
    const-string v15, "SM-A510"

    .line 124
    .line 125
    invoke-virtual {v14, v15}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 126
    .line 127
    .line 128
    move-result v15

    .line 129
    if-nez v15, :cond_3

    .line 130
    .line 131
    const-string v15, "SM-A520"

    .line 132
    .line 133
    invoke-virtual {v14, v15}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 134
    .line 135
    .line 136
    move-result v15

    .line 137
    if-nez v15, :cond_3

    .line 138
    .line 139
    const-string v15, "SM-J700"

    .line 140
    .line 141
    invoke-virtual {v14, v15}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 142
    .line 143
    .line 144
    move-result v14

    .line 145
    if-eqz v14, :cond_4

    .line 146
    .line 147
    :cond_3
    const/4 v14, 0x2

    .line 148
    goto :goto_2

    .line 149
    :cond_4
    const/16 v14, 0x18

    .line 150
    .line 151
    if-ge v3, v14, :cond_7

    .line 152
    .line 153
    const-string v14, "OMX.Nvidia.h264.decode"

    .line 154
    .line 155
    invoke-virtual {v14, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v14

    .line 159
    if-nez v14, :cond_5

    .line 160
    .line 161
    const-string v14, "OMX.Nvidia.h264.decode.secure"

    .line 162
    .line 163
    invoke-virtual {v14, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v14

    .line 167
    if-eqz v14, :cond_7

    .line 168
    .line 169
    :cond_5
    sget-object v14, Ll4/y;->b:Ljava/lang/String;

    .line 170
    .line 171
    const-string v15, "flounder"

    .line 172
    .line 173
    invoke-virtual {v15, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v15

    .line 177
    if-nez v15, :cond_6

    .line 178
    .line 179
    const-string v15, "flounder_lte"

    .line 180
    .line 181
    invoke-virtual {v15, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v15

    .line 185
    if-nez v15, :cond_6

    .line 186
    .line 187
    const-string v15, "grouper"

    .line 188
    .line 189
    invoke-virtual {v15, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v15

    .line 193
    if-nez v15, :cond_6

    .line 194
    .line 195
    const-string v15, "tilapia"

    .line 196
    .line 197
    invoke-virtual {v15, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v14

    .line 201
    if-eqz v14, :cond_7

    .line 202
    .line 203
    :cond_6
    move v14, v13

    .line 204
    goto :goto_2

    .line 205
    :cond_7
    const/4 v14, 0x0

    .line 206
    :goto_2
    iput v14, v1, LC3/t;->o0:I

    .line 207
    .line 208
    iget-object v14, v1, LC3/t;->h0:Lj3/M;

    .line 209
    .line 210
    const/16 v15, 0x15

    .line 211
    .line 212
    if-ge v3, v15, :cond_8

    .line 213
    .line 214
    iget-object v14, v14, Lj3/M;->n:Ljava/util/List;

    .line 215
    .line 216
    invoke-interface {v14}, Ljava/util/List;->isEmpty()Z

    .line 217
    .line 218
    .line 219
    move-result v14

    .line 220
    if-eqz v14, :cond_8

    .line 221
    .line 222
    const-string v14, "OMX.MTK.VIDEO.DECODER.AVC"

    .line 223
    .line 224
    invoke-virtual {v14, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result v14

    .line 228
    if-eqz v14, :cond_8

    .line 229
    .line 230
    move v14, v13

    .line 231
    goto :goto_3

    .line 232
    :cond_8
    const/4 v14, 0x0

    .line 233
    :goto_3
    iput-boolean v14, v1, LC3/t;->p0:Z

    .line 234
    .line 235
    const/16 v14, 0x13

    .line 236
    .line 237
    const/16 v12, 0x12

    .line 238
    .line 239
    if-lt v3, v12, :cond_b

    .line 240
    .line 241
    if-ne v3, v12, :cond_9

    .line 242
    .line 243
    const-string v2, "OMX.SEC.avc.dec"

    .line 244
    .line 245
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result v2

    .line 249
    if-nez v2, :cond_b

    .line 250
    .line 251
    const-string v2, "OMX.SEC.avc.dec.secure"

    .line 252
    .line 253
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result v2

    .line 257
    if-nez v2, :cond_b

    .line 258
    .line 259
    :cond_9
    if-ne v3, v14, :cond_a

    .line 260
    .line 261
    sget-object v2, Ll4/y;->d:Ljava/lang/String;

    .line 262
    .line 263
    const-string v11, "SM-G800"

    .line 264
    .line 265
    invoke-virtual {v2, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 266
    .line 267
    .line 268
    move-result v2

    .line 269
    if-eqz v2, :cond_a

    .line 270
    .line 271
    const-string v2, "OMX.Exynos.avc.dec"

    .line 272
    .line 273
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    move-result v2

    .line 277
    if-nez v2, :cond_b

    .line 278
    .line 279
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    move-result v2

    .line 283
    if-eqz v2, :cond_a

    .line 284
    .line 285
    goto :goto_4

    .line 286
    :cond_a
    const/4 v2, 0x0

    .line 287
    goto :goto_5

    .line 288
    :cond_b
    :goto_4
    move v2, v13

    .line 289
    :goto_5
    iput-boolean v2, v1, LC3/t;->q0:Z

    .line 290
    .line 291
    const/16 v2, 0x1d

    .line 292
    .line 293
    if-ne v3, v2, :cond_c

    .line 294
    .line 295
    const-string v5, "c2.android.aac.decoder"

    .line 296
    .line 297
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    move-result v5

    .line 301
    if-eqz v5, :cond_c

    .line 302
    .line 303
    move v5, v13

    .line 304
    goto :goto_6

    .line 305
    :cond_c
    const/4 v5, 0x0

    .line 306
    :goto_6
    iput-boolean v5, v1, LC3/t;->r0:Z

    .line 307
    .line 308
    if-gt v3, v6, :cond_d

    .line 309
    .line 310
    const-string v5, "OMX.google.vorbis.decoder"

    .line 311
    .line 312
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    move-result v5

    .line 316
    if-nez v5, :cond_f

    .line 317
    .line 318
    :cond_d
    if-gt v3, v14, :cond_10

    .line 319
    .line 320
    sget-object v5, Ll4/y;->b:Ljava/lang/String;

    .line 321
    .line 322
    const-string v6, "hb2000"

    .line 323
    .line 324
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 325
    .line 326
    .line 327
    move-result v6

    .line 328
    if-nez v6, :cond_e

    .line 329
    .line 330
    const-string v6, "stvm8"

    .line 331
    .line 332
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    move-result v5

    .line 336
    if-eqz v5, :cond_10

    .line 337
    .line 338
    :cond_e
    const-string v5, "OMX.amlogic.avc.decoder.awesome"

    .line 339
    .line 340
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 341
    .line 342
    .line 343
    move-result v5

    .line 344
    if-nez v5, :cond_f

    .line 345
    .line 346
    const-string v5, "OMX.amlogic.avc.decoder.awesome.secure"

    .line 347
    .line 348
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 349
    .line 350
    .line 351
    move-result v5

    .line 352
    if-eqz v5, :cond_10

    .line 353
    .line 354
    :cond_f
    move v5, v13

    .line 355
    goto :goto_7

    .line 356
    :cond_10
    const/4 v5, 0x0

    .line 357
    :goto_7
    iput-boolean v5, v1, LC3/t;->s0:Z

    .line 358
    .line 359
    if-ne v3, v15, :cond_11

    .line 360
    .line 361
    const-string v5, "OMX.google.aac.decoder"

    .line 362
    .line 363
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 364
    .line 365
    .line 366
    move-result v5

    .line 367
    if-eqz v5, :cond_11

    .line 368
    .line 369
    move v5, v13

    .line 370
    goto :goto_8

    .line 371
    :cond_11
    const/4 v5, 0x0

    .line 372
    :goto_8
    iput-boolean v5, v1, LC3/t;->t0:Z

    .line 373
    .line 374
    if-ge v3, v15, :cond_13

    .line 375
    .line 376
    const-string v5, "OMX.SEC.mp3.dec"

    .line 377
    .line 378
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 379
    .line 380
    .line 381
    move-result v5

    .line 382
    if-eqz v5, :cond_13

    .line 383
    .line 384
    const-string v5, "samsung"

    .line 385
    .line 386
    sget-object v6, Ll4/y;->c:Ljava/lang/String;

    .line 387
    .line 388
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 389
    .line 390
    .line 391
    move-result v5

    .line 392
    if-eqz v5, :cond_13

    .line 393
    .line 394
    sget-object v5, Ll4/y;->b:Ljava/lang/String;

    .line 395
    .line 396
    const-string v6, "baffin"

    .line 397
    .line 398
    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 399
    .line 400
    .line 401
    move-result v6

    .line 402
    if-nez v6, :cond_12

    .line 403
    .line 404
    const-string v6, "grand"

    .line 405
    .line 406
    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 407
    .line 408
    .line 409
    move-result v6

    .line 410
    if-nez v6, :cond_12

    .line 411
    .line 412
    const-string v6, "fortuna"

    .line 413
    .line 414
    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 415
    .line 416
    .line 417
    move-result v6

    .line 418
    if-nez v6, :cond_12

    .line 419
    .line 420
    const-string v6, "gprimelte"

    .line 421
    .line 422
    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 423
    .line 424
    .line 425
    move-result v6

    .line 426
    if-nez v6, :cond_12

    .line 427
    .line 428
    const-string v6, "j2y18lte"

    .line 429
    .line 430
    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 431
    .line 432
    .line 433
    move-result v6

    .line 434
    if-nez v6, :cond_12

    .line 435
    .line 436
    const-string v6, "ms01"

    .line 437
    .line 438
    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 439
    .line 440
    .line 441
    move-result v5

    .line 442
    if-eqz v5, :cond_13

    .line 443
    .line 444
    :cond_12
    move v5, v13

    .line 445
    goto :goto_9

    .line 446
    :cond_13
    const/4 v5, 0x0

    .line 447
    :goto_9
    iput-boolean v5, v1, LC3/t;->u0:Z

    .line 448
    .line 449
    iget-object v5, v1, LC3/t;->h0:Lj3/M;

    .line 450
    .line 451
    if-gt v3, v12, :cond_14

    .line 452
    .line 453
    iget v5, v5, Lj3/M;->y:I

    .line 454
    .line 455
    if-ne v5, v13, :cond_14

    .line 456
    .line 457
    const-string v5, "OMX.MTK.AUDIO.DECODER.MP3"

    .line 458
    .line 459
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 460
    .line 461
    .line 462
    move-result v5

    .line 463
    if-eqz v5, :cond_14

    .line 464
    .line 465
    move v5, v13

    .line 466
    goto :goto_a

    .line 467
    :cond_14
    const/4 v5, 0x0

    .line 468
    :goto_a
    iput-boolean v5, v1, LC3/t;->v0:Z

    .line 469
    .line 470
    iget-object v5, v0, LC3/p;->a:Ljava/lang/String;

    .line 471
    .line 472
    const/16 v6, 0x19

    .line 473
    .line 474
    if-gt v3, v6, :cond_15

    .line 475
    .line 476
    const-string v6, "OMX.rk.video_decoder.avc"

    .line 477
    .line 478
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 479
    .line 480
    .line 481
    move-result v6

    .line 482
    if-nez v6, :cond_19

    .line 483
    .line 484
    :cond_15
    const/16 v6, 0x11

    .line 485
    .line 486
    if-gt v3, v6, :cond_16

    .line 487
    .line 488
    const-string v6, "OMX.allwinner.video.decoder.avc"

    .line 489
    .line 490
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 491
    .line 492
    .line 493
    move-result v6

    .line 494
    if-nez v6, :cond_19

    .line 495
    .line 496
    :cond_16
    if-gt v3, v2, :cond_17

    .line 497
    .line 498
    const-string v2, "OMX.broadcom.video_decoder.tunnel"

    .line 499
    .line 500
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 501
    .line 502
    .line 503
    move-result v2

    .line 504
    if-nez v2, :cond_19

    .line 505
    .line 506
    const-string v2, "OMX.broadcom.video_decoder.tunnel.secure"

    .line 507
    .line 508
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 509
    .line 510
    .line 511
    move-result v2

    .line 512
    if-nez v2, :cond_19

    .line 513
    .line 514
    :cond_17
    const-string v2, "Amazon"

    .line 515
    .line 516
    sget-object v3, Ll4/y;->c:Ljava/lang/String;

    .line 517
    .line 518
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 519
    .line 520
    .line 521
    move-result v2

    .line 522
    if-eqz v2, :cond_18

    .line 523
    .line 524
    const-string v2, "AFTS"

    .line 525
    .line 526
    sget-object v3, Ll4/y;->d:Ljava/lang/String;

    .line 527
    .line 528
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 529
    .line 530
    .line 531
    move-result v2

    .line 532
    if-eqz v2, :cond_18

    .line 533
    .line 534
    iget-boolean v0, v0, LC3/p;->f:Z

    .line 535
    .line 536
    if-eqz v0, :cond_18

    .line 537
    .line 538
    goto :goto_b

    .line 539
    :cond_18
    invoke-virtual {v1}, LC3/t;->I()Z

    .line 540
    .line 541
    .line 542
    move-result v0

    .line 543
    if-eqz v0, :cond_1a

    .line 544
    .line 545
    :cond_19
    :goto_b
    move v12, v13

    .line 546
    goto :goto_c

    .line 547
    :cond_1a
    const/4 v12, 0x0

    .line 548
    :goto_c
    iput-boolean v12, v1, LC3/t;->y0:Z

    .line 549
    .line 550
    iget-object v0, v1, LC3/t;->g0:LC3/m;

    .line 551
    .line 552
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 553
    .line 554
    .line 555
    const-string v0, "c2.android.mp3.decoder"

    .line 556
    .line 557
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 558
    .line 559
    .line 560
    move-result v0

    .line 561
    if-eqz v0, :cond_1b

    .line 562
    .line 563
    new-instance v0, LC3/j;

    .line 564
    .line 565
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 566
    .line 567
    .line 568
    iput-object v0, v1, LC3/t;->z0:LC3/j;

    .line 569
    .line 570
    :cond_1b
    iget v0, v1, Lj3/d;->f:I

    .line 571
    .line 572
    const/4 v2, 0x2

    .line 573
    if-ne v0, v2, :cond_1c

    .line 574
    .line 575
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 576
    .line 577
    .line 578
    move-result-wide v2

    .line 579
    const-wide/16 v5, 0x3e8

    .line 580
    .line 581
    add-long/2addr v2, v5

    .line 582
    iput-wide v2, v1, LC3/t;->A0:J

    .line 583
    .line 584
    :cond_1c
    iget-object v0, v1, LC3/t;->X0:Lm3/d;

    .line 585
    .line 586
    iget v2, v0, Lm3/d;->a:I

    .line 587
    .line 588
    add-int/2addr v2, v13

    .line 589
    iput v2, v0, Lm3/d;->a:I

    .line 590
    .line 591
    sub-long v5, v9, v7

    .line 592
    .line 593
    move-wide v2, v9

    .line 594
    invoke-virtual/range {v1 .. v6}, LC3/t;->S(JLjava/lang/String;J)V

    .line 595
    .line 596
    .line 597
    return-void

    .line 598
    :catchall_0
    move-exception v0

    .line 599
    invoke-static {}, Ll4/a;->v()V

    .line 600
    .line 601
    .line 602
    throw v0
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

.method public final P()V
    .locals 7

    .line 1
    iget-object v0, p0, LC3/t;->g0:LC3/m;

    .line 2
    .line 3
    if-nez v0, :cond_8

    .line 4
    .line 5
    iget-boolean v0, p0, LC3/t;->G0:Z

    .line 6
    .line 7
    if-nez v0, :cond_8

    .line 8
    .line 9
    iget-object v0, p0, LC3/t;->z:Lj3/M;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_3

    .line 14
    .line 15
    :cond_0
    iget-object v1, p0, LC3/t;->C:Ln3/i;

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    if-nez v1, :cond_2

    .line 19
    .line 20
    invoke-virtual {p0, v0}, LC3/t;->k0(Lj3/M;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    iget-object v0, p0, LC3/t;->z:Lj3/M;

    .line 27
    .line 28
    invoke-virtual {p0}, LC3/t;->B()V

    .line 29
    .line 30
    .line 31
    iget-object v0, v0, Lj3/M;->l:Ljava/lang/String;

    .line 32
    .line 33
    const-string v1, "audio/mp4a-latm"

    .line 34
    .line 35
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    iget-object v3, p0, LC3/t;->s:LC3/i;

    .line 40
    .line 41
    if-nez v1, :cond_1

    .line 42
    .line 43
    const-string v1, "audio/mpeg"

    .line 44
    .line 45
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-nez v1, :cond_1

    .line 50
    .line 51
    const-string v1, "audio/opus"

    .line 52
    .line 53
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_1

    .line 58
    .line 59
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    iput v2, v3, LC3/i;->k:I

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    const/16 v0, 0x20

    .line 69
    .line 70
    iput v0, v3, LC3/i;->k:I

    .line 71
    .line 72
    :goto_0
    iput-boolean v2, p0, LC3/t;->G0:Z

    .line 73
    .line 74
    return-void

    .line 75
    :cond_2
    iget-object v0, p0, LC3/t;->C:Ln3/i;

    .line 76
    .line 77
    invoke-virtual {p0, v0}, LC3/t;->h0(Ln3/i;)V

    .line 78
    .line 79
    .line 80
    iget-object v0, p0, LC3/t;->z:Lj3/M;

    .line 81
    .line 82
    iget-object v0, v0, Lj3/M;->l:Ljava/lang/String;

    .line 83
    .line 84
    iget-object v1, p0, LC3/t;->B:Ln3/i;

    .line 85
    .line 86
    const/4 v3, 0x0

    .line 87
    if-eqz v1, :cond_7

    .line 88
    .line 89
    iget-object v4, p0, LC3/t;->D:Landroid/media/MediaCrypto;

    .line 90
    .line 91
    if-nez v4, :cond_5

    .line 92
    .line 93
    invoke-virtual {p0, v1}, LC3/t;->L(Ln3/i;)Ln3/w;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    if-nez v1, :cond_3

    .line 98
    .line 99
    iget-object v0, p0, LC3/t;->B:Ln3/i;

    .line 100
    .line 101
    invoke-interface {v0}, Ln3/i;->f()Ln3/h;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    if-eqz v0, :cond_8

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_3
    :try_start_0
    new-instance v4, Landroid/media/MediaCrypto;

    .line 109
    .line 110
    iget-object v5, v1, Ln3/w;->a:Ljava/util/UUID;

    .line 111
    .line 112
    iget-object v6, v1, Ln3/w;->b:[B

    .line 113
    .line 114
    invoke-direct {v4, v5, v6}, Landroid/media/MediaCrypto;-><init>(Ljava/util/UUID;[B)V

    .line 115
    .line 116
    .line 117
    iput-object v4, p0, LC3/t;->D:Landroid/media/MediaCrypto;
    :try_end_0
    .catch Landroid/media/MediaCryptoException; {:try_start_0 .. :try_end_0} :catch_0

    .line 118
    .line 119
    iget-boolean v1, v1, Ln3/w;->c:Z

    .line 120
    .line 121
    if-nez v1, :cond_4

    .line 122
    .line 123
    invoke-virtual {v4, v0}, Landroid/media/MediaCrypto;->requiresSecureDecoderComponent(Ljava/lang/String;)Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-eqz v0, :cond_4

    .line 128
    .line 129
    move v0, v2

    .line 130
    goto :goto_1

    .line 131
    :cond_4
    move v0, v3

    .line 132
    :goto_1
    iput-boolean v0, p0, LC3/t;->X:Z

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :catch_0
    move-exception v0

    .line 136
    iget-object v1, p0, LC3/t;->z:Lj3/M;

    .line 137
    .line 138
    const/16 v2, 0x1776

    .line 139
    .line 140
    invoke-virtual {p0, v0, v1, v3, v2}, Lj3/d;->e(Ljava/lang/Exception;Lj3/M;ZI)Lj3/m;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    throw v0

    .line 145
    :cond_5
    :goto_2
    sget-boolean v0, Ln3/w;->d:Z

    .line 146
    .line 147
    if-eqz v0, :cond_7

    .line 148
    .line 149
    iget-object v0, p0, LC3/t;->B:Ln3/i;

    .line 150
    .line 151
    invoke-interface {v0}, Ln3/i;->getState()I

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    if-eq v0, v2, :cond_6

    .line 156
    .line 157
    const/4 v1, 0x4

    .line 158
    if-eq v0, v1, :cond_7

    .line 159
    .line 160
    goto :goto_3

    .line 161
    :cond_6
    iget-object v0, p0, LC3/t;->B:Ln3/i;

    .line 162
    .line 163
    invoke-interface {v0}, Ln3/i;->f()Ln3/h;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    iget-object v1, p0, LC3/t;->z:Lj3/M;

    .line 171
    .line 172
    iget v2, v0, Ln3/h;->a:I

    .line 173
    .line 174
    invoke-virtual {p0, v0, v1, v3, v2}, Lj3/d;->e(Ljava/lang/Exception;Lj3/M;ZI)Lj3/m;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    throw v0

    .line 179
    :cond_7
    :try_start_1
    iget-object v0, p0, LC3/t;->D:Landroid/media/MediaCrypto;

    .line 180
    .line 181
    iget-boolean v1, p0, LC3/t;->X:Z

    .line 182
    .line 183
    invoke-virtual {p0, v0, v1}, LC3/t;->Q(Landroid/media/MediaCrypto;Z)V
    :try_end_1
    .catch LC3/s; {:try_start_1 .. :try_end_1} :catch_1

    .line 184
    .line 185
    .line 186
    return-void

    .line 187
    :catch_1
    move-exception v0

    .line 188
    iget-object v1, p0, LC3/t;->z:Lj3/M;

    .line 189
    .line 190
    const/16 v2, 0xfa1

    .line 191
    .line 192
    invoke-virtual {p0, v0, v1, v3, v2}, Lj3/d;->e(Ljava/lang/Exception;Lj3/M;ZI)Lj3/m;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    throw v0

    .line 197
    :cond_8
    :goto_3
    return-void
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

.method public final Q(Landroid/media/MediaCrypto;Z)V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move/from16 v7, p2

    .line 6
    .line 7
    iget-object v0, v1, LC3/t;->l0:Ljava/util/ArrayDeque;

    .line 8
    .line 9
    const/4 v10, 0x0

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    :try_start_0
    invoke-virtual {v1, v7}, LC3/t;->H(Z)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v3, Ljava/util/ArrayDeque;

    .line 17
    .line 18
    invoke-direct {v3}, Ljava/util/ArrayDeque;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v3, v1, LC3/t;->l0:Ljava/util/ArrayDeque;

    .line 22
    .line 23
    check-cast v0, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-nez v3, :cond_0

    .line 30
    .line 31
    iget-object v3, v1, LC3/t;->l0:Ljava/util/ArrayDeque;

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, LC3/p;

    .line 39
    .line 40
    invoke-virtual {v3, v0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catch_0
    move-exception v0

    .line 45
    goto :goto_1

    .line 46
    :cond_0
    :goto_0
    iput-object v10, v1, LC3/t;->m0:LC3/s;
    :try_end_0
    .catch LC3/y; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :goto_1
    new-instance v2, LC3/s;

    .line 50
    .line 51
    iget-object v3, v1, LC3/t;->z:Lj3/M;

    .line 52
    .line 53
    const v4, -0xc34e

    .line 54
    .line 55
    .line 56
    invoke-direct {v2, v3, v0, v7, v4}, LC3/s;-><init>(Lj3/M;LC3/y;ZI)V

    .line 57
    .line 58
    .line 59
    throw v2

    .line 60
    :cond_1
    :goto_2
    iget-object v0, v1, LC3/t;->l0:Ljava/util/ArrayDeque;

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-nez v0, :cond_9

    .line 67
    .line 68
    iget-object v0, v1, LC3/t;->l0:Ljava/util/ArrayDeque;

    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peekFirst()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    move-object v11, v0

    .line 75
    check-cast v11, LC3/p;

    .line 76
    .line 77
    :goto_3
    iget-object v0, v1, LC3/t;->g0:LC3/m;

    .line 78
    .line 79
    if-nez v0, :cond_8

    .line 80
    .line 81
    iget-object v0, v1, LC3/t;->l0:Ljava/util/ArrayDeque;

    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peekFirst()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    move-object v8, v0

    .line 88
    check-cast v8, LC3/p;

    .line 89
    .line 90
    invoke-virtual {v1, v8}, LC3/t;->j0(LC3/p;)Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-nez v0, :cond_2

    .line 95
    .line 96
    return-void

    .line 97
    :cond_2
    :try_start_1
    invoke-virtual {v1, v8, v2}, LC3/t;->O(LC3/p;Landroid/media/MediaCrypto;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 98
    .line 99
    .line 100
    goto :goto_3

    .line 101
    :catch_1
    move-exception v0

    .line 102
    const-string v3, "MediaCodecRenderer"

    .line 103
    .line 104
    if-ne v8, v11, :cond_3

    .line 105
    .line 106
    :try_start_2
    const-string v0, "Preferred decoder instantiation failed. Sleeping for 50ms then retrying."

    .line 107
    .line 108
    invoke-static {v3, v0}, Ll4/a;->P(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    const-wide/16 v4, 0x32

    .line 112
    .line 113
    invoke-static {v4, v5}, Ljava/lang/Thread;->sleep(J)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1, v8, v2}, LC3/t;->O(LC3/p;Landroid/media/MediaCrypto;)V

    .line 117
    .line 118
    .line 119
    goto :goto_3

    .line 120
    :catch_2
    move-exception v0

    .line 121
    move-object v5, v0

    .line 122
    goto :goto_4

    .line 123
    :cond_3
    throw v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 124
    :goto_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 125
    .line 126
    const-string v4, "Failed to initialize decoder: "

    .line 127
    .line 128
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-static {v3, v0, v5}, Ll4/a;->Q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 139
    .line 140
    .line 141
    iget-object v0, v1, LC3/t;->l0:Ljava/util/ArrayDeque;

    .line 142
    .line 143
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    new-instance v3, LC3/s;

    .line 147
    .line 148
    iget-object v0, v1, LC3/t;->z:Lj3/M;

    .line 149
    .line 150
    new-instance v4, Ljava/lang/StringBuilder;

    .line 151
    .line 152
    const-string v6, "Decoder init failed: "

    .line 153
    .line 154
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    iget-object v6, v8, LC3/p;->a:Ljava/lang/String;

    .line 158
    .line 159
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    const-string v6, ", "

    .line 163
    .line 164
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    iget-object v6, v0, Lj3/M;->l:Ljava/lang/String;

    .line 175
    .line 176
    sget v0, Ll4/y;->a:I

    .line 177
    .line 178
    const/16 v9, 0x15

    .line 179
    .line 180
    if-lt v0, v9, :cond_5

    .line 181
    .line 182
    instance-of v0, v5, Landroid/media/MediaCodec$CodecException;

    .line 183
    .line 184
    if-eqz v0, :cond_4

    .line 185
    .line 186
    move-object v0, v5

    .line 187
    check-cast v0, Landroid/media/MediaCodec$CodecException;

    .line 188
    .line 189
    invoke-virtual {v0}, Landroid/media/MediaCodec$CodecException;->getDiagnosticInfo()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    goto :goto_5

    .line 194
    :cond_4
    move-object v0, v10

    .line 195
    :goto_5
    move-object v9, v0

    .line 196
    goto :goto_6

    .line 197
    :cond_5
    move-object v9, v10

    .line 198
    :goto_6
    invoke-direct/range {v3 .. v9}, LC3/s;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ZLC3/p;Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v1, v3}, LC3/t;->R(Ljava/lang/Exception;)V

    .line 202
    .line 203
    .line 204
    iget-object v0, v1, LC3/t;->m0:LC3/s;

    .line 205
    .line 206
    if-nez v0, :cond_6

    .line 207
    .line 208
    iput-object v3, v1, LC3/t;->m0:LC3/s;

    .line 209
    .line 210
    goto :goto_7

    .line 211
    :cond_6
    new-instance v12, LC3/s;

    .line 212
    .line 213
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v13

    .line 217
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 218
    .line 219
    .line 220
    move-result-object v14

    .line 221
    iget-object v15, v0, LC3/s;->a:Ljava/lang/String;

    .line 222
    .line 223
    iget-boolean v3, v0, LC3/s;->b:Z

    .line 224
    .line 225
    iget-object v4, v0, LC3/s;->c:LC3/p;

    .line 226
    .line 227
    iget-object v0, v0, LC3/s;->d:Ljava/lang/String;

    .line 228
    .line 229
    move-object/from16 v18, v0

    .line 230
    .line 231
    move/from16 v16, v3

    .line 232
    .line 233
    move-object/from16 v17, v4

    .line 234
    .line 235
    invoke-direct/range {v12 .. v18}, LC3/s;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ZLC3/p;Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    iput-object v12, v1, LC3/t;->m0:LC3/s;

    .line 239
    .line 240
    :goto_7
    iget-object v0, v1, LC3/t;->l0:Ljava/util/ArrayDeque;

    .line 241
    .line 242
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 243
    .line 244
    .line 245
    move-result v0

    .line 246
    if-nez v0, :cond_7

    .line 247
    .line 248
    goto/16 :goto_3

    .line 249
    .line 250
    :cond_7
    iget-object v0, v1, LC3/t;->m0:LC3/s;

    .line 251
    .line 252
    throw v0

    .line 253
    :cond_8
    iput-object v10, v1, LC3/t;->l0:Ljava/util/ArrayDeque;

    .line 254
    .line 255
    return-void

    .line 256
    :cond_9
    new-instance v0, LC3/s;

    .line 257
    .line 258
    iget-object v2, v1, LC3/t;->z:Lj3/M;

    .line 259
    .line 260
    const v3, -0xc34f

    .line 261
    .line 262
    .line 263
    invoke-direct {v0, v2, v10, v7, v3}, LC3/s;-><init>(Lj3/M;LC3/y;ZI)V

    .line 264
    .line 265
    .line 266
    throw v0
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
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
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

.method public abstract R(Ljava/lang/Exception;)V
.end method

.method public abstract S(JLjava/lang/String;J)V
.end method

.method public abstract T(Ljava/lang/String;)V
.end method

.method public U(LO0/c;)Lm3/h;
    .locals 12

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LC3/t;->U0:Z

    .line 3
    .line 4
    iget-object v1, p1, LO0/c;->c:Ljava/lang/Object;

    .line 5
    .line 6
    move-object v5, v1

    .line 7
    check-cast v5, Lj3/M;

    .line 8
    .line 9
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    iget-object v2, v5, Lj3/M;->l:Ljava/lang/String;

    .line 14
    .line 15
    if-eqz v2, :cond_22

    .line 16
    .line 17
    iget-object p1, p1, LO0/c;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p1, Ln3/i;

    .line 20
    .line 21
    iget-object v3, p0, LC3/t;->C:Ln3/i;

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    if-ne v3, p1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    if-eqz p1, :cond_1

    .line 28
    .line 29
    invoke-interface {p1, v4}, Ln3/i;->a(Ln3/l;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    if-eqz v3, :cond_2

    .line 33
    .line 34
    invoke-interface {v3, v4}, Ln3/i;->e(Ln3/l;)V

    .line 35
    .line 36
    .line 37
    :cond_2
    :goto_0
    iput-object p1, p0, LC3/t;->C:Ln3/i;

    .line 38
    .line 39
    iput-object v5, p0, LC3/t;->z:Lj3/M;

    .line 40
    .line 41
    iget-boolean v3, p0, LC3/t;->G0:Z

    .line 42
    .line 43
    if-eqz v3, :cond_3

    .line 44
    .line 45
    iput-boolean v0, p0, LC3/t;->I0:Z

    .line 46
    .line 47
    return-object v4

    .line 48
    :cond_3
    iget-object v3, p0, LC3/t;->g0:LC3/m;

    .line 49
    .line 50
    if-nez v3, :cond_4

    .line 51
    .line 52
    iput-object v4, p0, LC3/t;->l0:Ljava/util/ArrayDeque;

    .line 53
    .line 54
    invoke-virtual {p0}, LC3/t;->P()V

    .line 55
    .line 56
    .line 57
    return-object v4

    .line 58
    :cond_4
    iget-object v4, p0, LC3/t;->n0:LC3/p;

    .line 59
    .line 60
    move-object v6, v4

    .line 61
    iget-object v4, p0, LC3/t;->h0:Lj3/M;

    .line 62
    .line 63
    iget-object v7, p0, LC3/t;->B:Ln3/i;

    .line 64
    .line 65
    const/4 v8, 0x3

    .line 66
    const/16 v9, 0x17

    .line 67
    .line 68
    if-ne v7, p1, :cond_5

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_5
    if-eqz p1, :cond_20

    .line 72
    .line 73
    if-nez v7, :cond_6

    .line 74
    .line 75
    goto/16 :goto_b

    .line 76
    .line 77
    :cond_6
    invoke-interface {p1}, Ln3/i;->c()Ljava/util/UUID;

    .line 78
    .line 79
    .line 80
    move-result-object v10

    .line 81
    invoke-interface {v7}, Ln3/i;->c()Ljava/util/UUID;

    .line 82
    .line 83
    .line 84
    move-result-object v11

    .line 85
    invoke-virtual {v10, v11}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v10

    .line 89
    if-nez v10, :cond_7

    .line 90
    .line 91
    goto/16 :goto_b

    .line 92
    .line 93
    :cond_7
    sget v10, Ll4/y;->a:I

    .line 94
    .line 95
    if-ge v10, v9, :cond_8

    .line 96
    .line 97
    goto/16 :goto_b

    .line 98
    .line 99
    :cond_8
    sget-object v10, Lj3/g;->e:Ljava/util/UUID;

    .line 100
    .line 101
    invoke-interface {v7}, Ln3/i;->c()Ljava/util/UUID;

    .line 102
    .line 103
    .line 104
    move-result-object v7

    .line 105
    invoke-virtual {v10, v7}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v7

    .line 109
    if-nez v7, :cond_20

    .line 110
    .line 111
    invoke-interface {p1}, Ln3/i;->c()Ljava/util/UUID;

    .line 112
    .line 113
    .line 114
    move-result-object v7

    .line 115
    invoke-virtual {v10, v7}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v7

    .line 119
    if-eqz v7, :cond_9

    .line 120
    .line 121
    goto/16 :goto_b

    .line 122
    .line 123
    :cond_9
    invoke-virtual {p0, p1}, LC3/t;->L(Ln3/i;)Ln3/w;

    .line 124
    .line 125
    .line 126
    move-result-object v7

    .line 127
    if-nez v7, :cond_a

    .line 128
    .line 129
    goto/16 :goto_b

    .line 130
    .line 131
    :cond_a
    iget-boolean v7, v7, Ln3/w;->c:Z

    .line 132
    .line 133
    if-eqz v7, :cond_b

    .line 134
    .line 135
    move p1, v1

    .line 136
    goto :goto_1

    .line 137
    :cond_b
    invoke-interface {p1, v2}, Ln3/i;->d(Ljava/lang/String;)Z

    .line 138
    .line 139
    .line 140
    move-result p1

    .line 141
    :goto_1
    iget-boolean v2, v6, LC3/p;->f:Z

    .line 142
    .line 143
    if-nez v2, :cond_c

    .line 144
    .line 145
    if-eqz p1, :cond_c

    .line 146
    .line 147
    goto/16 :goto_b

    .line 148
    .line 149
    :cond_c
    :goto_2
    iget-object p1, p0, LC3/t;->C:Ln3/i;

    .line 150
    .line 151
    iget-object v2, p0, LC3/t;->B:Ln3/i;

    .line 152
    .line 153
    if-eq p1, v2, :cond_d

    .line 154
    .line 155
    move p1, v0

    .line 156
    goto :goto_3

    .line 157
    :cond_d
    move p1, v1

    .line 158
    :goto_3
    if-eqz p1, :cond_f

    .line 159
    .line 160
    sget v2, Ll4/y;->a:I

    .line 161
    .line 162
    if-lt v2, v9, :cond_e

    .line 163
    .line 164
    goto :goto_4

    .line 165
    :cond_e
    move v2, v1

    .line 166
    goto :goto_5

    .line 167
    :cond_f
    :goto_4
    move v2, v0

    .line 168
    :goto_5
    invoke-static {v2}, Ll4/a;->m(Z)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {p0, v6, v4, v5}, LC3/t;->z(LC3/p;Lj3/M;Lj3/M;)Lm3/h;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    iget v7, v2, Lm3/h;->d:I

    .line 176
    .line 177
    if-eqz v7, :cond_1b

    .line 178
    .line 179
    const/16 v9, 0x10

    .line 180
    .line 181
    const/4 v10, 0x2

    .line 182
    if-eq v7, v0, :cond_16

    .line 183
    .line 184
    if-eq v7, v10, :cond_12

    .line 185
    .line 186
    if-ne v7, v8, :cond_11

    .line 187
    .line 188
    invoke-virtual {p0, v5}, LC3/t;->m0(Lj3/M;)Z

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    if-nez v0, :cond_10

    .line 193
    .line 194
    :goto_6
    move v1, v9

    .line 195
    goto/16 :goto_a

    .line 196
    .line 197
    :cond_10
    iput-object v5, p0, LC3/t;->h0:Lj3/M;

    .line 198
    .line 199
    if-eqz p1, :cond_1d

    .line 200
    .line 201
    invoke-virtual {p0}, LC3/t;->C()Z

    .line 202
    .line 203
    .line 204
    move-result p1

    .line 205
    if-nez p1, :cond_1d

    .line 206
    .line 207
    :goto_7
    move v1, v10

    .line 208
    goto/16 :goto_a

    .line 209
    .line 210
    :cond_11
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 211
    .line 212
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 213
    .line 214
    .line 215
    throw p1

    .line 216
    :cond_12
    invoke-virtual {p0, v5}, LC3/t;->m0(Lj3/M;)Z

    .line 217
    .line 218
    .line 219
    move-result v11

    .line 220
    if-nez v11, :cond_13

    .line 221
    .line 222
    goto :goto_6

    .line 223
    :cond_13
    iput-boolean v0, p0, LC3/t;->J0:Z

    .line 224
    .line 225
    iput v0, p0, LC3/t;->K0:I

    .line 226
    .line 227
    iget v9, p0, LC3/t;->o0:I

    .line 228
    .line 229
    if-eq v9, v10, :cond_15

    .line 230
    .line 231
    if-ne v9, v0, :cond_14

    .line 232
    .line 233
    iget v9, v4, Lj3/M;->q:I

    .line 234
    .line 235
    iget v11, v5, Lj3/M;->q:I

    .line 236
    .line 237
    if-ne v11, v9, :cond_14

    .line 238
    .line 239
    iget v9, v5, Lj3/M;->r:I

    .line 240
    .line 241
    iget v11, v4, Lj3/M;->r:I

    .line 242
    .line 243
    if-ne v9, v11, :cond_14

    .line 244
    .line 245
    goto :goto_8

    .line 246
    :cond_14
    move v0, v1

    .line 247
    :cond_15
    :goto_8
    iput-boolean v0, p0, LC3/t;->w0:Z

    .line 248
    .line 249
    iput-object v5, p0, LC3/t;->h0:Lj3/M;

    .line 250
    .line 251
    if-eqz p1, :cond_1d

    .line 252
    .line 253
    invoke-virtual {p0}, LC3/t;->C()Z

    .line 254
    .line 255
    .line 256
    move-result p1

    .line 257
    if-nez p1, :cond_1d

    .line 258
    .line 259
    goto :goto_7

    .line 260
    :cond_16
    invoke-virtual {p0, v5}, LC3/t;->m0(Lj3/M;)Z

    .line 261
    .line 262
    .line 263
    move-result v11

    .line 264
    if-nez v11, :cond_17

    .line 265
    .line 266
    goto :goto_6

    .line 267
    :cond_17
    iput-object v5, p0, LC3/t;->h0:Lj3/M;

    .line 268
    .line 269
    if-eqz p1, :cond_18

    .line 270
    .line 271
    invoke-virtual {p0}, LC3/t;->C()Z

    .line 272
    .line 273
    .line 274
    move-result p1

    .line 275
    if-nez p1, :cond_1d

    .line 276
    .line 277
    goto :goto_7

    .line 278
    :cond_18
    iget-boolean p1, p0, LC3/t;->N0:Z

    .line 279
    .line 280
    if-eqz p1, :cond_1d

    .line 281
    .line 282
    iput v0, p0, LC3/t;->L0:I

    .line 283
    .line 284
    iget-boolean p1, p0, LC3/t;->q0:Z

    .line 285
    .line 286
    if-nez p1, :cond_1a

    .line 287
    .line 288
    iget-boolean p1, p0, LC3/t;->s0:Z

    .line 289
    .line 290
    if-eqz p1, :cond_19

    .line 291
    .line 292
    goto :goto_9

    .line 293
    :cond_19
    iput v0, p0, LC3/t;->M0:I

    .line 294
    .line 295
    goto :goto_a

    .line 296
    :cond_1a
    :goto_9
    iput v8, p0, LC3/t;->M0:I

    .line 297
    .line 298
    goto :goto_7

    .line 299
    :cond_1b
    iget-boolean p1, p0, LC3/t;->N0:Z

    .line 300
    .line 301
    if-eqz p1, :cond_1c

    .line 302
    .line 303
    iput v0, p0, LC3/t;->L0:I

    .line 304
    .line 305
    iput v8, p0, LC3/t;->M0:I

    .line 306
    .line 307
    goto :goto_a

    .line 308
    :cond_1c
    invoke-virtual {p0}, LC3/t;->d0()V

    .line 309
    .line 310
    .line 311
    invoke-virtual {p0}, LC3/t;->P()V

    .line 312
    .line 313
    .line 314
    :cond_1d
    :goto_a
    if-eqz v7, :cond_1f

    .line 315
    .line 316
    iget-object p1, p0, LC3/t;->g0:LC3/m;

    .line 317
    .line 318
    if-ne p1, v3, :cond_1e

    .line 319
    .line 320
    iget p1, p0, LC3/t;->M0:I

    .line 321
    .line 322
    if-ne p1, v8, :cond_1f

    .line 323
    .line 324
    :cond_1e
    new-instance v2, Lm3/h;

    .line 325
    .line 326
    iget-object v3, v6, LC3/p;->a:Ljava/lang/String;

    .line 327
    .line 328
    const/4 v6, 0x0

    .line 329
    move v7, v1

    .line 330
    invoke-direct/range {v2 .. v7}, Lm3/h;-><init>(Ljava/lang/String;Lj3/M;Lj3/M;II)V

    .line 331
    .line 332
    .line 333
    :cond_1f
    return-object v2

    .line 334
    :cond_20
    :goto_b
    iget-boolean p1, p0, LC3/t;->N0:Z

    .line 335
    .line 336
    if-eqz p1, :cond_21

    .line 337
    .line 338
    iput v0, p0, LC3/t;->L0:I

    .line 339
    .line 340
    iput v8, p0, LC3/t;->M0:I

    .line 341
    .line 342
    goto :goto_c

    .line 343
    :cond_21
    invoke-virtual {p0}, LC3/t;->d0()V

    .line 344
    .line 345
    .line 346
    invoke-virtual {p0}, LC3/t;->P()V

    .line 347
    .line 348
    .line 349
    :goto_c
    new-instance v2, Lm3/h;

    .line 350
    .line 351
    iget-object v3, v6, LC3/p;->a:Ljava/lang/String;

    .line 352
    .line 353
    const/4 v6, 0x0

    .line 354
    const/16 v7, 0x80

    .line 355
    .line 356
    invoke-direct/range {v2 .. v7}, Lm3/h;-><init>(Ljava/lang/String;Lj3/M;Lj3/M;II)V

    .line 357
    .line 358
    .line 359
    return-object v2

    .line 360
    :cond_22
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 361
    .line 362
    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 363
    .line 364
    .line 365
    const/16 v0, 0xfa5

    .line 366
    .line 367
    invoke-virtual {p0, p1, v5, v1, v0}, Lj3/d;->e(Ljava/lang/Exception;Lj3/M;ZI)Lj3/m;

    .line 368
    .line 369
    .line 370
    move-result-object p1

    .line 371
    throw p1
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
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
.end method

.method public abstract V(Lj3/M;Landroid/media/MediaFormat;)V
.end method

.method public W()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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

.method public X(J)V
    .locals 6

    .line 1
    :goto_0
    iget v0, p0, LC3/t;->a1:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LC3/t;->y:[J

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    aget-wide v2, v0, v1

    .line 9
    .line 10
    cmp-long v2, p1, v2

    .line 11
    .line 12
    if-ltz v2, :cond_0

    .line 13
    .line 14
    iget-object v2, p0, LC3/t;->w:[J

    .line 15
    .line 16
    aget-wide v3, v2, v1

    .line 17
    .line 18
    iput-wide v3, p0, LC3/t;->Y0:J

    .line 19
    .line 20
    iget-object v3, p0, LC3/t;->x:[J

    .line 21
    .line 22
    aget-wide v4, v3, v1

    .line 23
    .line 24
    invoke-virtual {p0, v4, v5}, LC3/t;->i0(J)V

    .line 25
    .line 26
    .line 27
    iget v4, p0, LC3/t;->a1:I

    .line 28
    .line 29
    const/4 v5, 0x1

    .line 30
    sub-int/2addr v4, v5

    .line 31
    iput v4, p0, LC3/t;->a1:I

    .line 32
    .line 33
    invoke-static {v2, v5, v2, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 34
    .line 35
    .line 36
    iget v2, p0, LC3/t;->a1:I

    .line 37
    .line 38
    invoke-static {v3, v5, v3, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 39
    .line 40
    .line 41
    iget v2, p0, LC3/t;->a1:I

    .line 42
    .line 43
    invoke-static {v0, v5, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, LC3/t;->Y()V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    return-void
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

.method public abstract Y()V
.end method

.method public abstract Z(Lm3/f;)V
.end method

.method public final a0()V
    .locals 3

    .line 1
    iget v0, p0, LC3/t;->M0:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq v0, v1, :cond_2

    .line 5
    .line 6
    const/4 v2, 0x2

    .line 7
    if-eq v0, v2, :cond_1

    .line 8
    .line 9
    const/4 v2, 0x3

    .line 10
    if-eq v0, v2, :cond_0

    .line 11
    .line 12
    iput-boolean v1, p0, LC3/t;->T0:Z

    .line 13
    .line 14
    invoke-virtual {p0}, LC3/t;->e0()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-virtual {p0}, LC3/t;->d0()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, LC3/t;->P()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    invoke-virtual {p0}, LC3/t;->F()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, LC3/t;->n0()V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_2
    invoke-virtual {p0}, LC3/t;->F()V

    .line 33
    .line 34
    .line 35
    return-void
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
.end method

.method public abstract b0(JJLC3/m;Ljava/nio/ByteBuffer;IIIJZZLj3/M;)Z
.end method

.method public final c0(I)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lj3/d;->b:LO0/c;

    .line 2
    .line 3
    invoke-virtual {v0}, LO0/c;->j()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LC3/t;->p:Lm3/f;

    .line 7
    .line 8
    invoke-virtual {v1}, Lm3/f;->r()V

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x4

    .line 12
    or-int/2addr p1, v2

    .line 13
    invoke-virtual {p0, v0, v1, p1}, Lj3/d;->r(LO0/c;Lm3/f;I)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    const/4 v3, -0x5

    .line 18
    const/4 v4, 0x1

    .line 19
    if-ne p1, v3, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0, v0}, LC3/t;->U(LO0/c;)Lm3/h;

    .line 22
    .line 23
    .line 24
    return v4

    .line 25
    :cond_0
    const/4 v0, -0x4

    .line 26
    if-ne p1, v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {v1, v2}, LQ0/b;->e(I)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    iput-boolean v4, p0, LC3/t;->S0:Z

    .line 35
    .line 36
    invoke-virtual {p0}, LC3/t;->a0()V

    .line 37
    .line 38
    .line 39
    :cond_1
    const/4 p1, 0x0

    .line 40
    return p1
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
.end method

.method public final d0()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, LC3/t;->g0:LC3/m;

    .line 3
    .line 4
    if-eqz v1, :cond_0

    .line 5
    .line 6
    invoke-interface {v1}, LC3/m;->a()V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, LC3/t;->X0:Lm3/d;

    .line 10
    .line 11
    iget v2, v1, Lm3/d;->b:I

    .line 12
    .line 13
    add-int/lit8 v2, v2, 0x1

    .line 14
    .line 15
    iput v2, v1, Lm3/d;->b:I

    .line 16
    .line 17
    iget-object v1, p0, LC3/t;->n0:LC3/p;

    .line 18
    .line 19
    iget-object v1, v1, LC3/p;->a:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {p0, v1}, LC3/t;->T(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v1

    .line 26
    goto :goto_3

    .line 27
    :cond_0
    :goto_0
    iput-object v0, p0, LC3/t;->g0:LC3/m;

    .line 28
    .line 29
    :try_start_1
    iget-object v1, p0, LC3/t;->D:Landroid/media/MediaCrypto;

    .line 30
    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    invoke-virtual {v1}, Landroid/media/MediaCrypto;->release()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :catchall_1
    move-exception v1

    .line 38
    goto :goto_2

    .line 39
    :cond_1
    :goto_1
    iput-object v0, p0, LC3/t;->D:Landroid/media/MediaCrypto;

    .line 40
    .line 41
    invoke-virtual {p0, v0}, LC3/t;->h0(Ln3/i;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, LC3/t;->g0()V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :goto_2
    iput-object v0, p0, LC3/t;->D:Landroid/media/MediaCrypto;

    .line 49
    .line 50
    invoke-virtual {p0, v0}, LC3/t;->h0(Ln3/i;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, LC3/t;->g0()V

    .line 54
    .line 55
    .line 56
    throw v1

    .line 57
    :goto_3
    iput-object v0, p0, LC3/t;->g0:LC3/m;

    .line 58
    .line 59
    :try_start_2
    iget-object v2, p0, LC3/t;->D:Landroid/media/MediaCrypto;

    .line 60
    .line 61
    if-eqz v2, :cond_2

    .line 62
    .line 63
    invoke-virtual {v2}, Landroid/media/MediaCrypto;->release()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 64
    .line 65
    .line 66
    goto :goto_4

    .line 67
    :catchall_2
    move-exception v1

    .line 68
    goto :goto_5

    .line 69
    :cond_2
    :goto_4
    iput-object v0, p0, LC3/t;->D:Landroid/media/MediaCrypto;

    .line 70
    .line 71
    invoke-virtual {p0, v0}, LC3/t;->h0(Ln3/i;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, LC3/t;->g0()V

    .line 75
    .line 76
    .line 77
    throw v1

    .line 78
    :goto_5
    iput-object v0, p0, LC3/t;->D:Landroid/media/MediaCrypto;

    .line 79
    .line 80
    invoke-virtual {p0, v0}, LC3/t;->h0(Ln3/i;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, LC3/t;->g0()V

    .line 84
    .line 85
    .line 86
    throw v1
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

.method public e0()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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

.method public f0()V
    .locals 5

    .line 1
    const/4 v0, -0x1

    .line 2
    iput v0, p0, LC3/t;->B0:I

    .line 3
    .line 4
    iget-object v1, p0, LC3/t;->q:Lm3/f;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    iput-object v2, v1, Lm3/f;->d:Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    iput v0, p0, LC3/t;->C0:I

    .line 10
    .line 11
    iput-object v2, p0, LC3/t;->D0:Ljava/nio/ByteBuffer;

    .line 12
    .line 13
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    iput-wide v0, p0, LC3/t;->A0:J

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    iput-boolean v2, p0, LC3/t;->O0:Z

    .line 22
    .line 23
    iput-boolean v2, p0, LC3/t;->N0:Z

    .line 24
    .line 25
    iput-boolean v2, p0, LC3/t;->w0:Z

    .line 26
    .line 27
    iput-boolean v2, p0, LC3/t;->x0:Z

    .line 28
    .line 29
    iput-boolean v2, p0, LC3/t;->E0:Z

    .line 30
    .line 31
    iput-boolean v2, p0, LC3/t;->F0:Z

    .line 32
    .line 33
    iget-object v3, p0, LC3/t;->u:Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 36
    .line 37
    .line 38
    iput-wide v0, p0, LC3/t;->Q0:J

    .line 39
    .line 40
    iput-wide v0, p0, LC3/t;->R0:J

    .line 41
    .line 42
    iget-object v0, p0, LC3/t;->z0:LC3/j;

    .line 43
    .line 44
    if-eqz v0, :cond_0

    .line 45
    .line 46
    const-wide/16 v3, 0x0

    .line 47
    .line 48
    iput-wide v3, v0, LC3/j;->a:J

    .line 49
    .line 50
    iput-wide v3, v0, LC3/j;->b:J

    .line 51
    .line 52
    iput-boolean v2, v0, LC3/j;->c:Z

    .line 53
    .line 54
    :cond_0
    iput v2, p0, LC3/t;->L0:I

    .line 55
    .line 56
    iput v2, p0, LC3/t;->M0:I

    .line 57
    .line 58
    iget-boolean v0, p0, LC3/t;->J0:Z

    .line 59
    .line 60
    iput v0, p0, LC3/t;->K0:I

    .line 61
    .line 62
    return-void
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

.method public final g0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, LC3/t;->f0()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, LC3/t;->W0:Lj3/m;

    .line 6
    .line 7
    iput-object v0, p0, LC3/t;->z0:LC3/j;

    .line 8
    .line 9
    iput-object v0, p0, LC3/t;->l0:Ljava/util/ArrayDeque;

    .line 10
    .line 11
    iput-object v0, p0, LC3/t;->n0:LC3/p;

    .line 12
    .line 13
    iput-object v0, p0, LC3/t;->h0:Lj3/M;

    .line 14
    .line 15
    iput-object v0, p0, LC3/t;->i0:Landroid/media/MediaFormat;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput-boolean v0, p0, LC3/t;->j0:Z

    .line 19
    .line 20
    iput-boolean v0, p0, LC3/t;->P0:Z

    .line 21
    .line 22
    const/high16 v1, -0x40800000    # -1.0f

    .line 23
    .line 24
    iput v1, p0, LC3/t;->k0:F

    .line 25
    .line 26
    iput v0, p0, LC3/t;->o0:I

    .line 27
    .line 28
    iput-boolean v0, p0, LC3/t;->p0:Z

    .line 29
    .line 30
    iput-boolean v0, p0, LC3/t;->q0:Z

    .line 31
    .line 32
    iput-boolean v0, p0, LC3/t;->r0:Z

    .line 33
    .line 34
    iput-boolean v0, p0, LC3/t;->s0:Z

    .line 35
    .line 36
    iput-boolean v0, p0, LC3/t;->t0:Z

    .line 37
    .line 38
    iput-boolean v0, p0, LC3/t;->u0:Z

    .line 39
    .line 40
    iput-boolean v0, p0, LC3/t;->v0:Z

    .line 41
    .line 42
    iput-boolean v0, p0, LC3/t;->y0:Z

    .line 43
    .line 44
    iput-boolean v0, p0, LC3/t;->J0:Z

    .line 45
    .line 46
    iput v0, p0, LC3/t;->K0:I

    .line 47
    .line 48
    iput-boolean v0, p0, LC3/t;->X:Z

    .line 49
    .line 50
    return-void
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

.method public final h0(Ln3/i;)V
    .locals 2

    .line 1
    iget-object v0, p0, LC3/t;->B:Ln3/i;

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 v1, 0x0

    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    invoke-interface {p1, v1}, Ln3/i;->a(Ln3/l;)V

    .line 10
    .line 11
    .line 12
    :cond_1
    if-eqz v0, :cond_2

    .line 13
    .line 14
    invoke-interface {v0, v1}, Ln3/i;->e(Ln3/l;)V

    .line 15
    .line 16
    .line 17
    :cond_2
    :goto_0
    iput-object p1, p0, LC3/t;->B:Ln3/i;

    .line 18
    .line 19
    return-void
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

.method public i()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LC3/t;->T0:Z

    .line 2
    .line 3
    return v0
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

.method public final i0(J)V
    .locals 2

    .line 1
    iput-wide p1, p0, LC3/t;->Z0:J

    .line 2
    .line 3
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long p1, p1, v0

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, LC3/t;->W()V

    .line 13
    .line 14
    .line 15
    :cond_0
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public j()Z
    .locals 7

    .line 1
    iget-object v0, p0, LC3/t;->z:Lj3/M;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_3

    .line 5
    .line 6
    invoke-virtual {p0}, Lj3/d;->h()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-boolean v0, p0, Lj3/d;->k:Z

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v0, p0, Lj3/d;->g:LN3/d0;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-interface {v0}, LN3/d0;->j()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    :goto_0
    const/4 v2, 0x1

    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    iget v0, p0, LC3/t;->C0:I

    .line 28
    .line 29
    if-ltz v0, :cond_1

    .line 30
    .line 31
    move v0, v2

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move v0, v1

    .line 34
    :goto_1
    if-nez v0, :cond_2

    .line 35
    .line 36
    iget-wide v3, p0, LC3/t;->A0:J

    .line 37
    .line 38
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    cmp-long v0, v3, v5

    .line 44
    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 48
    .line 49
    .line 50
    move-result-wide v3

    .line 51
    iget-wide v5, p0, LC3/t;->A0:J

    .line 52
    .line 53
    cmp-long v0, v3, v5

    .line 54
    .line 55
    if-gez v0, :cond_3

    .line 56
    .line 57
    :cond_2
    return v2

    .line 58
    :cond_3
    return v1
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

.method public j0(LC3/p;)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
    .line 3
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public k()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, LC3/t;->z:Lj3/M;

    .line 3
    .line 4
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    iput-wide v0, p0, LC3/t;->Y0:J

    .line 10
    .line 11
    invoke-virtual {p0, v0, v1}, LC3/t;->i0(J)V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput v0, p0, LC3/t;->a1:I

    .line 16
    .line 17
    invoke-virtual {p0}, LC3/t;->G()Z

    .line 18
    .line 19
    .line 20
    return-void
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

.method public k0(Lj3/M;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
    .line 3
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public abstract l0(LC3/u;Lj3/M;)I
.end method

.method public m(JZ)V
    .locals 3

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, LC3/t;->S0:Z

    .line 3
    .line 4
    iput-boolean p1, p0, LC3/t;->T0:Z

    .line 5
    .line 6
    iput-boolean p1, p0, LC3/t;->V0:Z

    .line 7
    .line 8
    iget-boolean p2, p0, LC3/t;->G0:Z

    .line 9
    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    iget-object p2, p0, LC3/t;->s:LC3/i;

    .line 13
    .line 14
    invoke-virtual {p2}, LC3/i;->r()V

    .line 15
    .line 16
    .line 17
    iget-object p2, p0, LC3/t;->r:Lm3/f;

    .line 18
    .line 19
    invoke-virtual {p2}, Lm3/f;->r()V

    .line 20
    .line 21
    .line 22
    iput-boolean p1, p0, LC3/t;->H0:Z

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {p0}, LC3/t;->G()Z

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    if-eqz p2, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0}, LC3/t;->P()V

    .line 32
    .line 33
    .line 34
    :cond_1
    :goto_0
    iget-object p2, p0, LC3/t;->t:LK5/p;

    .line 35
    .line 36
    monitor-enter p2

    .line 37
    :try_start_0
    iget p3, p2, LK5/p;->b:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    monitor-exit p2

    .line 40
    const/4 p2, 0x1

    .line 41
    if-lez p3, :cond_2

    .line 42
    .line 43
    iput-boolean p2, p0, LC3/t;->U0:Z

    .line 44
    .line 45
    :cond_2
    iget-object p3, p0, LC3/t;->t:LK5/p;

    .line 46
    .line 47
    invoke-virtual {p3}, LK5/p;->b()V

    .line 48
    .line 49
    .line 50
    iget p3, p0, LC3/t;->a1:I

    .line 51
    .line 52
    if-eqz p3, :cond_3

    .line 53
    .line 54
    iget-object v0, p0, LC3/t;->x:[J

    .line 55
    .line 56
    sub-int/2addr p3, p2

    .line 57
    aget-wide v1, v0, p3

    .line 58
    .line 59
    invoke-virtual {p0, v1, v2}, LC3/t;->i0(J)V

    .line 60
    .line 61
    .line 62
    iget-object p3, p0, LC3/t;->w:[J

    .line 63
    .line 64
    iget v0, p0, LC3/t;->a1:I

    .line 65
    .line 66
    sub-int/2addr v0, p2

    .line 67
    aget-wide p2, p3, v0

    .line 68
    .line 69
    iput-wide p2, p0, LC3/t;->Y0:J

    .line 70
    .line 71
    iput p1, p0, LC3/t;->a1:I

    .line 72
    .line 73
    :cond_3
    return-void

    .line 74
    :catchall_0
    move-exception p1

    .line 75
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 76
    throw p1
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

.method public final m0(Lj3/M;)Z
    .locals 5

    .line 1
    sget p1, Ll4/y;->a:I

    .line 2
    .line 3
    const/16 v0, 0x17

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-ge p1, v0, :cond_0

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_0
    iget-object p1, p0, LC3/t;->g0:LC3/m;

    .line 10
    .line 11
    if-eqz p1, :cond_6

    .line 12
    .line 13
    iget p1, p0, LC3/t;->M0:I

    .line 14
    .line 15
    const/4 v0, 0x3

    .line 16
    if-eq p1, v0, :cond_6

    .line 17
    .line 18
    iget p1, p0, Lj3/d;->f:I

    .line 19
    .line 20
    if-nez p1, :cond_1

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    iget p1, p0, LC3/t;->f0:F

    .line 24
    .line 25
    iget-object v2, p0, Lj3/d;->h:[Lj3/M;

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, p1, v2}, LC3/t;->J(F[Lj3/M;)F

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    iget v2, p0, LC3/t;->k0:F

    .line 35
    .line 36
    cmpl-float v3, v2, p1

    .line 37
    .line 38
    if-nez v3, :cond_2

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    const/high16 v3, -0x40800000    # -1.0f

    .line 42
    .line 43
    cmpl-float v4, p1, v3

    .line 44
    .line 45
    if-nez v4, :cond_4

    .line 46
    .line 47
    iget-boolean p1, p0, LC3/t;->N0:Z

    .line 48
    .line 49
    if-eqz p1, :cond_3

    .line 50
    .line 51
    iput v1, p0, LC3/t;->L0:I

    .line 52
    .line 53
    iput v0, p0, LC3/t;->M0:I

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_3
    invoke-virtual {p0}, LC3/t;->d0()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, LC3/t;->P()V

    .line 60
    .line 61
    .line 62
    :goto_0
    const/4 p1, 0x0

    .line 63
    return p1

    .line 64
    :cond_4
    cmpl-float v0, v2, v3

    .line 65
    .line 66
    if-nez v0, :cond_5

    .line 67
    .line 68
    iget v0, p0, LC3/t;->o:F

    .line 69
    .line 70
    cmpl-float v0, p1, v0

    .line 71
    .line 72
    if-lez v0, :cond_6

    .line 73
    .line 74
    :cond_5
    new-instance v0, Landroid/os/Bundle;

    .line 75
    .line 76
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 77
    .line 78
    .line 79
    const-string v2, "operating-rate"

    .line 80
    .line 81
    invoke-virtual {v0, v2, p1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 82
    .line 83
    .line 84
    iget-object v2, p0, LC3/t;->g0:LC3/m;

    .line 85
    .line 86
    invoke-interface {v2, v0}, LC3/m;->s(Landroid/os/Bundle;)V

    .line 87
    .line 88
    .line 89
    iput p1, p0, LC3/t;->k0:F

    .line 90
    .line 91
    :cond_6
    :goto_1
    return v1
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
.end method

.method public final n0()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, LC3/t;->D:Landroid/media/MediaCrypto;

    .line 3
    .line 4
    iget-object v2, p0, LC3/t;->C:Ln3/i;

    .line 5
    .line 6
    invoke-virtual {p0, v2}, LC3/t;->L(Ln3/i;)Ln3/w;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    iget-object v2, v2, Ln3/w;->b:[B

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Landroid/media/MediaCrypto;->setMediaDrmSession([B)V
    :try_end_0
    .catch Landroid/media/MediaCryptoException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, LC3/t;->C:Ln3/i;

    .line 16
    .line 17
    invoke-virtual {p0, v1}, LC3/t;->h0(Ln3/i;)V

    .line 18
    .line 19
    .line 20
    iput v0, p0, LC3/t;->L0:I

    .line 21
    .line 22
    iput v0, p0, LC3/t;->M0:I

    .line 23
    .line 24
    return-void

    .line 25
    :catch_0
    move-exception v1

    .line 26
    iget-object v2, p0, LC3/t;->z:Lj3/M;

    .line 27
    .line 28
    const/16 v3, 0x1776

    .line 29
    .line 30
    invoke-virtual {p0, v1, v2, v0, v3}, Lj3/d;->e(Ljava/lang/Exception;Lj3/M;ZI)Lj3/m;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    throw v0
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
.end method

.method public final o0(J)V
    .locals 1

    .line 1
    iget-object v0, p0, LC3/t;->t:LK5/p;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LK5/p;->e(J)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lj3/M;

    .line 8
    .line 9
    if-nez p1, :cond_1

    .line 10
    .line 11
    iget-boolean p2, p0, LC3/t;->j0:Z

    .line 12
    .line 13
    if-eqz p2, :cond_1

    .line 14
    .line 15
    iget-object p2, p0, LC3/t;->t:LK5/p;

    .line 16
    .line 17
    monitor-enter p2

    .line 18
    :try_start_0
    iget p1, p2, LK5/p;->b:I

    .line 19
    .line 20
    if-nez p1, :cond_0

    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {p2}, LK5/p;->f()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    :goto_0
    monitor-exit p2

    .line 29
    check-cast p1, Lj3/M;

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    throw p1

    .line 35
    :cond_1
    :goto_1
    if-eqz p1, :cond_2

    .line 36
    .line 37
    iput-object p1, p0, LC3/t;->A:Lj3/M;

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_2
    iget-boolean p1, p0, LC3/t;->j0:Z

    .line 41
    .line 42
    if-eqz p1, :cond_3

    .line 43
    .line 44
    iget-object p1, p0, LC3/t;->A:Lj3/M;

    .line 45
    .line 46
    if-eqz p1, :cond_3

    .line 47
    .line 48
    :goto_2
    iget-object p1, p0, LC3/t;->A:Lj3/M;

    .line 49
    .line 50
    iget-object p2, p0, LC3/t;->i0:Landroid/media/MediaFormat;

    .line 51
    .line 52
    invoke-virtual {p0, p1, p2}, LC3/t;->V(Lj3/M;Landroid/media/MediaFormat;)V

    .line 53
    .line 54
    .line 55
    const/4 p1, 0x0

    .line 56
    iput-boolean p1, p0, LC3/t;->j0:Z

    .line 57
    .line 58
    :cond_3
    return-void
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

.method public final q([Lj3/M;JJ)V
    .locals 6

    .line 1
    iget-wide v0, p0, LC3/t;->Z0:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long p1, v0, v2

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    if-nez p1, :cond_1

    .line 12
    .line 13
    iget-wide v4, p0, LC3/t;->Y0:J

    .line 14
    .line 15
    cmp-long p1, v4, v2

    .line 16
    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    :goto_0
    invoke-static {v0}, Ll4/a;->m(Z)V

    .line 22
    .line 23
    .line 24
    iput-wide p2, p0, LC3/t;->Y0:J

    .line 25
    .line 26
    invoke-virtual {p0, p4, p5}, LC3/t;->i0(J)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    iget p1, p0, LC3/t;->a1:I

    .line 31
    .line 32
    iget-object v1, p0, LC3/t;->x:[J

    .line 33
    .line 34
    array-length v2, v1

    .line 35
    if-ne p1, v2, :cond_2

    .line 36
    .line 37
    new-instance p1, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    const-string v2, "Too many stream changes, so dropping offset: "

    .line 40
    .line 41
    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    iget v2, p0, LC3/t;->a1:I

    .line 45
    .line 46
    sub-int/2addr v2, v0

    .line 47
    aget-wide v2, v1, v2

    .line 48
    .line 49
    invoke-virtual {p1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    const-string v2, "MediaCodecRenderer"

    .line 57
    .line 58
    invoke-static {v2, p1}, Ll4/a;->P(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    add-int/2addr p1, v0

    .line 63
    iput p1, p0, LC3/t;->a1:I

    .line 64
    .line 65
    :goto_1
    iget p1, p0, LC3/t;->a1:I

    .line 66
    .line 67
    sub-int/2addr p1, v0

    .line 68
    iget-object v0, p0, LC3/t;->w:[J

    .line 69
    .line 70
    aput-wide p2, v0, p1

    .line 71
    .line 72
    aput-wide p4, v1, p1

    .line 73
    .line 74
    iget-wide p2, p0, LC3/t;->Q0:J

    .line 75
    .line 76
    iget-object p4, p0, LC3/t;->y:[J

    .line 77
    .line 78
    aput-wide p2, p4, p1

    .line 79
    .line 80
    return-void
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

.method public final s(JJ)V
    .locals 11

    .line 1
    iget-boolean v0, p0, LC3/t;->V0:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iput-boolean v1, p0, LC3/t;->V0:Z

    .line 7
    .line 8
    invoke-virtual {p0}, LC3/t;->a0()V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, LC3/t;->W0:Lj3/m;

    .line 12
    .line 13
    if-nez v0, :cond_11

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    :try_start_0
    iget-boolean v2, p0, LC3/t;->T0:Z

    .line 17
    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0}, LC3/t;->e0()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :catch_0
    move-exception p1

    .line 25
    goto/16 :goto_8

    .line 26
    .line 27
    :cond_1
    iget-object v2, p0, LC3/t;->z:Lj3/M;

    .line 28
    .line 29
    if-nez v2, :cond_2

    .line 30
    .line 31
    const/4 v2, 0x2

    .line 32
    invoke-virtual {p0, v2}, LC3/t;->c0(I)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-nez v2, :cond_2

    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    invoke-virtual {p0}, LC3/t;->P()V

    .line 40
    .line 41
    .line 42
    iget-boolean v2, p0, LC3/t;->G0:Z

    .line 43
    .line 44
    if-eqz v2, :cond_4

    .line 45
    .line 46
    const-string v2, "bypassRender"

    .line 47
    .line 48
    invoke-static {v2}, Ll4/a;->c(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    :goto_0
    invoke-virtual {p0, p1, p2, p3, p4}, LC3/t;->y(JJ)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_3

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_3
    invoke-static {}, Ll4/a;->v()V

    .line 59
    .line 60
    .line 61
    goto/16 :goto_7

    .line 62
    .line 63
    :cond_4
    iget-object v2, p0, LC3/t;->g0:LC3/m;

    .line 64
    .line 65
    if-eqz v2, :cond_b

    .line 66
    .line 67
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 68
    .line 69
    .line 70
    move-result-wide v2

    .line 71
    const-string v4, "drainAndFeed"

    .line 72
    .line 73
    invoke-static {v4}, Ll4/a;->c(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    :goto_1
    invoke-virtual {p0, p1, p2, p3, p4}, LC3/t;->D(JJ)Z

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    if-eqz v4, :cond_7

    .line 86
    .line 87
    iget-wide v7, p0, LC3/t;->Y:J

    .line 88
    .line 89
    cmp-long v4, v7, v5

    .line 90
    .line 91
    if-eqz v4, :cond_6

    .line 92
    .line 93
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 94
    .line 95
    .line 96
    move-result-wide v9

    .line 97
    sub-long/2addr v9, v2

    .line 98
    cmp-long v4, v9, v7

    .line 99
    .line 100
    if-gez v4, :cond_5

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_5
    move v4, v1

    .line 104
    goto :goto_3

    .line 105
    :cond_6
    :goto_2
    move v4, v0

    .line 106
    :goto_3
    if-eqz v4, :cond_7

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_7
    :goto_4
    invoke-virtual {p0}, LC3/t;->E()Z

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    if-eqz p1, :cond_a

    .line 114
    .line 115
    iget-wide p1, p0, LC3/t;->Y:J

    .line 116
    .line 117
    cmp-long p3, p1, v5

    .line 118
    .line 119
    if-eqz p3, :cond_9

    .line 120
    .line 121
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 122
    .line 123
    .line 124
    move-result-wide p3

    .line 125
    sub-long/2addr p3, v2

    .line 126
    cmp-long p1, p3, p1

    .line 127
    .line 128
    if-gez p1, :cond_8

    .line 129
    .line 130
    goto :goto_5

    .line 131
    :cond_8
    move p1, v1

    .line 132
    goto :goto_6

    .line 133
    :cond_9
    :goto_5
    move p1, v0

    .line 134
    :goto_6
    if-eqz p1, :cond_a

    .line 135
    .line 136
    goto :goto_4

    .line 137
    :cond_a
    invoke-static {}, Ll4/a;->v()V

    .line 138
    .line 139
    .line 140
    goto :goto_7

    .line 141
    :cond_b
    iget-object p3, p0, LC3/t;->X0:Lm3/d;

    .line 142
    .line 143
    iget p4, p3, Lm3/d;->d:I

    .line 144
    .line 145
    iget-object v2, p0, Lj3/d;->g:LN3/d0;

    .line 146
    .line 147
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    iget-wide v3, p0, Lj3/d;->i:J

    .line 151
    .line 152
    sub-long/2addr p1, v3

    .line 153
    invoke-interface {v2, p1, p2}, LN3/d0;->m(J)I

    .line 154
    .line 155
    .line 156
    move-result p1

    .line 157
    add-int/2addr p4, p1

    .line 158
    iput p4, p3, Lm3/d;->d:I

    .line 159
    .line 160
    invoke-virtual {p0, v0}, LC3/t;->c0(I)Z

    .line 161
    .line 162
    .line 163
    :goto_7
    iget-object p1, p0, LC3/t;->X0:Lm3/d;

    .line 164
    .line 165
    monitor-enter p1

    .line 166
    monitor-exit p1
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 167
    return-void

    .line 168
    :goto_8
    sget p2, Ll4/y;->a:I

    .line 169
    .line 170
    const/16 p3, 0x15

    .line 171
    .line 172
    if-lt p2, p3, :cond_c

    .line 173
    .line 174
    instance-of p4, p1, Landroid/media/MediaCodec$CodecException;

    .line 175
    .line 176
    if-eqz p4, :cond_c

    .line 177
    .line 178
    goto :goto_9

    .line 179
    :cond_c
    invoke-virtual {p1}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 180
    .line 181
    .line 182
    move-result-object p4

    .line 183
    array-length v2, p4

    .line 184
    if-lez v2, :cond_10

    .line 185
    .line 186
    aget-object p4, p4, v1

    .line 187
    .line 188
    invoke-virtual {p4}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object p4

    .line 192
    const-string v2, "android.media.MediaCodec"

    .line 193
    .line 194
    invoke-virtual {p4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result p4

    .line 198
    if-eqz p4, :cond_10

    .line 199
    .line 200
    :goto_9
    invoke-virtual {p0, p1}, LC3/t;->R(Ljava/lang/Exception;)V

    .line 201
    .line 202
    .line 203
    if-lt p2, p3, :cond_e

    .line 204
    .line 205
    instance-of p2, p1, Landroid/media/MediaCodec$CodecException;

    .line 206
    .line 207
    if-eqz p2, :cond_d

    .line 208
    .line 209
    move-object p2, p1

    .line 210
    check-cast p2, Landroid/media/MediaCodec$CodecException;

    .line 211
    .line 212
    invoke-virtual {p2}, Landroid/media/MediaCodec$CodecException;->isRecoverable()Z

    .line 213
    .line 214
    .line 215
    move-result p2

    .line 216
    goto :goto_a

    .line 217
    :cond_d
    move p2, v1

    .line 218
    :goto_a
    if-eqz p2, :cond_e

    .line 219
    .line 220
    move v1, v0

    .line 221
    :cond_e
    if-eqz v1, :cond_f

    .line 222
    .line 223
    invoke-virtual {p0}, LC3/t;->d0()V

    .line 224
    .line 225
    .line 226
    :cond_f
    iget-object p2, p0, LC3/t;->n0:LC3/p;

    .line 227
    .line 228
    invoke-virtual {p0, p1, p2}, LC3/t;->A(Ljava/lang/IllegalStateException;LC3/p;)LC3/n;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    iget-object p2, p0, LC3/t;->z:Lj3/M;

    .line 233
    .line 234
    const/16 p3, 0xfa3

    .line 235
    .line 236
    invoke-virtual {p0, p1, p2, v1, p3}, Lj3/d;->e(Ljava/lang/Exception;Lj3/M;ZI)Lj3/m;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    throw p1

    .line 241
    :cond_10
    throw p1

    .line 242
    :cond_11
    const/4 p1, 0x0

    .line 243
    iput-object p1, p0, LC3/t;->W0:Lj3/m;

    .line 244
    .line 245
    throw v0
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
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
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

.method public v(FF)V
    .locals 0

    .line 1
    iput p1, p0, LC3/t;->Z:F

    .line 2
    .line 3
    iput p2, p0, LC3/t;->f0:F

    .line 4
    .line 5
    iget-object p1, p0, LC3/t;->h0:Lj3/M;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, LC3/t;->m0(Lj3/M;)Z

    .line 8
    .line 9
    .line 10
    return-void
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

.method public final w(Lj3/M;)I
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, LC3/t;->n:LC3/u;

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, LC3/t;->l0(LC3/u;Lj3/M;)I

    .line 4
    .line 5
    .line 6
    move-result p1
    :try_end_0
    .catch LC3/y; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return p1

    .line 8
    :catch_0
    move-exception v0

    .line 9
    const/16 v1, 0xfa2

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-virtual {p0, v0, p1, v2, v1}, Lj3/d;->e(Ljava/lang/Exception;Lj3/M;ZI)Lj3/m;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    throw p1
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

.method public final x()I
    .locals 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    return v0
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

.method public final y(JJ)Z
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-boolean v1, v0, LC3/t;->T0:Z

    .line 4
    .line 5
    const/4 v15, 0x1

    .line 6
    xor-int/2addr v1, v15

    .line 7
    invoke-static {v1}, Ll4/a;->m(Z)V

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, LC3/t;->s:LC3/i;

    .line 11
    .line 12
    iget v9, v1, LC3/i;->j:I

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-lez v9, :cond_0

    .line 16
    .line 17
    move v3, v15

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v3, v2

    .line 20
    :goto_0
    const/4 v4, 0x4

    .line 21
    if-eqz v3, :cond_2

    .line 22
    .line 23
    iget-object v6, v1, Lm3/f;->d:Ljava/nio/ByteBuffer;

    .line 24
    .line 25
    iget v7, v0, LC3/t;->C0:I

    .line 26
    .line 27
    iget-wide v10, v1, Lm3/f;->f:J

    .line 28
    .line 29
    const/high16 v3, -0x80000000

    .line 30
    .line 31
    invoke-virtual {v1, v3}, LQ0/b;->e(I)Z

    .line 32
    .line 33
    .line 34
    move-result v12

    .line 35
    invoke-virtual {v1, v4}, LQ0/b;->e(I)Z

    .line 36
    .line 37
    .line 38
    move-result v13

    .line 39
    iget-object v14, v0, LC3/t;->A:Lj3/M;

    .line 40
    .line 41
    const/4 v5, 0x0

    .line 42
    const/4 v8, 0x0

    .line 43
    move-wide/from16 v3, p3

    .line 44
    .line 45
    move-object v15, v1

    .line 46
    move-wide/from16 v1, p1

    .line 47
    .line 48
    invoke-virtual/range {v0 .. v14}, LC3/t;->b0(JJLC3/m;Ljava/nio/ByteBuffer;IIIJZZLj3/M;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_1

    .line 53
    .line 54
    iget-wide v1, v15, LC3/i;->i:J

    .line 55
    .line 56
    invoke-virtual {v0, v1, v2}, LC3/t;->X(J)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v15}, LC3/i;->r()V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_1
    const/4 v1, 0x0

    .line 64
    goto/16 :goto_3

    .line 65
    .line 66
    :cond_2
    move-object v15, v1

    .line 67
    :goto_1
    iget-boolean v1, v0, LC3/t;->S0:Z

    .line 68
    .line 69
    if-eqz v1, :cond_3

    .line 70
    .line 71
    const/4 v1, 0x1

    .line 72
    iput-boolean v1, v0, LC3/t;->T0:Z

    .line 73
    .line 74
    const/4 v1, 0x0

    .line 75
    return v1

    .line 76
    :cond_3
    const/4 v1, 0x0

    .line 77
    iget-boolean v2, v0, LC3/t;->H0:Z

    .line 78
    .line 79
    iget-object v3, v0, LC3/t;->r:Lm3/f;

    .line 80
    .line 81
    if-eqz v2, :cond_4

    .line 82
    .line 83
    invoke-virtual {v15, v3}, LC3/i;->v(Lm3/f;)Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    invoke-static {v2}, Ll4/a;->m(Z)V

    .line 88
    .line 89
    .line 90
    iput-boolean v1, v0, LC3/t;->H0:Z

    .line 91
    .line 92
    :cond_4
    iget-boolean v2, v0, LC3/t;->I0:Z

    .line 93
    .line 94
    if-eqz v2, :cond_6

    .line 95
    .line 96
    iget v2, v15, LC3/i;->j:I

    .line 97
    .line 98
    if-lez v2, :cond_5

    .line 99
    .line 100
    const/16 v16, 0x1

    .line 101
    .line 102
    return v16

    .line 103
    :cond_5
    const/16 v16, 0x1

    .line 104
    .line 105
    invoke-virtual {v0}, LC3/t;->B()V

    .line 106
    .line 107
    .line 108
    iput-boolean v1, v0, LC3/t;->I0:Z

    .line 109
    .line 110
    invoke-virtual {v0}, LC3/t;->P()V

    .line 111
    .line 112
    .line 113
    iget-boolean v2, v0, LC3/t;->G0:Z

    .line 114
    .line 115
    if-nez v2, :cond_7

    .line 116
    .line 117
    goto/16 :goto_3

    .line 118
    .line 119
    :cond_6
    const/16 v16, 0x1

    .line 120
    .line 121
    :cond_7
    iget-boolean v2, v0, LC3/t;->S0:Z

    .line 122
    .line 123
    xor-int/lit8 v2, v2, 0x1

    .line 124
    .line 125
    invoke-static {v2}, Ll4/a;->m(Z)V

    .line 126
    .line 127
    .line 128
    iget-object v2, v0, Lj3/d;->b:LO0/c;

    .line 129
    .line 130
    invoke-virtual {v2}, LO0/c;->j()V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v3}, Lm3/f;->r()V

    .line 134
    .line 135
    .line 136
    :cond_8
    invoke-virtual {v3}, Lm3/f;->r()V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, v2, v3, v1}, Lj3/d;->r(LO0/c;Lm3/f;I)I

    .line 140
    .line 141
    .line 142
    move-result v4

    .line 143
    const/4 v5, -0x5

    .line 144
    if-eq v4, v5, :cond_d

    .line 145
    .line 146
    const/4 v5, -0x4

    .line 147
    if-eq v4, v5, :cond_a

    .line 148
    .line 149
    const/4 v2, -0x3

    .line 150
    if-ne v4, v2, :cond_9

    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_9
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 154
    .line 155
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 156
    .line 157
    .line 158
    throw v1

    .line 159
    :cond_a
    const/4 v4, 0x4

    .line 160
    invoke-virtual {v3, v4}, LQ0/b;->e(I)Z

    .line 161
    .line 162
    .line 163
    move-result v5

    .line 164
    if-eqz v5, :cond_b

    .line 165
    .line 166
    const/4 v5, 0x1

    .line 167
    iput-boolean v5, v0, LC3/t;->S0:Z

    .line 168
    .line 169
    goto :goto_2

    .line 170
    :cond_b
    iget-boolean v5, v0, LC3/t;->U0:Z

    .line 171
    .line 172
    if-eqz v5, :cond_c

    .line 173
    .line 174
    iget-object v5, v0, LC3/t;->z:Lj3/M;

    .line 175
    .line 176
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    iput-object v5, v0, LC3/t;->A:Lj3/M;

    .line 180
    .line 181
    const/4 v6, 0x0

    .line 182
    invoke-virtual {v0, v5, v6}, LC3/t;->V(Lj3/M;Landroid/media/MediaFormat;)V

    .line 183
    .line 184
    .line 185
    iput-boolean v1, v0, LC3/t;->U0:Z

    .line 186
    .line 187
    :cond_c
    invoke-virtual {v3}, Lm3/f;->u()V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v15, v3}, LC3/i;->v(Lm3/f;)Z

    .line 191
    .line 192
    .line 193
    move-result v5

    .line 194
    if-nez v5, :cond_8

    .line 195
    .line 196
    const/4 v5, 0x1

    .line 197
    iput-boolean v5, v0, LC3/t;->H0:Z

    .line 198
    .line 199
    goto :goto_2

    .line 200
    :cond_d
    invoke-virtual {v0, v2}, LC3/t;->U(LO0/c;)Lm3/h;

    .line 201
    .line 202
    .line 203
    :goto_2
    iget v2, v15, LC3/i;->j:I

    .line 204
    .line 205
    if-lez v2, :cond_e

    .line 206
    .line 207
    invoke-virtual {v15}, Lm3/f;->u()V

    .line 208
    .line 209
    .line 210
    :cond_e
    iget v2, v15, LC3/i;->j:I

    .line 211
    .line 212
    if-lez v2, :cond_f

    .line 213
    .line 214
    const/16 v16, 0x1

    .line 215
    .line 216
    return v16

    .line 217
    :cond_f
    const/16 v16, 0x1

    .line 218
    .line 219
    iget-boolean v2, v0, LC3/t;->S0:Z

    .line 220
    .line 221
    if-nez v2, :cond_11

    .line 222
    .line 223
    iget-boolean v2, v0, LC3/t;->I0:Z

    .line 224
    .line 225
    if-eqz v2, :cond_10

    .line 226
    .line 227
    goto :goto_4

    .line 228
    :cond_10
    :goto_3
    return v1

    .line 229
    :cond_11
    :goto_4
    return v16
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
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
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

.method public abstract z(LC3/p;Lj3/M;Lj3/M;)Lm3/h;
.end method
