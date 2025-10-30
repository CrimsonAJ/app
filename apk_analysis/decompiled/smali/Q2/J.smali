.class public final LQ2/J;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lcom/anilab/exoplayer/StyledPlayerView;


# direct methods
.method public constructor <init>(Lcom/anilab/exoplayer/StyledPlayerView;)V
    .locals 0

    .line 1
    iput-object p1, p0, LQ2/J;->a:Lcom/anilab/exoplayer/StyledPlayerView;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method


# virtual methods
.method public final onDoubleTap(Landroid/view/MotionEvent;)Z
    .locals 9

    .line 1
    iget-object v0, p0, LQ2/J;->a:Lcom/anilab/exoplayer/StyledPlayerView;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/anilab/exoplayer/StyledPlayerView;->o:Lj3/r0;

    .line 4
    .line 5
    if-eqz v1, :cond_6

    .line 6
    .line 7
    check-cast v1, LD/n;

    .line 8
    .line 9
    invoke-virtual {v1}, LD/n;->d0()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-virtual {v0}, Landroid/view/View;->getPivotX()F

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    cmpl-float p1, p1, v1

    .line 25
    .line 26
    const-wide/16 v1, 0x0

    .line 27
    .line 28
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    if-lez p1, :cond_3

    .line 34
    .line 35
    iget-object p1, v0, Lcom/anilab/exoplayer/StyledPlayerView;->m:Landroid/view/View;

    .line 36
    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    invoke-static {v0, p1}, Lcom/anilab/exoplayer/StyledPlayerView;->a(Lcom/anilab/exoplayer/StyledPlayerView;Landroid/view/View;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    iget-object p1, v0, Lcom/anilab/exoplayer/StyledPlayerView;->o:Lj3/r0;

    .line 43
    .line 44
    check-cast p1, LD/n;

    .line 45
    .line 46
    invoke-interface {p1}, Lj3/r0;->i()J

    .line 47
    .line 48
    .line 49
    move-result-wide v5

    .line 50
    invoke-interface {p1}, Lj3/r0;->T()J

    .line 51
    .line 52
    .line 53
    move-result-wide v7

    .line 54
    add-long/2addr v7, v5

    .line 55
    invoke-interface {p1}, Lj3/r0;->H()J

    .line 56
    .line 57
    .line 58
    move-result-wide v5

    .line 59
    cmp-long v0, v5, v3

    .line 60
    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    invoke-static {v7, v8, v5, v6}, Ljava/lang/Math;->min(JJ)J

    .line 64
    .line 65
    .line 66
    move-result-wide v7

    .line 67
    :cond_2
    invoke-static {v7, v8, v1, v2}, Ljava/lang/Math;->max(JJ)J

    .line 68
    .line 69
    .line 70
    move-result-wide v0

    .line 71
    invoke-interface {p1}, Lj3/r0;->z()I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    invoke-interface {p1, v0, v1, v2}, Lj3/r0;->Q(JI)V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_3
    iget-object p1, v0, Lcom/anilab/exoplayer/StyledPlayerView;->n:Landroid/view/View;

    .line 80
    .line 81
    if-eqz p1, :cond_4

    .line 82
    .line 83
    invoke-static {v0, p1}, Lcom/anilab/exoplayer/StyledPlayerView;->a(Lcom/anilab/exoplayer/StyledPlayerView;Landroid/view/View;)V

    .line 84
    .line 85
    .line 86
    :cond_4
    iget-object p1, v0, Lcom/anilab/exoplayer/StyledPlayerView;->o:Lj3/r0;

    .line 87
    .line 88
    check-cast p1, LD/n;

    .line 89
    .line 90
    invoke-interface {p1}, Lj3/r0;->U()J

    .line 91
    .line 92
    .line 93
    move-result-wide v5

    .line 94
    neg-long v5, v5

    .line 95
    invoke-interface {p1}, Lj3/r0;->T()J

    .line 96
    .line 97
    .line 98
    move-result-wide v7

    .line 99
    add-long/2addr v7, v5

    .line 100
    invoke-interface {p1}, Lj3/r0;->H()J

    .line 101
    .line 102
    .line 103
    move-result-wide v5

    .line 104
    cmp-long v0, v5, v3

    .line 105
    .line 106
    if-eqz v0, :cond_5

    .line 107
    .line 108
    invoke-static {v7, v8, v5, v6}, Ljava/lang/Math;->min(JJ)J

    .line 109
    .line 110
    .line 111
    move-result-wide v7

    .line 112
    :cond_5
    invoke-static {v7, v8, v1, v2}, Ljava/lang/Math;->max(JJ)J

    .line 113
    .line 114
    .line 115
    move-result-wide v0

    .line 116
    invoke-interface {p1}, Lj3/r0;->z()I

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    invoke-interface {p1, v0, v1, v2}, Lj3/r0;->Q(JI)V

    .line 121
    .line 122
    .line 123
    :goto_0
    const/4 p1, 0x1

    .line 124
    return p1

    .line 125
    :cond_6
    :goto_1
    const/4 p1, 0x0

    .line 126
    return p1
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
.end method

.method public final onSingleTapConfirmed(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    sget p1, Lcom/anilab/exoplayer/StyledPlayerView;->D:I

    .line 2
    .line 3
    iget-object p1, p0, LQ2/J;->a:Lcom/anilab/exoplayer/StyledPlayerView;

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/anilab/exoplayer/StyledPlayerView;->m()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    iget-object v0, p1, Lcom/anilab/exoplayer/StyledPlayerView;->o:Lj3/r0;

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object v0, p1, Lcom/anilab/exoplayer/StyledPlayerView;->j:LQ2/D;

    .line 18
    .line 19
    invoke-virtual {v0}, LQ2/D;->f()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_1

    .line 24
    .line 25
    invoke-virtual {p1, v1}, Lcom/anilab/exoplayer/StyledPlayerView;->d(Z)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    iget-boolean p1, p1, Lcom/anilab/exoplayer/StyledPlayerView;->A:Z

    .line 30
    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    invoke-virtual {v0}, LQ2/D;->e()V

    .line 34
    .line 35
    .line 36
    :cond_2
    :goto_0
    return v1
    .line 37
    .line 38
.end method
