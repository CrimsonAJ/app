.class public final Lcom/google/android/gms/internal/cast/t0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final q:Ly4/b;

.field public static r:J


# instance fields
.field public final a:Lcom/google/android/gms/internal/cast/g;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:J

.field public e:I

.field public f:Ljava/lang/String;

.field public g:I

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public j:Ljava/lang/String;

.field public k:Ljava/lang/String;

.field public l:Ljava/lang/String;

.field public m:Ljava/lang/String;

.field public n:I

.field public o:Z

.field public p:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ly4/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "ApplicationAnalyticsSession"

    .line 5
    .line 6
    invoke-direct {v0, v2, v1}, Ly4/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/google/android/gms/internal/cast/t0;->q:Ly4/b;

    .line 10
    .line 11
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    sput-wide v0, Lcom/google/android/gms/internal/cast/t0;->r:J

    .line 16
    .line 17
    return-void
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

.method public constructor <init>(Lcom/google/android/gms/internal/cast/g;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/cast/t0;->h:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/cast/t0;->i:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/cast/t0;->j:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/cast/t0;->k:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/cast/t0;->l:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/cast/t0;->m:Ljava/lang/String;

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/cast/t0;->n:I

    sget-wide v0, Lcom/google/android/gms/internal/cast/t0;->r:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/cast/t0;->d:J

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/cast/t0;->e:I

    iput-object p1, p0, Lcom/google/android/gms/internal/cast/t0;->a:Lcom/google/android/gms/internal/cast/g;

    return-void
.end method
