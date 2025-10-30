.class public final Lcom/google/android/gms/internal/cast/z;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Ly4/b;


# instance fields
.field public final a:J

.field public final b:LT4/d;

.field public final c:Lcom/google/android/gms/internal/cast/L;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ly4/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "AnalyticsConsent"

    .line 5
    .line 6
    invoke-direct {v0, v2, v1}, Ly4/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/google/android/gms/internal/cast/z;->d:Ly4/b;

    .line 10
    .line 11
    return-void
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

.method public constructor <init>(Landroid/content/Context;J)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/google/android/gms/internal/cast/L;

    .line 5
    .line 6
    new-instance v4, Lcom/google/android/gms/internal/cast/O;

    .line 7
    .line 8
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    sget-object v5, LC4/i;->c:LC4/i;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    sget-object v3, Lcom/google/android/gms/internal/cast/J;->c:LA1/g;

    .line 15
    .line 16
    move-object v1, p1

    .line 17
    invoke-direct/range {v0 .. v5}, LC4/j;-><init>(Landroid/content/Context;Li0/y;LA1/g;LC4/b;LC4/i;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/google/android/gms/internal/cast/z;->c:Lcom/google/android/gms/internal/cast/L;

    .line 21
    .line 22
    iput-wide p2, p0, Lcom/google/android/gms/internal/cast/z;->a:J

    .line 23
    .line 24
    new-instance p1, LT4/d;

    .line 25
    .line 26
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    const/4 p3, 0x4

    .line 31
    invoke-direct {p1, p2, p3}, LT4/d;-><init>(Landroid/os/Looper;I)V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lcom/google/android/gms/internal/cast/z;->b:LT4/d;

    .line 35
    .line 36
    return-void
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
