.class public final LQ3/k;
.super LP3/b;
.source "SourceFile"


# instance fields
.field public final synthetic d:I

.field public final e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LQ3/j;JJ)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LQ3/k;->d:I

    .line 3
    invoke-direct {p0, p2, p3, p4, p5}, LP3/b;-><init>(JJ)V

    .line 4
    iput-object p1, p0, LQ3/k;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LX3/b;I)V
    .locals 4

    const/4 v0, 0x1

    iput v0, p0, LQ3/k;->d:I

    int-to-long v0, p2

    .line 1
    iget p2, p1, LX3/b;->k:I

    add-int/lit8 p2, p2, -0x1

    int-to-long v2, p2

    invoke-direct {p0, v0, v1, v2, v3}, LP3/b;-><init>(JJ)V

    .line 2
    iput-object p1, p0, LQ3/k;->e:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final c()J
    .locals 4

    .line 1
    iget v0, p0, LQ3/k;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LQ3/k;->h()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    iget-wide v2, p0, LP3/b;->c:J

    .line 11
    .line 12
    long-to-int v2, v2

    .line 13
    iget-object v3, p0, LQ3/k;->e:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, LX3/b;

    .line 16
    .line 17
    invoke-virtual {v3, v2}, LX3/b;->b(I)J

    .line 18
    .line 19
    .line 20
    move-result-wide v2

    .line 21
    add-long/2addr v2, v0

    .line 22
    return-wide v2

    .line 23
    :pswitch_0
    invoke-virtual {p0}, LP3/b;->a()V

    .line 24
    .line 25
    .line 26
    iget-wide v0, p0, LP3/b;->c:J

    .line 27
    .line 28
    iget-object v2, p0, LQ3/k;->e:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v2, LQ3/j;

    .line 31
    .line 32
    invoke-virtual {v2, v0, v1}, LQ3/j;->c(J)J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    return-wide v0

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final h()J
    .locals 3

    .line 1
    iget v0, p0, LQ3/k;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LP3/b;->a()V

    .line 7
    .line 8
    .line 9
    iget-wide v0, p0, LP3/b;->c:J

    .line 10
    .line 11
    long-to-int v0, v0

    .line 12
    iget-object v1, p0, LQ3/k;->e:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, LX3/b;

    .line 15
    .line 16
    iget-object v1, v1, LX3/b;->o:[J

    .line 17
    .line 18
    aget-wide v0, v1, v0

    .line 19
    .line 20
    return-wide v0

    .line 21
    :pswitch_0
    invoke-virtual {p0}, LP3/b;->a()V

    .line 22
    .line 23
    .line 24
    iget-wide v0, p0, LP3/b;->c:J

    .line 25
    .line 26
    iget-object v2, p0, LQ3/k;->e:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v2, LQ3/j;

    .line 29
    .line 30
    invoke-virtual {v2, v0, v1}, LQ3/j;->d(J)J

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    return-wide v0

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
