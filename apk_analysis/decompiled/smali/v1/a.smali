.class public final Lv1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lx8/y;

.field public b:Lx8/u;

.field public c:D

.field public d:J

.field public e:J

.field public f:Lf8/d;


# virtual methods
.method public final a()Lv1/h;
    .locals 12

    .line 1
    iget-object v5, p0, Lv1/a;->a:Lx8/y;

    .line 2
    .line 3
    if-eqz v5, :cond_1

    .line 4
    .line 5
    iget-wide v0, p0, Lv1/a;->c:D

    .line 6
    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    cmpl-double v2, v0, v2

    .line 10
    .line 11
    if-lez v2, :cond_0

    .line 12
    .line 13
    :try_start_0
    invoke-virtual {v5}, Lx8/y;->f()Ljava/io/File;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v2}, Ljava/io/File;->mkdir()Z

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    new-instance v3, Landroid/os/StatFs;

    .line 25
    .line 26
    invoke-direct {v3, v2}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3}, Landroid/os/StatFs;->getBlockCountLong()J

    .line 30
    .line 31
    .line 32
    move-result-wide v6

    .line 33
    long-to-double v6, v6

    .line 34
    mul-double/2addr v0, v6

    .line 35
    invoke-virtual {v3}, Landroid/os/StatFs;->getBlockSizeLong()J

    .line 36
    .line 37
    .line 38
    move-result-wide v2

    .line 39
    long-to-double v2, v2

    .line 40
    mul-double/2addr v0, v2

    .line 41
    double-to-long v6, v0

    .line 42
    iget-wide v8, p0, Lv1/a;->d:J

    .line 43
    .line 44
    iget-wide v10, p0, Lv1/a;->e:J

    .line 45
    .line 46
    invoke-static/range {v6 .. v11}, LB6/u0;->l(JJJ)J

    .line 47
    .line 48
    .line 49
    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    goto :goto_0

    .line 51
    :catch_0
    iget-wide v0, p0, Lv1/a;->d:J

    .line 52
    .line 53
    :goto_0
    move-wide v1, v0

    .line 54
    goto :goto_1

    .line 55
    :cond_0
    const-wide/16 v0, 0x0

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :goto_1
    new-instance v0, Lv1/h;

    .line 59
    .line 60
    iget-object v4, p0, Lv1/a;->b:Lx8/u;

    .line 61
    .line 62
    iget-object v3, p0, Lv1/a;->f:Lf8/d;

    .line 63
    .line 64
    invoke-direct/range {v0 .. v5}, Lv1/h;-><init>(JLf8/d;Lx8/u;Lx8/y;)V

    .line 65
    .line 66
    .line 67
    return-object v0

    .line 68
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 69
    .line 70
    const-string v1, "directory == null"

    .line 71
    .line 72
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw v0
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
