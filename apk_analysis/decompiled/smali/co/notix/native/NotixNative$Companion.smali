.class public final Lco/notix/native/NotixNative$Companion;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/notix/native/NotixNative;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/notix/native/NotixNative;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# static fields
.field static final synthetic $$INSTANCE:Lco/notix/native/NotixNative$Companion;


# instance fields
.field private final synthetic $$delegate_0:Lco/notix/native/NotixNative;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/notix/native/NotixNative$Companion;

    invoke-direct {v0}, Lco/notix/native/NotixNative$Companion;-><init>()V

    sput-object v0, Lco/notix/native/NotixNative$Companion;->$$INSTANCE:Lco/notix/native/NotixNative$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lco/notix/wq;->v()Lco/notix/xg;

    move-result-object v0

    iput-object v0, p0, Lco/notix/native/NotixNative$Companion;->$$delegate_0:Lco/notix/native/NotixNative;

    return-void
.end method


# virtual methods
.method public click(Lco/notix/native/NativeData;)V
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "nativeData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/notix/native/NotixNative$Companion;->$$delegate_0:Lco/notix/native/NotixNative;

    invoke-interface {v0, p1}, Lco/notix/native/NotixNative;->click(Lco/notix/native/NativeData;)V

    return-void
.end method

.method public createLoader(J)Lco/notix/native/NativeLoader;
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .line 1
    iget-object v0, p0, Lco/notix/native/NotixNative$Companion;->$$delegate_0:Lco/notix/native/NotixNative;

    invoke-interface {v0, p1, p2}, Lco/notix/native/NotixNative;->createLoader(J)Lco/notix/native/NativeLoader;

    move-result-object p1

    return-object p1
.end method

.method public createLoader(JLco/notix/domain/RequestVars;)Lco/notix/native/NativeLoader;
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .line 2
    iget-object v0, p0, Lco/notix/native/NotixNative$Companion;->$$delegate_0:Lco/notix/native/NotixNative;

    invoke-interface {v0, p1, p2, p3}, Lco/notix/native/NotixNative;->createLoader(JLco/notix/domain/RequestVars;)Lco/notix/native/NativeLoader;

    move-result-object p1

    return-object p1
.end method

.method public createLoader(JLco/notix/domain/RequestVars;Ljava/lang/Integer;)Lco/notix/native/NativeLoader;
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .line 3
    iget-object v0, p0, Lco/notix/native/NotixNative$Companion;->$$delegate_0:Lco/notix/native/NotixNative;

    invoke-interface {v0, p1, p2, p3, p4}, Lco/notix/native/NotixNative;->createLoader(JLco/notix/domain/RequestVars;Ljava/lang/Integer;)Lco/notix/native/NativeLoader;

    move-result-object p1

    return-object p1
.end method

.method public createLoader(JLjava/lang/Integer;)Lco/notix/native/NativeLoader;
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .line 4
    iget-object v0, p0, Lco/notix/native/NotixNative$Companion;->$$delegate_0:Lco/notix/native/NotixNative;

    invoke-interface {v0, p1, p2, p3}, Lco/notix/native/NotixNative;->createLoader(JLjava/lang/Integer;)Lco/notix/native/NativeLoader;

    move-result-object p1

    return-object p1
.end method

.method public trackImpression(Lco/notix/native/NativeData;)V
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "nativeData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/notix/native/NotixNative$Companion;->$$delegate_0:Lco/notix/native/NotixNative;

    invoke-interface {v0, p1}, Lco/notix/native/NotixNative;->trackImpression(Lco/notix/native/NativeData;)V

    return-void
.end method
